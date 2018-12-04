package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseStaffRelationDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseStaffRelationQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsWarehouseStaffRelationExtMapper;
import com.chevrolet.dal.dao.manager.WmsWarehouseStaffRelationManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsWarehouseStaffRelation.
 */

@Component
public class WmsWarehouseStaffRelationManagerImpl implements WmsWarehouseStaffRelationManager{
    
    @Autowired
    protected WmsWarehouseStaffRelationExtMapper wmsWarehouseStaffRelationExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsWarehouseStaffRelationQuery query){
        return wmsWarehouseStaffRelationExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsWarehouseStaffRelationDO record){
        return wmsWarehouseStaffRelationExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsWarehouseStaffRelationDO record){
        return wmsWarehouseStaffRelationExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsWarehouseStaffRelationDO> selectByQuery(WmsWarehouseStaffRelationQuery query){
        return wmsWarehouseStaffRelationExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsWarehouseStaffRelationDO> selectByQueryWithPage(WmsWarehouseStaffRelationQuery query) {
        PageResult<WmsWarehouseStaffRelationDO> result = new PageResult<WmsWarehouseStaffRelationDO>();
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
    public WmsWarehouseStaffRelationDO selectByPrimaryKey(Long id){
        return wmsWarehouseStaffRelationExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsWarehouseStaffRelationDO record){
        return wmsWarehouseStaffRelationExtMapper.updateByPrimaryKeySelective(record);
    }
}