package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.SeriesImageDO;
import com.chevrolet.dal.dao.domain.query.SeriesImageQuery;
import com.chevrolet.dal.dao.mapper.ext.SeriesImageExtMapper;
import com.chevrolet.dal.dao.manager.SeriesImageManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Manager for SeriesImage.
 */

@Component
public class SeriesImageManagerImpl implements SeriesImageManager{
    
    @Autowired
    protected SeriesImageExtMapper seriesImageExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(SeriesImageQuery query){
        return seriesImageExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(SeriesImageDO record){
        return seriesImageExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(SeriesImageDO record){
        return seriesImageExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<SeriesImageDO> records){
        return seriesImageExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<SeriesImageDO> selectByQuery(SeriesImageQuery query){
        return seriesImageExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<SeriesImageDO> selectByQueryWithPage(SeriesImageQuery query) {
        PageResult<SeriesImageDO> result = new PageResult<SeriesImageDO>();
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
    public SeriesImageDO selectByPrimaryKey(Long id){
        return seriesImageExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(SeriesImageDO record){
        return seriesImageExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SeriesImageDO> list(Long seriesId, Integer type, Integer standard) {
        Map<String, Object> param = new HashMap<>();
        param.put("seriesId", seriesId);
        param.put("type", type);
        param.put("standard", standard);
        return seriesImageExtMapper.list(param);
    }
}