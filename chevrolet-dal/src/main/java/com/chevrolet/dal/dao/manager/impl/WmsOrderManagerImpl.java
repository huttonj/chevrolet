package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsOrderDO;
import com.chevrolet.dal.dao.domain.query.WmsOrderQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsOrderExtMapper;
import com.chevrolet.dal.dao.manager.WmsOrderManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsOrder.
 */

@Component
public class WmsOrderManagerImpl implements WmsOrderManager{
    
    @Autowired
    protected WmsOrderExtMapper wmsOrderExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsOrderQuery query){
        return wmsOrderExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsOrderDO record){
        return wmsOrderExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsOrderDO record){
        return wmsOrderExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsOrderDO> selectByQuery(WmsOrderQuery query){
        return wmsOrderExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsOrderDO> selectByQueryWithPage(WmsOrderQuery query) {
        PageResult<WmsOrderDO> result = new PageResult<WmsOrderDO>();
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
    public WmsOrderDO selectByPrimaryKey(Long id){
        return wmsOrderExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsOrderDO record){
        return wmsOrderExtMapper.updateByPrimaryKeySelective(record);
    }
}