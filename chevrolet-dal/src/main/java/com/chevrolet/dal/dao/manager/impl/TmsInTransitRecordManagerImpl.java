package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsInTransitRecordDO;
import com.chevrolet.dal.dao.domain.query.TmsInTransitRecordQuery;
import com.chevrolet.dal.dao.mapper.ext.TmsInTransitRecordExtMapper;
import com.chevrolet.dal.dao.manager.TmsInTransitRecordManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for TmsInTransitRecord.
 */

@Component
public class TmsInTransitRecordManagerImpl implements TmsInTransitRecordManager{
    
    @Autowired
    protected TmsInTransitRecordExtMapper tmsInTransitRecordExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TmsInTransitRecordQuery query){
        return tmsInTransitRecordExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TmsInTransitRecordDO record){
        return tmsInTransitRecordExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TmsInTransitRecordDO record){
        return tmsInTransitRecordExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TmsInTransitRecordDO> selectByQuery(TmsInTransitRecordQuery query){
        return tmsInTransitRecordExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TmsInTransitRecordDO> selectByQueryWithPage(TmsInTransitRecordQuery query) {
        PageResult<TmsInTransitRecordDO> result = new PageResult<TmsInTransitRecordDO>();
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
    public TmsInTransitRecordDO selectByPrimaryKey(Long id){
        return tmsInTransitRecordExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TmsInTransitRecordDO record){
        return tmsInTransitRecordExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<TmsInTransitRecordDO> getLatestTmsInTransitRecordDOByTransportCarIdList(List<Long> transportCarIdList) {
        return tmsInTransitRecordExtMapper.getLatestTmsInTransitRecordDOByTransportCarIdList(transportCarIdList);
    }
}