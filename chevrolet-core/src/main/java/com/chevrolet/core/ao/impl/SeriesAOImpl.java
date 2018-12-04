package com.chevrolet.core.ao.impl;

import com.chevrolet.api.dto.request.SeriesRequest;
import com.chevrolet.api.enums.CarStandardEnum;
import com.chevrolet.core.ao.SeriesAO;
import com.chevrolet.core.enums.PrefixEnum;
import com.chevrolet.core.enums.StandardEnum;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.SeriesDO;
import com.chevrolet.dal.dao.domain.query.SeriesQuery;
import com.chevrolet.dal.dao.manager.SeriesManager;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by suclogger on 2017/5/17.
 */
@Component
public class SeriesAOImpl implements SeriesAO {

    @Autowired
    private SeriesManager seriesManager;
    
    @Autowired
    private RedisWrapper redisManager;

    @Override
    public List<SeriesDO> getSeriesByBrandId(Long brandId) {
        SeriesQuery query = new SeriesQuery();
        query.or().andBrandIdEqualTo(brandId);
        // 先根据厂商划分
        query.setOrderByClause("factory_id asc,rank desc");
        return seriesManager.selectByQuery(query);
    }

    @Override
    public SeriesDO getById(Long seriesId) {
        return seriesManager.selectByPrimaryKey(seriesId);
    }

    @Override
    public String getSeriesNameById(Long seriesId) {
        if(seriesId == null || seriesId < 0) {
            return null;
        }
        String seriesName = redisManager.getString(PrefixEnum.cc_seriesName_by_id.getKey(seriesId));
        if(!StringUtils.isEmpty(seriesName)) {
            return seriesName;
        }
        seriesName = seriesManager.selectByPrimaryKey(seriesId).getSeriesName();
        redisManager.putAsync(PrefixEnum.cc_seriesName_by_id.getKey(seriesId), seriesName,  36000);
        return seriesName;
    }

    @Override
    public List<SeriesDO> getSeriesList(Long brandId, Integer standard, Integer status) {
        //中规车 查询中规或国产
        if (standard.intValue() == CarStandardEnum.China.value()) {
            return seriesManager.getSeriesListByChinaStandard(brandId, status);
        } else {
            return seriesManager.getSeriesListByBrandAndStandard(brandId, StandardEnum.getStandard(standard), status);
        }
    }

    @Override
    public List<SeriesDO> getVaildSeriesList(Long partnerId, Long brandId, Integer status) {
        return seriesManager.getVaildSeriesList(partnerId, brandId, status);
    }

    @Override
    public List<SeriesDO> getHasCarSeriesByBrandId(Long brandId) {
        SeriesQuery query = new SeriesQuery();
        query.or().andBrandIdEqualTo(brandId).andCarsNumberGreaterThan(0l);
        query.setOrderByClause("factory_id asc,rank desc");
        return seriesManager.selectByQuery(query);
    }

    @Override
    public List<SeriesDO> getVaildSeriesList(Long partnerId, Long userId, Long brandId, Integer status) {
        return seriesManager.getVaildSeriesList(partnerId, userId, brandId, status);
    }

    @Override
    public List<SeriesDO> getSeriesByIds(List<Long> seriesIds) {
        SeriesQuery query = new SeriesQuery();
        query.or().andSeriesIdIn(seriesIds);
        return seriesManager.selectByQuery(query);
    }

    @Override
    public List<SeriesDO> getVaildSeriesListForAdmin(SeriesRequest form) {
        return seriesManager.getVaildSeriesListForAdmin(form);
    }
}
