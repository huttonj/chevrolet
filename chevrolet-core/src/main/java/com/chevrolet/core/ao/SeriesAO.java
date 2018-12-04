package com.chevrolet.core.ao;

import com.chevrolet.api.dto.request.SeriesRequest;
import com.chevrolet.dal.dao.domain.SeriesDO;

import java.util.List;

/**
 * Created by suclogger on 2017/5/17.
 */
public interface SeriesAO {

    List<SeriesDO> getSeriesByBrandId(Long brandId);

    SeriesDO getById(Long seriesId);

    /**
     * 根据id返回车系名
     * @param seriesId
     * @return
     */
    String getSeriesNameById(Long seriesId);

    /**
     * 根据 车规、品牌ID、状态 获取车系
     *
     * @param brandId
     * @param standard
     * @return
     */
    List<SeriesDO> getSeriesList(Long brandId, Integer standard, Integer status);


    /**
     * 获取有效的车系
     *
     * @param partnerId
     * @param brandId
     * @param status
     * @return
     */
    List<SeriesDO> getVaildSeriesList(Long partnerId, Long brandId, Integer status);

    /**
     * 获取有车源的车系
     * @param brandId
     * @return
     */
    List<SeriesDO> getHasCarSeriesByBrandId(Long brandId);

    /**
     * 获取有效的车系
     * @param partnerId
     * @param userId
     * @param brandId
     * @param status
     * @return
     */
    List<SeriesDO> getVaildSeriesList(Long partnerId, Long userId, Long brandId, Integer status);

    /**
     * @param seriesIds
     * @return
     */
    List<SeriesDO> getSeriesByIds(List<Long> seriesIds);

    List<SeriesDO> getVaildSeriesListForAdmin(SeriesRequest form);

}
