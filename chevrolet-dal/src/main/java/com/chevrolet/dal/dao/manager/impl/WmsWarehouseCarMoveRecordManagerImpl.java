package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseCarMoveRecordDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseCarMoveRecordQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsWarehouseCarMoveRecordExtMapper;
import com.chevrolet.dal.dao.manager.WmsWarehouseCarMoveRecordManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsWarehouseCarMoveRecord.
 */

@Component
public class WmsWarehouseCarMoveRecordManagerImpl implements WmsWarehouseCarMoveRecordManager{
    
    @Autowired
    protected WmsWarehouseCarMoveRecordExtMapper wmsWarehouseCarMoveRecordExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsWarehouseCarMoveRecordQuery query){
        return wmsWarehouseCarMoveRecordExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsWarehouseCarMoveRecordDO record){
        return wmsWarehouseCarMoveRecordExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsWarehouseCarMoveRecordDO record){
        return wmsWarehouseCarMoveRecordExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsWarehouseCarMoveRecordDO> selectByQuery(WmsWarehouseCarMoveRecordQuery query){
        return wmsWarehouseCarMoveRecordExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsWarehouseCarMoveRecordDO> selectByQueryWithPage(WmsWarehouseCarMoveRecordQuery query) {
        PageResult<WmsWarehouseCarMoveRecordDO> result = new PageResult<WmsWarehouseCarMoveRecordDO>();
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
    public WmsWarehouseCarMoveRecordDO selectByPrimaryKey(Long id){
        return wmsWarehouseCarMoveRecordExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsWarehouseCarMoveRecordDO record){
        return wmsWarehouseCarMoveRecordExtMapper.updateByPrimaryKeySelective(record);
    }
}