package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseAreaPositionDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseAreaPositionQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsWarehouseAreaPositionExtMapper;
import com.chevrolet.dal.dao.manager.WmsWarehouseAreaPositionManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsWarehouseAreaPosition.
 */

@Component
public class WmsWarehouseAreaPositionManagerImpl implements WmsWarehouseAreaPositionManager{
    
    @Autowired
    protected WmsWarehouseAreaPositionExtMapper wmsWarehouseAreaPositionExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsWarehouseAreaPositionQuery query){
        return wmsWarehouseAreaPositionExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsWarehouseAreaPositionDO record){
        return wmsWarehouseAreaPositionExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsWarehouseAreaPositionDO record){
        return wmsWarehouseAreaPositionExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsWarehouseAreaPositionDO> selectByQuery(WmsWarehouseAreaPositionQuery query){
        return wmsWarehouseAreaPositionExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsWarehouseAreaPositionDO> selectByQueryWithPage(WmsWarehouseAreaPositionQuery query) {
        PageResult<WmsWarehouseAreaPositionDO> result = new PageResult<WmsWarehouseAreaPositionDO>();
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
    public WmsWarehouseAreaPositionDO selectByPrimaryKey(Long id){
        return wmsWarehouseAreaPositionExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsWarehouseAreaPositionDO record){
        return wmsWarehouseAreaPositionExtMapper.updateByPrimaryKeySelective(record);
    }
}