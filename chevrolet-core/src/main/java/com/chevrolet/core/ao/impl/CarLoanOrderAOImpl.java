package com.chevrolet.core.ao.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.CarLoanOrderDetailDTO;
import com.chevrolet.api.enums.CarSourceEnum;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.ao.CarLoanOrderAO;
import com.chevrolet.core.ao.CarLoanOrderSearchAO;
import com.chevrolet.core.utils.AssembleUtil;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.domain.query.CarLoanQuery;
import com.chevrolet.dal.dao.manager.CarLoanManager;
import com.chevrolet.dal.dao.manager.CarManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.infiniti.search.constants.SearchSortTypeConstants;
import com.infiniti.search.dto.*;
import com.infiniti.search.service.CarLoanSearchService;
import com.subaru.common.enums.IsDeletedEnum;
import com.subaru.common.enums.carcenter.FpCarStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

import static com.infiniti.search.constants.CarLoanIndexFieldNameConstants.*;
import static com.infiniti.search.util.SearchConditionUtil.*;

/**
 * Created by maihe on 2017/5/16.
 */
@Component
@Slf4j
public class CarLoanOrderAOImpl implements CarLoanOrderAO {

    @Autowired
    private CarAO carAO;

    @Autowired
    private CarManager carManager;

    @Autowired
    private CarLoanManager carLoanManager;

    @Autowired
    private CarLoanSearchService carLoanSearchService;

    @Autowired
    private CarLoanOrderSearchAO carLoanOrderSearchAO;

    @Autowired
    private AssembleUtil assembleUtil;

    public static final String DELIMITER = ",";

    @Override
    public Long insertCarInfo(CarLoanOrderDetailDTO carLoanOrderDetailDTO) {
        // 判断车辆来源
        if (carLoanOrderDetailDTO.getCarSource() == null) {
            if (carLoanOrderDetailDTO.getLoanOrderType() == null) {
                carLoanOrderDetailDTO.setCarSource(CarSourceEnum.FINANCE_COMMON.getCode());
            } else {
                carLoanOrderDetailDTO.setCarSource(Integer.valueOf("10" + carLoanOrderDetailDTO.getLoanOrderType()));
            }
        }

        Long carId = carAO.saveCarDTO(carLoanOrderDetailDTO);

        CarLoanDO carLoanDO = (CarLoanDO) BeanUtil.copyPorp2DO(CarLoanDO.class, carLoanOrderDetailDTO);
        carLoanDO.setCarId(carId);
        if (!CollectionUtils.isEmpty(carLoanOrderDetailDTO.getImgFormality())) {
            carLoanDO.setImgFormality(StringUtils.join(carLoanOrderDetailDTO.getImgFormality(), DELIMITER));
        }
        carLoanManager.insertSelective(carLoanDO);

        return carId;
    }

    @Override
    public Integer batchInsert(CarLoanOrderDetailDTO carLoanOrderDetailDTO, List<Long> carIds) {
        List<CarLoanDO> carLoanDOS = new ArrayList<>();
        CarLoanDO carLoanDO = (CarLoanDO) BeanUtil.copyPorp2DO(CarLoanDO.class, carLoanOrderDetailDTO);
        if (!CollectionUtils.isEmpty(carLoanOrderDetailDTO.getImgFormality())) {
            carLoanDO.setImgFormality(StringUtils.join(carLoanOrderDetailDTO.getImgFormality(), DELIMITER));
        }
        carIds.forEach(carId -> {
            CarLoanDO tmp = (CarLoanDO) BeanUtil.copyPorp2DO(CarLoanDO.class, carLoanDO);
            tmp.setCarId(carId);
            carLoanDOS.add(tmp);
        });
        Integer count = carLoanManager.batchInsert(carLoanDOS);
        log.info("batch insert carLoan , count {}", count);
        return count;
    }

//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailByOrderNos(List<String> carLoanOrderNos) {
//        return queryCarLoanOrderDetailByOrderNos(carLoanOrderNos, null,true);
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailByOrderNos(List<String> carLoanOrderNos,boolean delFilter) {
//        return queryCarLoanOrderDetailByOrderNos(carLoanOrderNos, null, delFilter);
//    }

//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailByOrderNos(List<String> carLoanOrderNOList, List<Integer> carStatusFilterList, boolean delFilter) {
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        CarLoanQuery.Criteria criteria = carLoanQuery.createCriteria();
//        criteria.andCarLoanOrderNoIn(carLoanOrderNOList);
//        if(delFilter) {
//            criteria.andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//        }
//        if (CollectionUtils.isNotEmpty(carStatusFilterList)) {
//            criteria.andCarStatusIn(carStatusFilterList);
//        }
//        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return this.genBusinessCarInfo(carLoanDOS);
//    }

//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailByOrderNosPagination(List<String> carLoanOrderNos, List<String> splitOrderNos, List<Long> carIds, Integer offset, Integer pageSize,boolean delFilter) {
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        CarLoanQuery.Criteria criteria = carLoanQuery.or();
//        if(delFilter) {
//            criteria.andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//        }
//        if (CollectionUtils.isNotEmpty(carLoanOrderNos)) {
//            criteria.andCarLoanOrderNoIn(carLoanOrderNos);
//        }
//        if (CollectionUtils.isNotEmpty(splitOrderNos)) {
//            criteria.andSplitOrderNoIn(splitOrderNos);
//        }
//
//        if (CollectionUtils.isNotEmpty(carIds)) {
//            criteria.andCarIdIn(carIds);
//        }
//        carLoanQuery.setPageSize(pageSize);
//        carLoanQuery.setPageOffset(offset);
//        carLoanQuery.setOrderByClause("car_loan_order_no desc,car_id asc");
//        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        //add totalCount
//        BusinessCarInfoDTO businessCarInfoDTO = this.genBusinessCarInfo(carLoanDOS);
//        businessCarInfoDTO.setTotalCount(carLoanManager.countByQuery(carLoanQuery));
//        return businessCarInfoDTO;
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryCarListByParamsPagination(CarListParamsQuery carListParamsQuery) {
//        //查询所有车辆明细
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        CarLoanQuery.Criteria criteria = carLoanQuery.or();
//        if (carListParamsQuery.getCarLoanOrderNo() != null) {
//            criteria.andCarLoanOrderNoEqualTo(carListParamsQuery.getCarLoanOrderNo());
//        }
//
//        // 根据车架号查询
//        if (!org.apache.commons.lang3.StringUtils.isEmpty(carListParamsQuery.getCarUnique())) {
//            List<Long> carIds = carAO.getCarIdsByCarUnique(carListParamsQuery.getCarUnique());
//            if (!CollectionUtils.isEmpty(carIds)) {
//                criteria.andCarIdIn(carIds);
//            }
//        }
//
//        // 车辆状态
//        if (carListParamsQuery.getCarStatus() != null) {
//            criteria.andCarStatusEqualTo(carListParamsQuery.getCarStatus());
//        }
//
//        //车辆id
//        if (carListParamsQuery.getCarId() != null) {
//            criteria.andCarIdEqualTo(carListParamsQuery.getCarId());
//        }
//
//        carLoanQuery.setPageSize(carListParamsQuery.getPageSize());
//        carLoanQuery.setPageOffset(carListParamsQuery.getPageOffset());
//
//        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        //add totalCount
//        BusinessCarInfoDTO businessCarInfoDTO = this.genBusinessCarInfo(carLoanDOS);
//        businessCarInfoDTO.setTotalCount(carLoanManager.countByQuery(carLoanQuery));
//
//        return businessCarInfoDTO;
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailByCarIds(List<Long> carIds) {
//        //查询所有车辆明细
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        carLoanQuery.or().andCarIdIn(carIds).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return this.genBusinessCarInfo(carLoanDOS);
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetail(List<Long> carIds, List<String> orderNos){
//        //查询所有车辆明细
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        CarLoanQuery.Criteria criteria = carLoanQuery.or();
//
//        if(CollectionUtils.isNotEmpty(carIds)){
//            criteria.andCarIdIn(carIds);
//        }
//        if(CollectionUtils.isNotEmpty(orderNos)){
//            criteria.andCarLoanOrderNoIn(orderNos);
//        }
//        criteria.andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return this.genBusinessCarInfo(carLoanDOS);
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailByCarUniques(List<String> carUniques) {
//        //查询所有车辆明细
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        List<CarLoanDO> carLoanDOS = new ArrayList<>();
//        List<CarDO> carDOList = carAO.getCarDOsByCarUniques(carUniques);
//        if (carDOList.size() > 0) {
//            carLoanQuery.or().andCarIdIn(carDOList.stream().map(carDO -> carDO.getCarId()).collect(Collectors.toList())).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//        } else {
//            return this.genBusinessCarInfo(carLoanDOS);
//        }
//        carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return this.genBusinessCarInfo(carLoanDOS);
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailByCarUniquesAdvanced(List<String> carUniques) {
//        BusinessCarInfoDTO businessCarInfoDTO;
//        // 先去cc_car找车辆信息
//        List<CarDO> carDOList = carAO.getCarDOsByCarUniques(carUniques);
//        try {
//            if(CollectionUtils.isNotEmpty(carDOList) && carDOList.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carUniques));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        Set<Long> carIdLoanSet = new HashSet<>(); // 存放做单子的车辆id
//        Set<String> carUniqueLoanSet = new HashSet<>(); // 过滤相同车架号的多个车
//        if (CollectionUtils.isEmpty(carDOList)) {
//            return null;
//        } else {
//            // 复用了上面方法的已有逻辑，额外的逻辑后面补，不敢随便改动
//            CarLoanQuery carLoanQuery = new CarLoanQuery();
//            carLoanQuery.or().andCarIdIn(carDOList.stream().map(CarDO::getCarId).collect(Collectors.toList()))
//                    .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//            List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//            List<CarLoanDO> filterCarLoanDOS = new ArrayList<>();
//            for (CarLoanDO carLoanDO : carLoanDOS) {
//                if (carLoanDO.getCarLoanOrderNo() != null) { // 这里只处理有单子的，没单子的后面处理
//                    filterCarLoanDOS.add(carLoanDO);
//                    CarDO carDO = carManager.selectByPrimaryKey(carLoanDO.getCarId());
//                    carUniqueLoanSet.add(carDO.getCarUnique());
//                    carIdLoanSet.add(carLoanDO.getCarId());
//                }
//            }
//            businessCarInfoDTO = this.genBusinessCarInfo(filterCarLoanDOS);
//        }
//        // 做一遍车辆存在车辆中心的校验
//        for (String carUnique : carUniques) {
//            boolean check = false;
//            for (CarDO carDO : carDOList) {
//                if (carUnique.equals(carDO.getCarUnique())) {
//                    check = true;
//                    break;
//                }
//            }
//            if (!check) {
//                throw new RuntimeException(String.format("车辆中心没有找到车架号%s的车辆", carUnique));
//            }
//        }
//        // 这里需要拆分逻辑，cc_car里面有车的但是在cc_car_loan里面没有的，认为非在贷
//        for (CarDO carDO : carDOList) {
//            if (!carIdLoanSet.contains(carDO.getCarId())) { // 如果不在做单子，但是又在车辆中心有，给个订单号为空对象
//                // 这里需要判断一下id，因为存在做单子但又走了tms，车辆重心会有两个车架号相同的车
//                if (carUniqueLoanSet.contains(carDO.getCarUnique())) {
//                    log.info("存在多条相同车架号的车辆记录，但是已找到在贷车辆[carUnique = {}]", carDO.getCarUnique());
//                    continue;
//                }
//                CarLoanOrderDetailDTO carLoanOrderDetailDTO = new CarLoanOrderDetailDTO();
//                carLoanOrderDetailDTO.setCarUnique(carDO.getCarUnique());
//                if (businessCarInfoDTO.getCarLoanOrderDetails() == null) {
//                    businessCarInfoDTO.setCarLoanOrderDetails(new ArrayList<>());
//                }
//                businessCarInfoDTO.getCarLoanOrderDetails().add(carLoanOrderDetailDTO);
//                if (businessCarInfoDTO.getTotalCount() != null) {
//                    businessCarInfoDTO.setTotalCount(businessCarInfoDTO.getTotalCount() + 1);
//                } else {
//                    businessCarInfoDTO.setTotalCount(1);
//                }
//            }
//        }
//        return businessCarInfoDTO;
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryDetailByCarLoanParams(CarLoanParamsQuery carLoanParamsQuery) {
//        //查询所有车辆明细
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        CarLoanQuery.Criteria criteria = carLoanQuery.or();
//        criteria.andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//        if (carLoanParamsQuery.getCarLoanOrderNo() != null) {
//            criteria.andCarLoanOrderNoEqualTo(carLoanParamsQuery.getCarLoanOrderNo());
//        }
//        String orderNO = carLoanParamsQuery.getCarLoanOrderNo();
//        String modelName = carLoanParamsQuery.getModelName();
//        String carUnique = carLoanParamsQuery.getCarUnique();
//
//        // 根据车架号查询
//        if (!StringUtils.isEmpty(carLoanParamsQuery.getCarUnique())) {
//            List<Long> carIds = carLoanOrderSearchAO.queryCarIdsByFuzzyField(Arrays.asList(orderNO), carUnique, modelName);
//            if (!CollectionUtils.isEmpty(carIds)) {
//                criteria.andCarIdIn(carIds);
//            }
//        }
//
//        // 车辆状态
//        if (carLoanParamsQuery.getCarStatus() != null) {
//            criteria.andCarStatusEqualTo(carLoanParamsQuery.getCarStatus());
//        }
//
//        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return this.genBusinessCarInfo(carLoanDOS);
//    }

    @Override
    public List<CarLoanDO> queryLoanOrderNoByCarUnique(String carUnique) {
        //查询所有车辆明细
        CarLoanQuery carLoanQuery = new CarLoanQuery();
        CarLoanQuery.Criteria criteria = carLoanQuery.or();
        criteria.andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        // 根据车架号查询
        if (!StringUtils.isEmpty(carUnique)) {
            List<Long> carIds = carAO.getCarIdsByCarUnique(carUnique);
            if (!CollectionUtils.isEmpty(carIds)) {
                criteria.andCarIdIn(carIds);
            } else {
                return new ArrayList<>();
            }
        }
        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
        try {
            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        if (CollectionUtils.isEmpty(carLoanDOS)) {
            return new ArrayList<>();
        }
        return carLoanDOS;
    }

    @Override
    public Integer countCarByLoanOrderNoWithoutStatus(String carLoanOrderNO, Integer status) {
        CarLoanQuery carLoanQuery = new CarLoanQuery();
        carLoanQuery.createCriteria().andCarLoanOrderNoEqualTo(carLoanOrderNO).andCarStatusNotEqualTo(status)
                .andCarStatusNotEqualTo(FpCarStatusEnum.CLOSED.getCode()).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        return carLoanManager.countByQuery(carLoanQuery);
    }

    @Override
    public Integer countCarByLoanOrderNoWithStatus(String carLoanOrderNO, Integer status) {
        CarLoanQuery carLoanQuery = new CarLoanQuery();
        carLoanQuery.createCriteria().andCarLoanOrderNoEqualTo(carLoanOrderNO).andCarStatusEqualTo(status)
                .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        return carLoanManager.countByQuery(carLoanQuery);
    }

    @Override
    public void batchUpdateCarLoanOrderInfo(List<CarLoanOrderDetailDTO> carLoanOrderDetailDTOS) {
        for (CarLoanOrderDetailDTO carLoanOrderDetailDTO : carLoanOrderDetailDTOS) {
            CarLoanDO carLoanDO = BeanUtil.copyPorp2DO(CarLoanDO.class, carLoanOrderDetailDTO);
            //2.更新cc_car_loan
            if(carLoanOrderDetailDTO.getCarLoanId() != null){
                //优先主键更新
                carLoanManager.updateByPrimaryKeySelective(carLoanDO);
                if(carLoanDO.getCarId() != null){
                    //carid不为空时，更新车辆信息
                    carAO.saveCarDTO(carLoanOrderDetailDTO);
                }
            } else {
                carAO.saveCarDTO(carLoanOrderDetailDTO);
                carLoanManager.updateByCarIdAndOrderNoSelective(carLoanDO);
            }
        }
    }

    @Override
    public int updateByCarLoanOrderNo(String carLoanOrderNO, Integer carStatus) {
        CarLoanDO carLoanDO = new CarLoanDO();
        carLoanDO.setCarLoanOrderNo(carLoanOrderNO);
        carLoanDO.setCarStatus(carStatus);
        return carLoanManager.updateByCarLoanOrderNoSelective(carLoanDO);
    }

//    private BusinessCarInfoDTO genBusinessCarInfo(List<CarLoanDO> carLoanDOS) {
//        BusinessCarInfoDTO businessCarInfoDTO = new BusinessCarInfoDTO();
//        if (CollectionUtils.isNotEmpty(carLoanDOS)) {
//            businessCarInfoDTO.setCarLoanOrderDetails(assembleUtil.assemblyCarLoanOrderDetailDTOs(carLoanDOS));
//        }
//        return businessCarInfoDTO;
//    }
//
//    @Override
//    public BusinessCarInfoDTO queryOptionalVehicle(String carLoanOrderNO, Integer status) {
//        CarLoanQuery carLoanQuery = new CarLoanQuery();
//        carLoanQuery.createCriteria().andCarLoanOrderNoEqualTo(carLoanOrderNO).andCarStatusEqualTo(status)
//                .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//        List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//        try {
//            if(CollectionUtils.isNotEmpty(carLoanDOS) && carLoanDOS.size() > 3000){
//                log.info(RpcContext.getContext().getRemoteHost() +"查的太多了 getCarsByCarUniques param={}", JSON.toJSONString(carLoanQuery));
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return this.genBusinessCarInfo(carLoanDOS);
//    }
//
//    @Override
//    public List<CarHisBusinessDTO> queryCarWithHisBusiness(String carLoanOrderNO) {
//        BusinessCarInfoDTO loanTempBusinessDTO = queryCarLoanOrderDetailByOrderNos(Arrays.asList(carLoanOrderNO));
//        if (loanTempBusinessDTO != null && CollectionUtils.isNotEmpty(loanTempBusinessDTO.getCarLoanOrderDetails())) {
//            List<CarLoanOrderDetailDTO> loanTempCars = loanTempBusinessDTO.getCarLoanOrderDetails();
//            List<String> carUniques = loanTempCars.stream().map(carLoanOrderDetailDTO -> carLoanOrderDetailDTO.getCarUnique()).filter(carUnique -> carUnique != null).collect(Collectors.toList());
//            return getCarWithHisBusiness(carUniques);
//        }
//        return Lists.newArrayList();
//    }
//
//    @Override
//    public List<CarHisBusinessDTO> queryCarWithHisBusiness(List<String> carUniques) {
//        return getCarWithHisBusiness(carUniques);
//    }
//
//    @Override
//    public SearchResult<List<SearchCarLoanDTO>> getSearchCarLoanDTOResultByCarLoanAssociatedDTOQuery(
//            CarLoanAssociatedDTOQuery carLoanAssociatedDTOQuery) {
//        Integer pageSize = carLoanAssociatedDTOQuery.getPageSize();
//        Integer pageNo = carLoanAssociatedDTOQuery.getPageNo();
//        // 通过提交的表单构造搜索对象
//        SearchConditionDto searchConditionDto = new SearchConditionDto();
//
//        // 分页参数
//        if (pageSize != null && pageNo != null) {
//            searchConditionDto.setStart((pageNo - 1) * pageSize);
//            searchConditionDto.setPageSize(pageSize);
//        }
//
//        // 查询字段与值
//        List<SearchTextFieldsPairDto> searchTextFieldsPairDtoList =
//                buildSearchTextFieldsPairDtoListListFromCarLoanAssociatedDTOQuery(carLoanAssociatedDTOQuery);
//        if (searchTextFieldsPairDtoList.size() > 0) {
//            searchConditionDto.setSearchTextFieldsPairDtoList(searchTextFieldsPairDtoList);
//        }
//
//        // 过滤条件
//        List<SearchFilterPairDto> searchFilterPairDtoList =
//                buildSearchFilterPairDtoListFromCarLoanAssociatedDTOQuery(carLoanAssociatedDTOQuery);
//        if (searchFilterPairDtoList.size() > 0) {
//            searchConditionDto.setSearchFilterPairDtoList(searchFilterPairDtoList);
//        }
//
//        // 根据时间倒序排序
//        List<SearchSortDto> sorts = new LinkedList<>();
//        SearchSortDto searchSortDto = createSearchSortDto(CARLOAN_CAR_LOAN_ID, SearchSortTypeConstants.SS_TYPE_ASC);
//        sorts.add(searchSortDto);
//        searchConditionDto.setSorts(sorts);
//
//        return carLoanSearchService.carLoanSearch(searchConditionDto);
//    }
//
//    @Override
//    public Boolean batchUpdateCarLoanByCarIds(List<CarLoanDetailBatchDTO> carLoanDetailBatchDTOs) {
//        if (CollectionUtils.isNotEmpty(carLoanDetailBatchDTOs)) {
//            carLoanDetailBatchDTOs.forEach(carLoanDetailBatchDTO -> {
//                CarLoanOrderDetailDTO carLoanOrderDetailDTO = carLoanDetailBatchDTO.getCarLoanOrderDetailDTO();
//                List<Long> carIds = carLoanDetailBatchDTO.getCarIds();
//                if (carLoanOrderDetailDTO != null && CollectionUtils.isNotEmpty(carIds)) {
//                    carLoanManager.batchUpdateByCarIds(assembleUtil.assembleCarLoanDO(carLoanOrderDetailDTO), carIds);
//                    //只删除cc_car_loan 记录
//                    CarDO carDO = assembleUtil.assembleCarDO(carLoanOrderDetailDTO);
//                    carDO.setIsDeleted(IsDeletedEnum.NOT_DELETED.getCode());
//                    carDO.setAssetRight(null);
//                    carDO.setAssetRightType(null);
//                    carManager.batchUpdateByCarIds(carDO, carIds);
//                }
//            });
//            return true;
//        }
//        return false;
//    }

    @Override
    public List<String> queryAllOnLoanOrderNos(){
        return carLoanManager.queryAllOnLoanOrderNos();
    }

//    /**
//     * 生成搜索查询的匹配键值对
//     *
//     * @param carLoanAssociatedDTOQuery
//     * @return
//     */
//    private List<SearchTextFieldsPairDto> buildSearchTextFieldsPairDtoListListFromCarLoanAssociatedDTOQuery(
//            CarLoanAssociatedDTOQuery carLoanAssociatedDTOQuery) {
//        List<SearchTextFieldsPairDto> searchTextFieldsPairDtoList = new LinkedList<>();
//
//        if (!StringUtils.isBlank(carLoanAssociatedDTOQuery.getCarUnique())) {
//            // 车架号不为空，增加条件
//            searchTextFieldsPairDtoList.add(
//                    createSearchTextFieldsPairDtoWithoutBoost(
//                            carLoanAssociatedDTOQuery.getCarUnique(), CARLOAN_CAR_UNIQUE));
//        }
//
//        if (!StringUtils.isBlank(carLoanAssociatedDTOQuery.getCarLoanOrderNo())) {
//            // 订单号不为空，增加条件
//            searchTextFieldsPairDtoList.add(
//                    createSearchTextFieldsPairDtoWithoutBoost(
//                            carLoanAssociatedDTOQuery.getCarLoanOrderNo(), CARLOAN_ORDER_NO));
//        }
//
//        return searchTextFieldsPairDtoList;
//    }

//    /**
//     * 生成搜索过滤的匹配键值对
//     *
//     * @param carLoanAssociatedDTOQuery
//     * @return
//     */
//    private List<SearchFilterPairDto> buildSearchFilterPairDtoListFromCarLoanAssociatedDTOQuery(
//            CarLoanAssociatedDTOQuery carLoanAssociatedDTOQuery) {
//        List<SearchFilterPairDto> searchFilterPairDtoList = new LinkedList<>();
//
//        // 订单类型
//        if (carLoanAssociatedDTOQuery.getLoanOrderType() != null) {
//            searchFilterPairDtoList.add(
//                    createSearchFilterPairDto(
//                            CARLOAN_ORDER_TYPE, createSearchFilterTermDto(carLoanAssociatedDTOQuery.getLoanOrderType()))
//            );
//        }
//
//        return searchFilterPairDtoList;
//    }
//
//    //获取车架号历史业务信息
//    private List<CarHisBusinessDTO> getCarWithHisBusiness(List<String> carUniques) {
//        List<CarHisBusinessDTO> carHisBusinessDTOS = Lists.newArrayList();
//        if (CollectionUtils.isNotEmpty(carUniques)) {
//            BusinessCarInfoDTO loanTotalBusinessDTO = queryCarLoanOrderDetailByCarUniques(carUniques);
//            if (loanTotalBusinessDTO != null && CollectionUtils.isNotEmpty(loanTotalBusinessDTO.getCarLoanOrderDetails())) {
//                List<CarLoanOrderDetailDTO> loanTotalCars = loanTotalBusinessDTO.getCarLoanOrderDetails();
//                //1.cars放进Map<String,Map<String,Integer>>
//                Map<String, Map<String, Integer>> carUnique2OrderNosMap = Maps.newHashMap();
//                loanTotalCars.forEach(carLoanOrderDetailDTO -> {
//                    String carUnique = carLoanOrderDetailDTO.getCarUnique().trim();
//                    String orderNo = carLoanOrderDetailDTO.getCarLoanOrderNo();
//                    Integer carStatus = carLoanOrderDetailDTO.getCarStatus();
//                    if (StringUtils.isNotEmpty(orderNo)) {
//                        if (carUnique2OrderNosMap.get(carUnique) == null) {
//                            Map<String, Integer> map = Maps.newHashMap();
//                            map.put(orderNo, carStatus);
//                            carUnique2OrderNosMap.put(carUnique, map);
//                        } else {
//                            carUnique2OrderNosMap.get(carUnique).put(orderNo, carStatus);
//                        }
//                    }
//                });
//                //2.内容过滤
//                carUnique2OrderNosMap.entrySet().forEach(entry -> {
//                    if (entry.getValue() != null && entry.getValue().size() > 1) {
//                        CarHisBusinessDTO carHisBusinessDTO = new CarHisBusinessDTO();
//                        carHisBusinessDTO.setCarUnique(entry.getKey());
//                        carHisBusinessDTO.setCarLoanOrderNos(entry.getValue().keySet().stream().collect(Collectors.toList()));
//                        carHisBusinessDTO.setOrderNo2CarStatusMap(entry.getValue());
//                        carHisBusinessDTOS.add(carHisBusinessDTO);
//                    }
//                });
//            }
//        }
//        return carHisBusinessDTOS;
//    }

}
