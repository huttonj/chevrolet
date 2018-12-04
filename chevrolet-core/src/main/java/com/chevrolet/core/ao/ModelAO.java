package com.chevrolet.core.ao;

import com.chevrolet.api.dto.request.CarModelGuidePriceRequest;
import com.chevrolet.dal.dao.domain.ModelDO;

import java.util.List;

/**
 * Created by suclogger on 2017/5/16.
 */
public interface ModelAO {

    /**
     * 
     * @param modelDO
     * @return
     */
    Long addModel(ModelDO modelDO);

    /**
     * 根据ID获取车型
     * @param modelId
     * @return
     */
    ModelDO getById(Long modelId);

    /**
     * 根据ID获取车型
     * @param modelName
     * @return
     */
    ModelDO getByName(String modelName);

    /**
     * 根据车系ID获取车型
     * @param seriesId
     * @return
     */
    List<ModelDO> getModelListBySeriesId(Long seriesId);

    /**
     * 根据指导价获取车型
     * @param guidePrice
     * @param status
     * @return
     */
    List<ModelDO> getModelsByGuidePrice(String guidePrice, Integer status);

    /**
     * 根据指导价获取车型(仅限国产和中规) (分页s)
     *
     * @param request
     * @return
     */
    List<ModelDO> getModelsByGuidePriceWithPage(CarModelGuidePriceRequest request);

    /**
     * 根据ID返回车型名
     * @param modelId
     * @return
     */
    String getModelNameById(Long modelId);

    /**
     * 根据ID获取指导价
     *
     * @param modelId
     * @return
     */
    String getGuidePriceById(Long modelId);

    List<ModelDO> getModelList(Long seriesId, Integer standard, Integer status);

}
