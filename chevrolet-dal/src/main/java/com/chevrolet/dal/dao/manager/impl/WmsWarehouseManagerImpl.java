package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsWarehouseExtMapper;
import com.chevrolet.dal.dao.manager.WmsWarehouseManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsWarehouse.
 */

@Component
public class WmsWarehouseManagerImpl implements WmsWarehouseManager{
    
    @Autowired
    protected WmsWarehouseExtMapper wmsWarehouseExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsWarehouseQuery query){
        return wmsWarehouseExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsWarehouseDO record){
        return wmsWarehouseExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsWarehouseDO record){
        return wmsWarehouseExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsWarehouseDO> selectByQuery(WmsWarehouseQuery query){
        return wmsWarehouseExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsWarehouseDO> selectByQueryWithPage(WmsWarehouseQuery query) {
        PageResult<WmsWarehouseDO> result = new PageResult<WmsWarehouseDO>();
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
    public WmsWarehouseDO selectByPrimaryKey(Long id){
        return wmsWarehouseExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsWarehouseDO record){
        return wmsWarehouseExtMapper.updateByPrimaryKeySelective(record);
    }
}