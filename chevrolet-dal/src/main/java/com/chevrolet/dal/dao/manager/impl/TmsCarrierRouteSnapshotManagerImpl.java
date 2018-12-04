package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsCarrierRouteSnapshotDO;
import com.chevrolet.dal.dao.domain.query.TmsCarrierRouteSnapshotQuery;
import com.chevrolet.dal.dao.mapper.ext.TmsCarrierRouteSnapshotExtMapper;
import com.chevrolet.dal.dao.manager.TmsCarrierRouteSnapshotManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for TmsCarrierRouteSnapshot.
 */

@Component
public class TmsCarrierRouteSnapshotManagerImpl implements TmsCarrierRouteSnapshotManager{
    
    @Autowired
    protected TmsCarrierRouteSnapshotExtMapper tmsCarrierRouteSnapshotExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TmsCarrierRouteSnapshotQuery query){
        return tmsCarrierRouteSnapshotExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TmsCarrierRouteSnapshotDO record){
        return tmsCarrierRouteSnapshotExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TmsCarrierRouteSnapshotDO record){
        return tmsCarrierRouteSnapshotExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TmsCarrierRouteSnapshotDO> selectByQuery(TmsCarrierRouteSnapshotQuery query){
        return tmsCarrierRouteSnapshotExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TmsCarrierRouteSnapshotDO> selectByQueryWithPage(TmsCarrierRouteSnapshotQuery query) {
        PageResult<TmsCarrierRouteSnapshotDO> result = new PageResult<TmsCarrierRouteSnapshotDO>();
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
    public TmsCarrierRouteSnapshotDO selectByPrimaryKey(Long id){
        return tmsCarrierRouteSnapshotExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TmsCarrierRouteSnapshotDO record){
        return tmsCarrierRouteSnapshotExtMapper.updateByPrimaryKeySelective(record);
    }
}