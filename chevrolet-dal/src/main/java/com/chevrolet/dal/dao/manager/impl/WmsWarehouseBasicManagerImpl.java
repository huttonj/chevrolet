package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseBasicDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseBasicQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsWarehouseBasicExtMapper;
import com.chevrolet.dal.dao.manager.WmsWarehouseBasicManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsWarehouseBasic.
 */

@Component
public class WmsWarehouseBasicManagerImpl implements WmsWarehouseBasicManager{
    
    @Autowired
    protected WmsWarehouseBasicExtMapper wmsWarehouseBasicExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsWarehouseBasicQuery query){
        return wmsWarehouseBasicExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsWarehouseBasicDO record){
        return wmsWarehouseBasicExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsWarehouseBasicDO record){
        return wmsWarehouseBasicExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<WmsWarehouseBasicDO> records){
        return wmsWarehouseBasicExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsWarehouseBasicDO> selectByQuery(WmsWarehouseBasicQuery query){
        return wmsWarehouseBasicExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsWarehouseBasicDO> selectByQueryWithPage(WmsWarehouseBasicQuery query) {
        PageResult<WmsWarehouseBasicDO> result = new PageResult<WmsWarehouseBasicDO>();
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
    public WmsWarehouseBasicDO selectByPrimaryKey(Long id){
        return wmsWarehouseBasicExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsWarehouseBasicDO record){
        return wmsWarehouseBasicExtMapper.updateByPrimaryKeySelective(record);
    }
}