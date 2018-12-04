package com.chevrolet.dal.dao.manager;

import com.chevrolet.api.dto.request.SeriesRequest;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.SeriesDO;
import com.chevrolet.dal.dao.domain.query.SeriesQuery;

import java.util.List;


/**
 * Manager for Series.
 */
public interface SeriesManager {
    /**
     * query count by query condition.
     */
    int countByQuery(SeriesQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(SeriesDO record);

    /**
     * insert selective.
     */
    long insertSelective(SeriesDO record);

    /**
     * select by query condition.
     */
    List<SeriesDO> selectByQuery(SeriesQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<SeriesDO> selectByQueryWithPage(SeriesQuery query);

    /**
     * select by primary key.
     */
    SeriesDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(SeriesDO record);

    /**
     * 查询中规或者国产车的车系
     * @param brandId
     * @param status
     * @return
     */
    List<SeriesDO> getSeriesListByChinaStandard(Long brandId, Integer status);

    /**
     * 根据 车规、品牌ID、状态 获取车系
     * @param brandId
     * @param standard
     * @param status
     * @return
     */
    List<SeriesDO> getSeriesListByBrandAndStandard(Long brandId, Integer standard, Integer status);

    /**
     * 获取有效的车系
     * @param partnerId
     * @param brandId
     * @param status
     * @return
     */
    List<SeriesDO> getVaildSeriesList(Long partnerId, Long brandId, Integer status);

    /**
     * 获取有效的车系
     * @param partnerId
     * @param userId
     * @param brandId
     * @param status
     * @return
     */
    List<SeriesDO> getVaildSeriesList(Long partnerId, Long userId, Long brandId, Integer status);

    List<SeriesDO> getVaildSeriesListForAdmin(SeriesRequest form);
}