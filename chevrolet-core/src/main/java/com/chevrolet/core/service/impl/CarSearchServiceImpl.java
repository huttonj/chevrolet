package com.chevrolet.core.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.CarFuzzyQuery;
import com.chevrolet.api.service.CarSearchService;
import com.chevrolet.core.ao.CarSearchAO;
import com.subaru.common.entity.BizResult;
import com.subaru.common.entity.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author maihe
 */
@Slf4j
@Component
@Service(interfaceClass = CarSearchService.class)
public class CarSearchServiceImpl implements CarSearchService {

    @Autowired
    private CarSearchAO carSearchAO;

    @Override
    public BizResult<List<BaseCarDTO>> queryCarDetailPagination(CarFuzzyQuery carFuzzyQuery){
        try {
            log.info("CarSearchService queryCarDetailPagination : {}", JSON.toJSONString(carFuzzyQuery));
            //数据读取
            List<Long> carIds = carFuzzyQuery.getCarIds();
            List<String> carUniques = carFuzzyQuery.getCarUniques();
            String carUnique = carFuzzyQuery.getCarUnique();
            String modelName = carFuzzyQuery.getModelName();
            Long assetRight = carFuzzyQuery.getAssetRight();
            Integer assetRightType = carFuzzyQuery.getAssetRightType();
            String fuzzyField = carFuzzyQuery.getFuzzyField();
            Integer pageSize = carFuzzyQuery.getPageSize();
            Integer pageOffset = carFuzzyQuery.getPageOffset();

            if (carFuzzyQuery.getIsPaged() == 0 /*不分页*/) {
                return BizResult.create(carSearchAO.queryCarDetailPagination(carIds, carUniques, carUnique, modelName, assetRight,assetRightType, fuzzyField,null, null));
            } else {
                return BizResult.create(carSearchAO.queryCarDetailPagination(carIds, carUniques, carUnique, modelName, assetRight,assetRightType,fuzzyField,pageSize, pageOffset));
            }
        } catch (Exception e) {
            log.error("车辆中心模糊查询失败，carFuzzyQuery={} e={}", JSON.toJSONString(carFuzzyQuery), e);
            return BizResult.create(ErrorCodeEnum.QUERY_FAIL);
        }
    }
}
