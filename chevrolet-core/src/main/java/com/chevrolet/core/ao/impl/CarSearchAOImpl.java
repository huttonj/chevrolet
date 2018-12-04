package com.chevrolet.core.ao.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.core.ao.CarSearchAO;
import com.chevrolet.core.config.Constants;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.query.CarQuery;
import com.chevrolet.dal.dao.manager.CarManager;
import com.google.common.collect.Lists;
import com.infiniti.search.constants.SearchSortTypeConstants;
import com.infiniti.search.dto.*;
import com.infiniti.search.service.BaseCarSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static com.infiniti.search.constants.BaseCarIndexFieldNameConstants.*;
import static com.infiniti.search.util.SearchConditionUtil.*;

/**
 * @author maihe
 */
@Component
@Slf4j
public class CarSearchAOImpl implements CarSearchAO {
    @Autowired
    private CarManager carManager;

    @Autowired
    private BaseCarSearchService baseCarSearchService;

    @Override
    public  List<BaseCarDTO> queryCarDetailPagination(List<Long> carIds, List<String> carUniques, String carUnique, String modelName,
                                                      Long assetRight, Integer assetRightType, String fuzzyField, Integer pageSize, Integer pageOffset){
        SearchResult<List<SearchCarDTO>> result = getSearchResult(carIds,carUniques,carUnique,null,null,modelName,assetRight,assetRightType,fuzzyField,pageSize,pageOffset);
        if(result != null && result.getSearchResult()!= null){
            List<SearchCarDTO> searchCarDTOS = result.getSearchResult();
            if(CollectionUtils.isNotEmpty(searchCarDTOS)){
                List<Long> filteredCarIds = searchCarDTOS.stream().map(searchCarDTO -> searchCarDTO.getCarId()).collect(Collectors.toList());
                CarQuery carQuery = new CarQuery();
                carQuery.or().andCarIdIn(filteredCarIds);
                List<CarDO> list = carManager.selectByQuery(carQuery);
                if(CollectionUtils.isNotEmpty(list)){
                    return BeanUtil.copyPorp2DOs(BaseCarDTO.class,list,(baseCarDTO,carDO) ->{
                        if (com.alibaba.dubbo.common.utils.StringUtils.isNotEmpty(carDO.getImgDamage())) {
                            baseCarDTO.setImgDamage(Arrays.asList(carDO.getImgDamage().split(",")));
                        }
                    });
                }
            }
        }
        return new ArrayList<>();
    }


    private SearchResult<List<SearchCarDTO>> getSearchResult(List<Long> carIds, List<String> carUniques, String carUnique, String brandName, String seriesName, String modelName,
                                                                       Long assetRight, Integer assetRightType, String fuzzyField, Integer pageSize, Integer pageOffset) {
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
                            carUnique, BASECAR_CAR_UNIQUE));
        }
        if (brandName != null) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            brandName, BASECAR_BRAND_NAME));
        }
        if (seriesName != null) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            seriesName, BASECAR_SERIES_NAME));
        }
        if (StringUtils.isNotEmpty(modelName)) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            modelName, BASECAR_MODEL_NAME));
        }

        if (StringUtils.isNotEmpty(fuzzyField)) {
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            fuzzyField, BASECAR_CAR_UNIQUE, BASECAR_MODEL_NAME));
        }

        if(assetRight != null && assetRightType != null){
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            assetRight+"", BASECAR_ASSET_RIGHT));
            searchTextFieldsPairDtoList.add(
                    createSearchTextFieldsPairDtoWithoutBoost(
                            assetRightType+"", BASECAR_ASSET_RIGHT_TYPE));
        }
        searchConditionDto.setSearchTextFieldsPairDtoList(searchTextFieldsPairDtoList);

        //订单号过滤
        List<SearchFilterPairDto> searchFilterPairDtoList = Lists.newLinkedList();
        if (CollectionUtils.isNotEmpty(carIds)) {
            searchFilterPairDtoList.add(
                    createSearchFilterPairDto(
                            BASECAR_CAR_ID, createSearchFilterTermsDto(carIds))
            );
        }

        if (CollectionUtils.isNotEmpty(carUniques)) {
            searchFilterPairDtoList.add(
                    createSearchFilterPairDto(
                            BASECAR_CAR_UNIQUE, createSearchFilterTermsDto(carUniques))
            );
        }

        if (CollectionUtils.isNotEmpty(searchFilterPairDtoList)) {
            searchConditionDto.setSearchFilterPairDtoList(searchFilterPairDtoList);
        }

        // 根据时car_loan_id升序
        List<SearchSortDto> sorts = new LinkedList<>();
        SearchSortDto searchSortDto = createSearchSortDto(BASECAR_CAR_ID, SearchSortTypeConstants.SS_TYPE_ASC);
        sorts.add(searchSortDto);
        searchConditionDto.setSorts(sorts);
        SearchResult<List<SearchCarDTO>> searchResult = baseCarSearchService.baseCarSearch(searchConditionDto);
        log.info("infiniti返回basecar数据 input={} searchResult={}", JSON.toJSONString(searchConditionDto), JSON.toJSONString(searchResult));
        return searchResult;
    }
}
