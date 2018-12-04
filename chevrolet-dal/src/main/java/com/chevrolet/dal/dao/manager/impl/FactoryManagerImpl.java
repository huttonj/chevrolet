package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.FactoryDO;
import com.chevrolet.dal.dao.domain.query.FactoryQuery;
import com.chevrolet.dal.dao.mapper.ext.FactoryExtMapper;
import com.chevrolet.dal.dao.manager.FactoryManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for Factory.
 */

@Component
public class FactoryManagerImpl implements FactoryManager{

    @Autowired
    protected FactoryExtMapper factoryExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(FactoryQuery query){
        return factoryExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(FactoryDO record){
        return factoryExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(FactoryDO record){
        return factoryExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<FactoryDO> selectByQuery(FactoryQuery query){
        return factoryExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<FactoryDO> selectByQueryWithPage(FactoryQuery query) {
        PageResult<FactoryDO> result = new PageResult<FactoryDO>();
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
    public FactoryDO selectByPrimaryKey(Long id){
        return factoryExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(FactoryDO record){
        return factoryExtMapper.updateByPrimaryKeySelective(record);
    }
}