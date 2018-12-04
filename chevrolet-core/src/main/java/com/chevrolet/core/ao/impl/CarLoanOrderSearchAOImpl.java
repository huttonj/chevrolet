package com.chevrolet.core.ao.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.ao.CarLoanOrderSearchAO;
import com.chevrolet.core.config.Constants;
import com.chevrolet.core.utils.AssembleUtil;
import com.chevrolet.dal.dao.manager.CarLoanManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.infiniti.search.constants.SearchSortTypeConstants;
import com.infiniti.search.dto.*;
import com.infiniti.search.service.CarLoanSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.infiniti.search.constants.CarLoanIndexFieldNameConstants.*;
import static com.infiniti.search.util.SearchConditionUtil.*;

@Component
@Slf4j
public class CarLoanOrderSearchAOImpl implements CarLoanOrderSearchAO {
    @Autowired
    private CarAO carAO;

    @Autowired
    private CarLoanManager carLoanManager;


    @Autowired
    private CarLoanSearchService carLoanSearchService;

    @Autowired
    private AssembleUtil assembleUtil;


    @Override
    public List<String> filterCarLoanNoByFuzzyField(List<String> orderNos, String fuzzyField) {
        List<String> newCarLoanNos = Lists.newArrayList();
        Set<String> oldCarLoanNos = Sets.newConcurrentHashSet(orderNos);
        SearchResult<List<SearchCarLoanDetailDTO>> searchResult = getSearchResult(null,orderNos, null, null, null, fuzzyField, orderNos.size(), 0, null);
        Set<String> tempCarLoanNos = Sets.newConcurrentHashSet();
        //数据处理
        if (searchResult != null && CollectionUtils.isNotEmpty(searchResult.getSearchResult())) {
            List<SearchCarLoanDetailDTO> searchCarLoanDTOS = searchResult.getSearchResult();
            searchCarLoanDTOS.forEach(searchCarLoanDTO -> {
                tempCarLoanNos.add(searchCarLoanDTO.getCarLoanOrderNo());
            });
        }
        if (CollectionUtils.isNotEmpty(tempCarLoanNos) && CollectionUtils.isNotEmpty(oldCarLoanNos)) {
            tempCarLoanNos.retainAll(oldCarLoanNos);
            newCarLoanNos = Lists.newArrayList(tempCarLoanNos);
        }
        return newCarLoanNos;
    }
//
//    @Override
//    public BusinessCarInfoDTO queryCarLoanOrderDetailPagination(List<Long> carIds,List<String> orderNos, String carUnique, String modelName, Integer carStatus, String fuzzyField, List<Integer> carStatusList, Integer pageSize, Integer pageOffset, Boolean delFlag) {
//        SearchResult<List<SearchCarLoanDetailDTO>> searchResult = getSearchResult(carIds,orderNos, carUnique, modelName, carStatus, fuzzyField, pageSize, pageOffset, carStatusList);
//        //数据处理
//        List<Long> filteredCarIds = Lists.newArrayList();
//        if (searchResult != null && CollectionUtils.isNotEmpty(searchResult.getSearchResult())) {
//            List<SearchCarLoanDetailDTO> searchCarLoanDTOS = searchResult.getSearchResult();
//            searchCarLoanDTOS.forEach(searchCarLoanDTO -> {
//                filteredCarIds.add(searchCarLoanDTO.getCcCarId());
//            });
//        }
//        if (CollectionUtils.isNotEmpty(filteredCarIds)) {
//            CarLoanQuery carLoanQuery = new CarLoanQuery();
//            CarLoanQuery.Criteria criteria = carLoanQuery.or();
//            if(delFlag) {
//                criteria.andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
//            }
//            criteria.andCarIdIn(filteredCarIds);
//            if(CollectionUtils.isNotEmpty(orderNos)){
//                criteria.andCarLoanOrderNoIn(orderNos);
//            }
//            carLoanQuery.setOrderByClause("car_loan_order_no desc,car_id asc");
//            List<CarLoanDO> carLoanDOS = carLoanManager.selectByQuery(carLoanQuery);
//            return this.genBusinessCarInfo(carLoanDOS);
//        }
//        return new BusinessCarInfoDTO();
//    }

    @Override
    public List<Long> queryCarIdsByFuzzyField(List<String> orderNos, String carUnique, String modelName) {
        SearchResult<List<SearchCarLoanDetailDTO>> searchResult = getSearchResult(null,orderNos, carUnique, modelName, null, null, null, null, null);
        //数据处理
        List<Long> carIds = Lists.newArrayList();
        if (searchResult != null && CollectionUtils.isNotEmpty(searchResult.getSearchResult())) {
            List<SearchCarLoanDetailDTO> searchCarLoanDTOS = searchResult.getSearchResult();
            searchCarLoanDTOS.forEach(searchCarLoanDTO -> {
                carIds.add(searchCarLoanDTO.getCcCarId());
            });
        }
        return carIds;
    }

    @Override
    public List<String> queryCarLoanNosByFuzzyField(List<String> orderNOs, String carUnique, String modelName, String fuzzyField) {
        SearchResult<List<SearchCarLoanDetailDTO>> searchResult = getSearchResult(null,orderNOs, carUnique, modelName, null, fuzzyField, null, null, null);
        //数据处理
        Set<String> carLoanOrderNos = Sets.newConcurrentHashSet();
        if (searchResult != null && CollectionUtils.isNotEmpty(searchResult.getSearchResult())) {
            List<SearchCarLoanDetailDTO> searchCarLoanDTOS = searchResult.getSearchResult();
            searchCarLoanDTOS.forEach(searchCarLoanDTO -> {
                if (searchCarLoanDTO.getCarLoanOrderNo() != null) {
                    carLoanOrderNos.add(searchCarLoanDTO.getCarLoanOrderNo());
                }
            });
        }
        return carLoanOrderNos.stream().collect(Collectors.toList());
    }

//    @Override
//    public BizResult<List<InfinitiCarLoanDTO>> getCarLoanDTOSearchResult(CarLoanFuzzyPageQuery query) {
//        BizResult<SearchResult<List<SearchCarLoanDetailDTO>>> bizResult = searchCarLoanDTO(query, true);
//        if (!bizResult.isSuccess()) {
//            return BizResult.create(bizResult.getCode(), bizResult.getMessage());
//        }
//        SearchResult<List<SearchCarLoanDetailDTO>> searchResult = bizResult.getData();
//        if (searchResult == null) {
//            return BizResult.create(new ArrayList<>());
//        }
//        List<SearchCarLoanDetailDTO> searchDTOList = searchResult.getSearchResult();
//        if (CollectionUtils.isEmpty(searchDTOList)) {
//            return BizResult.create(new ArrayList<>());
//        }
//        List<InfinitiCarLoanDTO> infinitiCarLoanDTOList = new ArrayList<>();
//        for (SearchCarLoanDetailDTO dto :
//                searchDTOList) {
//            InfinitiCarLoanDTO infinitiDTO = new InfinitiCarLoanDTO();
//            infinitiDTO.setCcCarId(dto.getCcCarId());
//            infinitiDTO.setCarUnique(dto.getCarUnique());
//            infinitiDTO.setModelName(dto.getModelName());
//            infinitiDTO.setCarStatus(dto.getCarStatus());
//            infinitiDTO.setCarLoanOrderNo(dto.getCarLoanOrderNo());
//            infinitiDTO.setLoanOrderType(dto.getLoanOrderType());
//            infinitiCarLoanDTOList.add(infinitiDTO);
//        }
//        return BizResult.create(infinitiCarLoanDTOList);
//    }
//
//
//    @Override
//    public BizResult<Integer> countCarLoanDTOSearchResult(CarLoanFuzzyCountQuery query) {
//        CarLoanFuzzyPageQuery form = new CarLoanFuzzyPageQuery();
//        form.setPageNo(1);
//        form.setPageSize(1);
//        form.setCarStatusList(query.getCarStatusList());
//        form.setFuzzyField(query.getFuzzyField());
//        form.setOrderNoList(query.getOrderNoList());
//        BizResult<SearchResult<List<SearchCarLoanDetailDTO>>> bizResult = searchCarLoanDTO(form, false);
//        if (!bizResult.isSuccess()) {
//            return BizResult.create(bizResult.getCode(), bizResult.getMessage());
//        }
//        SearchResult<List<SearchCarLoanDetailDTO>> searchResult = bizResult.getData();
//        if (searchResult == null) {
//            return BizResult.create(0);
//        }
//        return BizResult.create(searchResult.getTotal());
//    }

//
//    @NotNull
//    private BizResult<SearchResult<List<SearchCarLoanDetailDTO>>> searchCarLoanDTO(CarLoanFuzzyPageQuery form, boolean sort) {
//        String logPre = "从车辆中心搜索车辆,";
//        //参数校验
//        if (form == null) {
//            return BizResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), logPre + "参数不能为空");
//        }
//        if (form.getPageNo() == null || form.getPageSize() == null) {
//            return BizResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), logPre + "分页参数不能为空");
//        }
//        if (form.getPageNo() < 1) {
//            return BizResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), logPre + "分页pageNo必须大于等于1");
//        }
//        if (form.getPageSize() > Constants.MAX_PAGE_SIZE) {
//            return BizResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), logPre + "分页pageSize必须小于" + Constants.MAX_PAGE_SIZE);
//        }
//        if (CollectionUtils.isEmpty(form.getCarStatusList())
//                && CollectionUtils.isEmpty(form.getOrderNoList())
//                && TextUtils.isBlank(form.getFuzzyField())
//                ) {
//            return BizResult.create(ErrorCodeEnum.PARAM_ERROR.getErrCode(), logPre + "筛选条件不能全部为空");
//        }
//        SearchConditionDto conditionDTO = new SearchConditionDto();
//        //分页参数
//        conditionDTO.setPageSize(form.getPageSize());
//        conditionDTO.setStart((form.getPageNo() - 1) * form.getPageSize());
//
//        // modelName carUnique模糊查询
//        if (StringUtils.isNotEmpty(form.getFuzzyField())) {
//            List<SearchTextFieldsPairDto> textFieldsList = new ArrayList<>();
//            textFieldsList.add(
//                    createSearchTextFieldsPairDtoWithoutBoost(
//                            form.getFuzzyField(), CARLOAN_CAR_UNIQUE, CARLOAN_CAR_MODEL_NAME));
//            conditionDTO.setSearchTextFieldsPairDtoList(textFieldsList);
//        }
//        //订单号过滤
//        List<SearchFilterPairDto> filterList = new ArrayList<>();
//        if (CollectionUtils.isNotEmpty(form.getOrderNoList())) {
//            filterList.add(
//                    createSearchFilterPairDto(
//                            CARLOAN_ORDER_NO, createSearchFilterTermsDto(form.getOrderNoList()))
//            );
//        }
//        //车辆状态过滤
//        if (CollectionUtils.isNotEmpty(form.getCarStatusList())) {
//            filterList.add(
//                    createSearchFilterPairDto(
//                            CARLOAN_CAR_STATUS, createSearchFilterTermsDto(form.getCarStatusList()))
//            );
//        }
//        if (CollectionUtils.isNotEmpty(filterList)) {
//            conditionDTO.setSearchFilterPairDtoList(filterList);
//        }
//        // 根据时car_loan_id升序
//        if (sort) {
//            List<SearchSortDto> sorts = new ArrayList<>();
//            SearchSortDto searchSortDto = createSearchSortDto(CARLOAN_CAR_LOAN_ID, SearchSortTypeConstants.SS_TYPE_ASC);
//            sorts.add(searchSortDto);
//            conditionDTO.setSorts(sorts);
//        }
//        try {
//            log.info(logPre + "从infini搜索车辆参数:" + JSON.toJSONString(conditionDTO));
//            SearchResult<List<SearchCarLoanDetailDTO>> searchResult = carLoanSearchService.carLoanAllInfoSearch(conditionDTO);
//            if (searchResult == null) {
//                log.error(logPre + "从infini搜索车辆返回为空.");
//                return BizResult.create(ErrorCodeEnum.NO_DATA.getErrCode(), logPre + "搜索车辆数据返回为空");
//            }
//            if (searchResult.getSearchResult() == null) {
//                searchResult.setSearchResult(new ArrayList<>());
//            }
//            log.info(logPre + "从infini搜索车辆返回:" + JSON.toJSONString(searchResult));
//            return BizResult.create(searchResult);
//        } catch (Exception e) {
//            log.error(logPre + "从infini搜索车辆出错", e);
//            return BizResult.create(ErrorCodeEnum.NO_DATA.getErrCode(), logPre + "搜索车辆数据出错");
//        }
//    }

    //-----------------------------------------------------------------------------------------
//--------------------------------------通用方法--------------------------------------------
//-----------------------------------------------------------------------------------------


    private SearchResult<List<SearchCarLoanDetailDTO>> getSearchResult(List<Long> carIds, List<String> orderNos, String carUnique, String modelName, Integer carStatus, String fuzzyField, Integer pageSize, Integer pageOffset, List<Integer> carStatusList) {
        // 通过提交的表单构造搜索对象
        SearchConditionDto searchConditionDto = new SearchConditionDto();
        // 分页参数
        if (pageSize != null && pageOffset != null) {
            searchConditionDto.setStart(pageOffset);
            searchConditionDto.setPageSize(pageSize);
        } else {
            searchConditionDto.setStart(Constants.DEFAULT_OFFSET);
            searchConditionDto.setPageSize(Constants.MAX_PAGE_SIZE);
        }

        // modelName carUnique模糊查询
        List<SearchTextFieldsPairDto> searchTextFieldsPairDtoList = Lists.newLinkedList();
        if (StringUtils.isNotEmpty(carUnique)) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            carUnique, CARLOAN_CAR_UNIQUE));
        }
        if (StringUtils.isNotEmpty(modelName)) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            modelName, CARLOAN_CAR_MODEL_NAME));
        }
        if (carStatus != null) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            carStatus.toString(), CARLOAN_CAR_STATUS));
        }
        if (StringUtils.isNotEmpty(fuzzyField)) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            fuzzyField, CARLOAN_CAR_UNIQUE, CARLOAN_CAR_MODEL_NAME));
        }

        searchConditionDto.setSearchTextFieldsPairDtoList(searchTextFieldsPairDtoList);

        //订单号过滤
        List<SearchFilterPairDto> searchFilterPairDtoList = Lists.newLinkedList();
        if (CollectionUtils.isNotEmpty(orderNos)) {
            searchFilterPairDtoList.add(
                    createSearchFilterPairDto(
                            CARLOAN_ORDER_NO, createSearchFilterTermsDto(orderNos))
            );
        }

        if (CollectionUtils.isNotEmpty(carIds)) {
            searchFilterPairDtoList.add(
                    createSearchFilterPairDto(
                            CARLOAN_CC_CAR_ID, createSearchFilterTermsDto(carIds))
            );
        }

        // 车辆状态列表
        if (CollectionUtils.isNotEmpty(carStatusList)) {
            searchFilterPairDtoList.add(
                    createSearchFilterPairDto(
                            CARLOAN_CAR_STATUS, createSearchFilterTermsDto(carStatusList))
            );
        }

        if (CollectionUtils.isNotEmpty(searchFilterPairDtoList)) {
            searchConditionDto.setSearchFilterPairDtoList(searchFilterPairDtoList);
        }

        // 根据时car_loan_id升序
        List<SearchSortDto> sorts = new LinkedList<>();
        SearchSortDto searchSortDto = createSearchSortDto(CARLOAN_CAR_LOAN_ID, SearchSortTypeConstants.SS_TYPE_ASC);
        sorts.add(searchSortDto);
        searchConditionDto.setSorts(sorts);
        SearchResult<List<SearchCarLoanDetailDTO>> searchResult = carLoanSearchService.carLoanAllInfoSearch(searchConditionDto);
        log.info("infiniti返回数据 searchResult={}", JSON.toJSONString(searchResult));
        return searchResult;
    }
//
//    private BusinessCarInfoDTO genBusinessCarInfo(List<CarLoanDO> carLoanDOS) {
//        BusinessCarInfoDTO businessCarInfoDTO = new BusinessCarInfoDTO();
//        if (CollectionUtils.isNotEmpty(carLoanDOS)) {
//            List<CarLoanOrderDetailDTO> carLoanOrderDetailDTOS = assembleUtil.assemblyCarLoanOrderDetailDTOs(carLoanDOS);
//            businessCarInfoDTO.setCarLoanOrderDetails(carLoanOrderDetailDTOS);
//            if (CollectionUtils.isNotEmpty(carLoanOrderDetailDTOS)) {
//                businessCarInfoDTO.setTotalCount(carLoanOrderDetailDTOS.size());
//            }
//        }
//        return businessCarInfoDTO;
//    }
}
