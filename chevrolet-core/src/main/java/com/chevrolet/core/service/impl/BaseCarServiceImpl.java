package com.chevrolet.core.service.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.LimitCarQuery;
import com.chevrolet.api.dto.request.BaseCarQueryReq;
import com.chevrolet.api.dto.request.BaseCarReq;
import com.chevrolet.api.service.BaseCarService;
import com.chevrolet.core.annotation.CarInfoHisLogger;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.ao.CarSearchAO;
import com.chevrolet.core.annotation.RefactorLogAdvice;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.core.utils.CollectionUtil;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.query.CarQuery;
import com.chevrolet.dal.dao.manager.CarLoanManager;
import com.chevrolet.dal.dao.manager.CarManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.koenigsegg.dubbo.CarSupervisionService;
import com.koenigsegg.dubbo.dto.CarSupervisionDetailDTO;
import com.subaru.common.entity.APIResult;
import com.subaru.common.entity.BizResult;
import com.subaru.common.entity.ErrorCodeEnum;
import com.subaru.common.enums.IsDeletedEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author suclogger
 * @date 2017/5/16
 */
@Component
@Slf4j
@Service(interfaceClass = BaseCarService.class)
public class BaseCarServiceImpl implements BaseCarService {

    @Autowired
    private CarManager carManager;

    @Autowired
    private CarLoanManager carLoanManager;

    @Autowired
    private CarAO carAO;

    @Autowired
    private CarSearchAO carSearchAO;

//    @Autowired
//    private CarSupervisionService carSupervisionService;

    private BaseCarDTO getUniqueCarDTO(Long carId) {
        CarQuery carQuery = new CarQuery();
        carQuery.or().andCarIdEqualTo(carId).andIsDeletedEqualTo(/** 未被删除 **/0);
        List<CarDO> carDOs = carManager.selectByQuery(carQuery);
        if (!CollectionUtils.isEmpty(carDOs)) {
            CarDO carDO = carDOs.get(0);
            if (carDO != null) {
                try {
                    BaseCarDTO baseCarDTO = (BaseCarDTO) BeanUtil.copyPorp2DO(BaseCarDTO.class, carDO);
                    return baseCarDTO;
                } catch (RuntimeException e) {
                    log.error("copy bean property error : {} ", e);
                }
            }
        }
        return null;
    }

    @Override
    public APIResult<BaseCarDTO> getCarById(Long carId) {
        if (carId == null || carId < 1L) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            BaseCarDTO baseCarDTO = getUniqueCarDTO(carId);
            if (baseCarDTO != null) {
                return APIResult.create(baseCarDTO);
            } else {
                return APIResult.create(ErrorCodeEnum.NO_DATA);
            }

        } catch (RuntimeException e) {
            log.error("查询car数据异常，参数：{}, 异常：{}", carId, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public APIResult<Map<Long, BaseCarDTO>> getCarsByIds(List<Long> carIds) {
        if (CollectionUtils.isEmpty(carIds)) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            List<CarDO> carDOS = carAO.getCarsByIds(carIds);
            Map<Long, BaseCarDTO> resultMap = new HashMap<>();
            if (carDOS != null && !CollectionUtils.isEmpty(carDOS)) {
                carDOS.forEach(carDO -> resultMap.put(carDO.getCarId(), (BaseCarDTO) BeanUtil.copyPorp2DO(BaseCarDTO.class, carDO)));
            }
            return APIResult.create(resultMap);
        } catch (Exception e) {
            log.error("查询car数据异常，参数：{}, 异常：{}", carIds, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public APIResult<Long> addBaseCar(BaseCarDTO baseCarDTO) {
        try {
            return APIResult.create(carAO.saveCarDTO(baseCarDTO));
        } catch (Exception e) {
            log.error("添加车辆信息异常，参数：{}, 异常：{}", baseCarDTO, e);
        }
        return APIResult.create(ErrorCodeEnum.INSERT_FAIL);
    }

    @Override
    @RefactorLogAdvice
    public APIResult<List<Long>> batchSaveCarDTO(BaseCarDTO baseCarDTO, Integer carNumber) {
        try {
            return APIResult.create(carAO.batchSaveCarDTO(baseCarDTO, carNumber));
        } catch (Exception e) {
            log.error("批量保存基础车辆信息异常，参数：{},{}, 异常：{}", baseCarDTO, carNumber, e);
        }
        return APIResult.create(ErrorCodeEnum.INSERT_FAIL);
    }

    @Override
    @Transactional
    @CarInfoHisLogger
    public APIResult<Boolean> updateBaseCar(BaseCarDTO baseCarDTO) {
        if (baseCarDTO.getCarId() == null || baseCarDTO.getCarId() < 1L) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), "车辆ID为空");
        }
        CarDO carDO = carManager.selectByPrimaryKey(baseCarDTO.getCarId());
        if (carDO == null) {
            return APIResult.create(ErrorCodeEnum.QUERY_FAIL.getErrCode(), "找不到对应车辆");
        }
        try {
            carAO.saveCarDTO(baseCarDTO);
            return APIResult.create(true);
        } catch (BeansException e) {
            log.error("更新车辆信息异常，参数：{}, 异常：{}", baseCarDTO, e);
        }
        return APIResult.create(ErrorCodeEnum.UPDATE_FAIL);
    }

    @Override
    public BizResult<List<BaseCarDTO>> diyCarView(BaseCarReq req) {
        try {
            // TODO 有性能问题，可能全表扫描
            CarQuery carQuery = new CarQuery();
            CarQuery.Criteria criteria = carQuery.or().andModelIdEqualTo(Long.valueOf(-1));
            if (req != null && CollectionUtils.isNotEmpty(req.getCarIds())) {//带查询索引
                criteria.andCarIdIn(req.getCarIds());
            }
            if (req != null) {
                carQuery.setPageSize(req.getPageSize());
                carQuery.setPageOffset(req.getPageOffset());
            }

            List<CarDO> carDOS = carManager.selectByQuery(carQuery);
            int totalCount = carManager.countByQuery(carQuery);
            if (CollectionUtils.isNotEmpty(carDOS)) {
                List<BaseCarDTO> list = Lists.newArrayList();
                for (CarDO carDO : carDOS) {
                    BaseCarDTO baseCarDTO = new BaseCarDTO();
                    BeanUtils.copyProperties(carDO, baseCarDTO);
                    list.add(baseCarDTO);
                }
                BizResult<List<BaseCarDTO>> result = BizResult.create(list);
                result.setTotalCount(totalCount);
                return result;
            }
        } catch (Exception e) {
            log.error("查询自定义车辆信息异常，参数：{}, 异常：{}", req, e);
        }
        return BizResult.create(ErrorCodeEnum.NO_DATA);
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarUnique(String carUnique) {
        if (StringUtils.isBlank(carUnique)) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), "carUnique不能为空");
        }
        try {
            List<BaseCarDTO> resultList = carSearchAO.queryCarDetailPagination(null, null, carUnique, null,
                    null, null, null, null, null);
            return APIResult.create(resultList);
        } catch (Exception e) {
            log.error("查询车辆信息异常，参数：{}，异常：{}", carUnique, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarUniques(List<String> carUniques) {
        if (CollectionUtils.isEmpty(carUniques)) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), "carUniques不能为空");
        }
        try {
            CarQuery query = new CarQuery();
            query.or().andCarUniqueIn(carUniques).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
            List<CarDO> list = carManager.selectByQuery(query);
            List<BaseCarDTO> resultList = Lists.transform(list, carDO -> (BaseCarDTO) BeanUtil.copyPorp2DO(BaseCarDTO.class,carDO));
            try {
                if(CollectionUtils.isNotEmpty(resultList) && resultList.size() > 3000){
                    log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carUniques));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return APIResult.create(resultList);
        } catch (Exception e) {
            log.error("查询carId数据异常，参数：{}，异常：{}", carUniques, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarIds(List<Long> carIds) {
        if (CollectionUtils.isEmpty(carIds)) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            CarQuery query = new CarQuery();
            query.or().andCarIdIn(carIds).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
            List<CarDO> list = carManager.selectByQuery(query);
            List<BaseCarDTO> resultList = Lists.transform(list, carDO -> (BaseCarDTO) BeanUtil.copyPorp2DO(BaseCarDTO.class,carDO));
            try {
                if(CollectionUtils.isNotEmpty(resultList) && resultList.size() > 3000){
                    log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarIds param={}", JSON.toJSONString(carIds));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return APIResult.create(resultList);
        } catch (Exception e) {
            log.error("查询车辆数据异常，参数：{}，异常：{}", carIds, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByFuzzyCarUnique(String fuzzyCarUnique) {
        if (StringUtils.isBlank(fuzzyCarUnique)) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            fuzzyCarUnique = fuzzyCarUnique.replaceAll("%", "");
            List<BaseCarDTO> resultList = new ArrayList<>();
            if (StringUtils.isNotBlank(fuzzyCarUnique)) {
                resultList = carSearchAO.queryCarDetailPagination(null, null, fuzzyCarUnique, null,
                        null, null, null, null, null);
            }
            try {
                if(CollectionUtils.isNotEmpty(resultList) && resultList.size() > 3000){
                    log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByFuzzyCarUnique param={}", JSON.toJSONString(fuzzyCarUnique));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return APIResult.create(resultList);
        } catch (Exception e) {
            log.error("查询车辆数据异常，参数：{}，异常：{}", fuzzyCarUnique, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public APIResult<List<BaseCarDTO>> queryCarsByQueryReq(BaseCarQueryReq input) {

        try {
            List<BaseCarDTO> resultList = carAO.queryCarsByQueryReq(input.getCarIds(),
                    input.getAssetRight(),input.getAssetRightType().getCode(),input.getFuzzyCarUnique(),input.getFuzzyModelName(),null,null);
            try {
                if(CollectionUtils.isNotEmpty(resultList) && resultList.size() > 3000){
                    log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 queryCarsByQueryReq param={}", JSON.toJSONString(input));
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return APIResult.create(resultList);
        } catch (Exception e){
            log.error("BaseCarService queryCarsByQueryReq baseCarQueryReq={}，异常：{}", JSON.toJSONString(input),e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    public APIResult<Boolean> batchUpdateByCarIds(BaseCarDTO baseCarDTO, List<Long> carIds) {
        try {
            CarDO carDO = BeanUtil.copyPorp2DO(CarDO.class, baseCarDTO);
            return APIResult.create(carAO.batchUpdateByCarIds(carDO, carIds));
        } catch (Exception e) {
            log.error("BaseCarService batchUpdateByCarIds baseCarDTO={}，carIds={} 异常：{}", JSON.toJSONString(baseCarDTO),
                    JSON.toJSONString(carIds), e);
        }
        return APIResult.create(ErrorCodeEnum.UPDATE_FAIL);
    }


    /**
     * 获取从fromCarId开始的n条记录
     *
     * @param carQuery
     * @return
     */
    @Override
    public APIResult<List<Long>> queryLimitCar(LimitCarQuery carQuery) {
        log.info("CarSearchService queryLimitCar : {}", JSON.toJSONString(carQuery));
        if (carQuery.getPageSize() == null || carQuery.getFromCarId() == null || carQuery.getUserId() == null) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            return APIResult.create(carAO.queryLimitCar(carQuery));
        } catch (Exception e) {
            log.error("车辆中心获取n条记录失败，carQuery={} e={}", JSON.toJSONString(carQuery), e);
            return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }

    @Override
    @RefactorLogAdvice
    public APIResult<List<BaseCarDTO>> getCarsByCarIdsIncludeDeleted(List<Long> carIds) {
        if (CollectionUtils.isEmpty(carIds)) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR);
        }
        try {
            CarQuery query = new CarQuery();
            query.createCriteria().andCarIdIn(carIds);
            List<CarDO> carDOS = carManager.selectByQuery(query);
            List<BaseCarDTO> resultList = Lists.transform(carDOS, carDO -> BeanUtil.copyPorp2DO(BaseCarDTO.class, carDO));
            return APIResult.create(resultList);
        } catch (Exception e) {
            log.error("查询车辆数据，包括已删除异常，参数：{}，异常：{}", carIds, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }

    @Override
    @RefactorLogAdvice
    public APIResult<List<BaseCarDTO>> getCarsByCarUniquesIncludeDeleted(List<String> carUniques) {
        if (CollectionUtils.isEmpty(carUniques)) {
            return APIResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), "carUniques不能为空");
        }
        try {
            CarQuery query = new CarQuery();
            query.or().andCarUniqueIn(carUniques);
            List<CarDO> list = carManager.selectByQuery(query);
            List<BaseCarDTO> resultList = Lists.transform(list, carDO -> (BaseCarDTO) BeanUtil.copyPorp2DO(BaseCarDTO.class, carDO));
            return APIResult.create(resultList);
        } catch (Exception e) {
            log.error("查询carId数据异常，参数：{}，异常：{}", carUniques, e);
        }
        return APIResult.create(ErrorCodeEnum.QUERY_FAIL);
    }
}
