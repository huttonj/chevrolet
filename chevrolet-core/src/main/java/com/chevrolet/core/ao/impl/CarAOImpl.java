package com.chevrolet.core.ao.impl;

import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.LimitCarQuery;
import com.chevrolet.api.enums.AssetRightInChangeEnum;
import com.chevrolet.api.enums.AssetRightTypeEnum;
import com.chevrolet.core.ao.*;
import com.chevrolet.core.mq.producer.AssetRightChgProducer;
import com.chevrolet.core.utils.AssembleUtil;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.dal.dao.domain.CarAssetChglogDO;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.query.CarQuery;
import com.chevrolet.dal.dao.manager.CarAssetChglogManager;
import com.chevrolet.dal.dao.manager.CarManager;
import com.google.common.collect.Lists;
import com.subaru.common.enums.IsDeletedEnum;
import com.subaru.common.query.BaseQuery;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wenruo
 * @date 2017/5/25.\
 */
@Slf4j
@Component
public class CarAOImpl implements CarAO {

    @Autowired
    private CarManager carManager;

    @Autowired
    private BrandAO brandAO;

    @Autowired
    private SeriesAO seriesAO;

    @Autowired
    private ModelAO modelAO;

    @Autowired
    private CarLoanOrderSearchAO carLoanOrderSearchAO;

    @Autowired
    private AssembleUtil assembleUtil;

    @Autowired
    private AssetRightChgProducer assetRightChgProducer;

    @Autowired
    private CarAssetChglogManager carAssetChglogManager;

    @Override
    public Long saveCarDTO(BaseCarDTO baseCarDTO) {
        log.info("CarAO saveCarDTO baseCarDTO={}",JSON.toJSONString(baseCarDTO));
        CarDO carDO = assembleUtil.assembleCarDO(baseCarDTO);
        if(carDO.getCarId() == null || carDO.getCarId() < 0) {
            carManager.insertSelective(carDO);
        } else {
            if(!StringUtils.isEmpty(baseCarDTO.getCarUnique())) {
                log.info("update vin form car:{}, new vin: {}", carDO.getCarId(), baseCarDTO.getCarUnique());
            }
            carDO.setIsDeleted(IsDeletedEnum.NOT_DELETED.getCode());
            carManager.updateByPrimaryKeySelective(carDO);
        }
        return carDO.getCarId();
    }

    @Override
    public List<Long> batchSaveCarDTO(BaseCarDTO baseCarDTO, Integer carNumber) {
        CarDO carDO = assembleUtil.assembleCarDO(baseCarDTO);
        List<CarDO> carDOS = new ArrayList<>();
        for(int i =0; i < carNumber; i++) {
            CarDO carTmp = (CarDO) BeanUtil.copyPorp2DO(CarDO.class, carDO);
            carDOS.add(carTmp);
        }
        Integer count = carManager.batchInsert(carDOS);
        log.info("batch insert carDO count : {}", count);
        return carDOS.stream().map(tmp -> tmp.getCarId()).collect(Collectors.toList());
    }

    @Override
    public BaseCarDTO getCarDTOById(Long carId) {
        if(carId == null || carId < 0) {
            return null;
        }
        CarDO carDO = carManager.selectByPrimaryKey(carId);
        if(carDO != null) {
            BaseCarDTO baseCarDTO = (BaseCarDTO)BeanUtil.copyPorp2DO(BaseCarDTO.class, carDO);
            if(!StringUtils.isEmpty(carDO.getImgDamage())) {
                baseCarDTO.setImgDamage(Arrays.asList(carDO.getImgDamage().split(",")));
            }
            return baseCarDTO;
        }
        return null;
    }

    @Override
    public Map<Long, CarDO> getCarDOMapByCarIdList(List<Long> carIdList) {
        Map<Long, CarDO> resultMap = new HashMap<>();

        if (!CollectionUtils.isEmpty(carIdList)) {
            List<CarDO> carDOList = carManager.selectByCarIds(carIdList);
            for (CarDO carDO : carDOList) {
                resultMap.put(carDO.getCarId(), carDO);
            }
        }

        return resultMap;
    }

    @Override
    public List<CarDO> getCarDOListByCarIdList(List<Long> carIdList) {
        if (CollectionUtils.isEmpty(carIdList)) {
            return new LinkedList<>();
        }

        return carManager.selectByCarIds(carIdList);
    }

    @Override
    public List<CarDO> getCarDOsByCarUnique(String carUnique) {
        List<CarDO> carDOS = Lists.newArrayList();
        CarQuery carQuery = new CarQuery();
        CarQuery.Criteria criteria = carQuery.or();
        if(carUnique.contains("%")) {
            carUnique = carUnique.replaceAll("%","");
            if(StringUtils.isNotBlank(carUnique)) {
                List<Long> carIds = carLoanOrderSearchAO.queryCarIdsByFuzzyField(null, carUnique, null);
                if(!CollectionUtils.isEmpty(carIds)){
                    log.info("CarAO getCarDOsByCarUnique infiniti查询结果 carId={}", JSON.toJSONString(carIds));
                    criteria.andCarIdIn(carIds);
                    carDOS = carManager.selectByQuery(carQuery);
                }
            }
        } else {
            criteria.andCarUniqueEqualTo(carUnique);
            carDOS = carManager.selectByQuery(carQuery);
        }
        return carDOS;
    }

    @Override
    public List<CarDO> getCarDOsByCarUniques(List<String> carUniques) {
        CarQuery carQuery = new CarQuery();
        carQuery.or().andCarUniqueIn(carUniques);
        List<CarDO> carDOS = carManager.selectByQuery(carQuery);
        if(null == carDOS) {
            return new ArrayList<>();
        }
        return carDOS;
    }

    @Override
    public List<Long> getCarIdsByCarUnique(String carUnique) {
        List<CarDO> carDOS = getCarDOsByCarUnique(carUnique);
        return carDOS.stream().map(carDO -> carDO.getCarId()).collect(Collectors.toList());
    }

    @Override
    public CarDO getCarById(Long carId) {
        return carManager.selectByPrimaryKey(carId);
    }

    @Override
    public List<CarDO> getCarsByIds(List<Long> carIds) {
        CarQuery query = new CarQuery();
        query.or().andCarIdIn(carIds).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        return carManager.selectByQuery(query);
    }

    @Override
    public List<CarDO> getAllCarsByIds(List<Long> carIds) {
        CarQuery query = new CarQuery();
        query.or().andCarIdIn(carIds);
        return carManager.selectByQuery(query);
    }

    @Override
    public Integer alterCarAssetRightInChange(Integer inChangeStatus, List<Long> carIds){
        CarDO carDO = new CarDO();
        carDO.setAssetRightInChange(inChangeStatus);
        return carManager.batchUpdateByCarIds(carDO,carIds);
    }

    @Override
    public  List<BaseCarDTO> queryCarsByQueryReq(List<Long> carIds){
        return this.queryCarsByQuery(carIds,null,null,null,null,null, null);
    }


    @Override
    public  List<BaseCarDTO> queryCarsByQueryReq(Long assetRight, Integer assetRightType){
        return this.queryCarsByQuery(null,assetRight,assetRightType,null,null,null, null);
    }

    @Override
    public  List<BaseCarDTO> queryCarsByQueryReq(List<Long> carIds, Long assetRight, Integer assetRightType,
                                                 String fuzzyCarunique, String fuzzyModelName, Integer pageSize, Integer pageOffset){
        return this.queryCarsByQuery(carIds,assetRight,assetRightType,fuzzyCarunique,fuzzyModelName,pageSize,pageOffset);
    }

    private List<BaseCarDTO> queryCarsByQuery(List<Long> carIds, Long assetRight, Integer assetRightType,
                                              String fuzzyCarunique, String fuzzyModelName, Integer pageSize, Integer pageOffset){
        CarQuery carQuery = new CarQuery();
        CarQuery.Criteria criteria = carQuery.or().andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        if(!CollectionUtils.isEmpty(carIds)){
            criteria.andCarIdIn(carIds);
        }

        if(assetRight != null && assetRightType != null){
            criteria.andAssetRightEqualTo(assetRight).andAssetRightTypeEqualTo(assetRightType);
        }

        if(fuzzyCarunique != null){
            criteria.andCarUniqueLike(fuzzyCarunique);
        }

        if(fuzzyModelName != null){
            criteria.andModelNameLike(fuzzyModelName);
        }

        if(pageSize != null && pageOffset != null){
            carQuery.setPageOffset(pageOffset);
            carQuery.setPageSize(pageSize);
        }
        return BeanUtil.copyPorp2DOs(BaseCarDTO.class, carManager.selectByQuery(carQuery),(baseCarDTO,carDO) ->{
            if (com.alibaba.dubbo.common.utils.StringUtils.isNotEmpty(carDO.getImgDamage())) {
                baseCarDTO.setImgDamage(Arrays.asList(carDO.getImgDamage().split(",")));
            }
        });
    }

    @Override
    public Integer updateAssetRightByCarIds(CarDO carDO, List<Long> carIds, Long oldAssetRight, Integer oldAssetRightType){
        Integer count = carManager.updateAssetRightByCarIds(carDO,carIds,oldAssetRight,oldAssetRightType);
        try {
            if(count > 0) {
                try {
                    if(!CollectionUtils.isEmpty(carIds)){
                        List<CarAssetChglogDO> carAssetChglogDOS = Lists.newArrayList();
                        for (Long carId : carIds) {
                            CarAssetChglogDO carAssetChglogDO = new CarAssetChglogDO();
                            carAssetChglogDO.setNid(carDO.getAssetRight());
                            carAssetChglogDO.setNType(carDO.getAssetRightType());
                            carAssetChglogDO.setOid(oldAssetRight);
                            carAssetChglogDO.setOType(oldAssetRightType);
                            carAssetChglogDO.setCarId(carId);
                            carAssetChglogDOS.add(carAssetChglogDO);
                        }
                        carAssetChglogManager.batchInsert(carAssetChglogDOS);
                    }
                } catch (Exception e) {
                    log.error("CarAssetAO transferAsset 记录物权变更日志失败 e={}", e);
                }
                try {
                    //物权变更是发送topic消息
                    assetRightChgProducer.sendCarAssetChgMessage(carIds, oldAssetRight, oldAssetRightType, carDO.getAssetRight(), carDO.getAssetRightType());
                } catch (Exception e){
                    log.error("CarAssetAO transferAsset 物权变更发送topic消息失败 e={}", e);
                }
            }
        } catch (Exception e){
            log.error("物权变更时发送topic消息失败 e={} ",e);
        }
        return count;
    }

    @Override
    public Boolean existCarInChange(List<Long> carIds){
        CarQuery carQuery = new CarQuery();
        carQuery.or().andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode()).andCarIdIn(carIds)
                .andAssetRightInChangeEqualTo(AssetRightInChangeEnum.IN_CHANGE.getCode());
        return carManager.countByQuery(carQuery) > 0;
    }

    @Override
    public Boolean batchUpdateByCarIds(CarDO carDO, List<Long> carIds){
       int count =  carManager.batchUpdateByCarIds(carDO,carIds);
       if(count > 0){
           return true;
       }
       return false;
    }

    /**
     * 获取n条记录
     *
     * @param limitCarQuery
     * @return
     */
    @Override
    public List<Long> queryLimitCar(LimitCarQuery limitCarQuery) {
        CarQuery carQuery = new CarQuery();
        carQuery.createCriteria().anCarIdGreaterThan(limitCarQuery.getFromCarId())
                .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode())
                .andAssetRightEqualTo(limitCarQuery.getUserId())
                .andAssetRightTypeEqualTo(AssetRightTypeEnum.PERSONAL.getCode());
        if (limitCarQuery.getPartnerId() != null) {
            carQuery.or().anCarIdGreaterThan(limitCarQuery.getFromCarId())
                    .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode())
                    .andAssetRightEqualTo(limitCarQuery.getPartnerId())
                    .andAssetRightTypeEqualTo(AssetRightTypeEnum.ENTERPRISE.getCode());
        }
        carQuery.setPageNo(BaseQuery.DEFAULT_PAGE);
        carQuery.setPageSize(limitCarQuery.getPageSize());
        carQuery.setOrderByClause("car_id asc");

        List<CarDO> list = carManager.selectByQuery(carQuery);
        if (CollectionUtils.isEmpty(list)) {
            return Lists.newArrayList();
        }
        return Lists.transform(list, CarDO::getCarId);
    }

}
