package com.chevrolet.core.ao.impl;

import com.chevrolet.api.dto.request.CarModelGuidePriceRequest;
import com.chevrolet.api.enums.CarStandardEnum;
import com.chevrolet.core.ao.ModelAO;
import com.chevrolet.core.enums.PrefixEnum;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.ModelDO;
import com.chevrolet.dal.dao.domain.query.ModelQuery;
import com.chevrolet.dal.dao.manager.ModelManager;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by suclogger on 2017/5/16.
 */
@Component
public class ModelAOImpl implements ModelAO {

    @Autowired
    private ModelManager modelManager;

    @Autowired
    private RedisWrapper redisManager;

    @Override
    public Long addModel(ModelDO modelDO) {
        modelDO.setGmtCreate(new Date());
        modelDO.setGmtCreate(new Date());
        return modelManager.insertSelective(modelDO);
    }

    @Override
    public ModelDO getById(Long modelId) {
        return modelManager.selectByPrimaryKey(modelId);
    }

    @Override
    public ModelDO getByName(String modelName){
        ModelQuery modelQuery = new ModelQuery();
        modelQuery.or().andModelNameEqualTo(modelName);
        List<ModelDO> modelDOS = modelManager.selectByQuery(modelQuery);
        if(!CollectionUtils.isEmpty(modelDOS)){
            return modelDOS.get(0);
        }
        return null;
    }

    @Override
    public List<ModelDO> getModelListBySeriesId(Long seriesId) {
        ModelQuery modelQuery = new ModelQuery();
        modelQuery.or().andSeriesIdEqualTo(seriesId);
        modelQuery.setOrderByClause("rank desc");
        return modelManager.selectByQuery(modelQuery);
    }

    @Override
    public List<ModelDO> getModelsByGuidePrice(String guidePrice, Integer status) {
        return modelManager.getModelsByGuidePrice(guidePrice, status);
    }

    @Override
    public List<ModelDO> getModelsByGuidePriceWithPage(CarModelGuidePriceRequest request) {
        return modelManager.getModelsByGuidePriceWithPage(request.getGuidePrice(), request.getStatus(), request.getStart(), request.getPageSize());
    }

    @Override
    public String getModelNameById(Long modelId) {
        if(modelId == null || modelId < 0) {
            return null;
        }
        String modelName = redisManager.getString(PrefixEnum.cc_modelName_by_id.getKey(modelId));
        if(!StringUtils.isEmpty(modelName)) {
            return modelName;
        }
        modelName = modelManager.selectByPrimaryKey(modelId).getModelName();
        redisManager.putAsync(PrefixEnum.cc_modelName_by_id.getKey(modelId) + String.valueOf(modelId), modelName ,36000);
        return modelName;
    }

    @Override
    public String getGuidePriceById(Long modelId) {
        if(modelId == null || modelId < 0) {
            return null;
        }
        String guidePrice = redisManager.getString(PrefixEnum.cc_guidePrice_by_id.getKey(modelId));
        if(!StringUtils.isEmpty(guidePrice)) {
            return guidePrice;
        }
        guidePrice = modelManager.selectByPrimaryKey(modelId).getGuidePrice();
        redisManager.putAsync(PrefixEnum.cc_guidePrice_by_id.getKey(modelId), guidePrice, 36000);
        return guidePrice;
    }

    @Override
    public List<ModelDO> getModelList(Long seriesId, Integer standard, Integer status) {
        //中规车 查询中规车或国产
        if (standard.intValue() == CarStandardEnum.China.value()) {
            return modelManager.getModelsBySeriesAndChinaStandard(seriesId, status);
        } else {
            return modelManager.getModelsBySeriesAndStandard(seriesId, standard, status);
        }
    }

}
