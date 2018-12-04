package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.AllotOrderDO;
import com.chevrolet.dal.dao.domain.query.AllotOrderQuery;
import com.chevrolet.dal.dao.mapper.ext.AllotOrderExtMapper;
import com.chevrolet.dal.dao.manager.AllotOrderManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for AllotOrder.
 */

@Component
public class AllotOrderManagerImpl implements AllotOrderManager{
    
    @Autowired
    protected AllotOrderExtMapper allotOrderExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(AllotOrderQuery query){
        return allotOrderExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(AllotOrderDO record){
        return allotOrderExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(AllotOrderDO record){
        return allotOrderExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<AllotOrderDO> selectByQuery(AllotOrderQuery query){
        return allotOrderExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<AllotOrderDO> selectByQueryWithPage(AllotOrderQuery query) {
        PageResult<AllotOrderDO> result = new PageResult<AllotOrderDO>();
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
    public AllotOrderDO selectByPrimaryKey(Long id){
        return allotOrderExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(AllotOrderDO record){
        return allotOrderExtMapper.updateByPrimaryKeySelective(record);
    }
}