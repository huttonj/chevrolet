package com.chevrolet.dal.dao.manager.impl;

import com.chevrolet.api.dto.request.SeriesRequest;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.SeriesDO;
import com.chevrolet.dal.dao.domain.query.SeriesQuery;
import com.chevrolet.dal.dao.mapper.ext.SeriesExtMapper;
import com.chevrolet.dal.dao.manager.SeriesManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Manager for Series.
 */

@Component
public class SeriesManagerImpl implements SeriesManager{

    @Autowired
    protected SeriesExtMapper seriesExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(SeriesQuery query){
        return seriesExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(SeriesDO record){
        return seriesExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(SeriesDO record){
        return seriesExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<SeriesDO> selectByQuery(SeriesQuery query){
        return seriesExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<SeriesDO> selectByQueryWithPage(SeriesQuery query) {
        PageResult<SeriesDO> result = new PageResult<SeriesDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public SeriesDO selectByPrimaryKey(Long id){
        return seriesExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(SeriesDO record){
        return seriesExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SeriesDO> getSeriesListByChinaStandard(Long brandId, Integer status) {
        return seriesExtMapper.getSeriesListByBrandAndChinaStandard(brandId, status);
    }

    @Override
    public List<SeriesDO> getSeriesListByBrandAndStandard(Long brandId, Integer standard, Integer status) {
        Map<String, Object> param = new HashMap<>();
        param.put("brandId", brandId);
        param.put("standard", standard);
        param.put("status", status);
        return seriesExtMapper.getSeriesListByBrandAndStandard(param);
    }

    @Override
    public List<SeriesDO> getVaildSeriesList(Long partnerId, Long brandId, Integer status) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partnerId", partnerId);
        params.put("brandId", brandId);
        params.put("status", status);
        return seriesExtMapper.listVaild(params);
    }

    @Override
    public List<SeriesDO> getVaildSeriesList(Long partnerId, Long userId, Long brandId, Integer status) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("partnerId", partnerId);
        params.put("brandId", brandId);
        params.put("status", status);
        params.put("userId", userId);
        return seriesExtMapper.listVaild(params);
    }

    @Override
    public List<SeriesDO> getVaildSeriesListForAdmin(SeriesRequest form) {
        Map<String, Object> params = new HashMap<>();
        params.put("partnerId", form.getPartnerId());
        params.put("brandId", form.getBrandId());
        params.put("status", form.getStatus());
        params.put("creator", form.getUserId());
        return seriesExtMapper.listVaildForAdmin(params);
    }
}