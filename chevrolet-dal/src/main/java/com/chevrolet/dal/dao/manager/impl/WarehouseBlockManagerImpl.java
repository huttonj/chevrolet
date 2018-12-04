package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WarehouseBlockDO;
import com.chevrolet.dal.dao.domain.query.WarehouseBlockQuery;
import com.chevrolet.dal.dao.mapper.ext.WarehouseBlockExtMapper;
import com.chevrolet.dal.dao.manager.WarehouseBlockManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WarehouseBlock.
 */

@Component
public class WarehouseBlockManagerImpl implements WarehouseBlockManager{
    
    @Autowired
    protected WarehouseBlockExtMapper warehouseBlockExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WarehouseBlockQuery query){
        return warehouseBlockExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WarehouseBlockDO record){
        return warehouseBlockExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WarehouseBlockDO record){
        return warehouseBlockExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<WarehouseBlockDO> records){
        return warehouseBlockExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WarehouseBlockDO> selectByQuery(WarehouseBlockQuery query){
        return warehouseBlockExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WarehouseBlockDO> selectByQueryWithPage(WarehouseBlockQuery query) {
        PageResult<WarehouseBlockDO> result = new PageResult<WarehouseBlockDO>();
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
    public WarehouseBlockDO selectByPrimaryKey(Long id){
        return warehouseBlockExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WarehouseBlockDO record){
        return warehouseBlockExtMapper.updateByPrimaryKeySelective(record);
    }
}