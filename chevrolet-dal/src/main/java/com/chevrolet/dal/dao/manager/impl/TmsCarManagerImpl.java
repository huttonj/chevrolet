package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsCarDO;
import com.chevrolet.dal.dao.domain.query.TmsCarQuery;
import com.chevrolet.dal.dao.mapper.ext.TmsCarExtMapper;
import com.chevrolet.dal.dao.manager.TmsCarManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for TmsCar.
 */

@Component
public class TmsCarManagerImpl implements TmsCarManager{
    
    @Autowired
    protected TmsCarExtMapper tmsCarExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TmsCarQuery query){
        return tmsCarExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TmsCarDO record){
        return tmsCarExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TmsCarDO record){
        return tmsCarExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TmsCarDO> selectByQuery(TmsCarQuery query){
        return tmsCarExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TmsCarDO> selectByQueryWithPage(TmsCarQuery query) {
        PageResult<TmsCarDO> result = new PageResult<TmsCarDO>();
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
    public TmsCarDO selectByPrimaryKey(Long id){
        return tmsCarExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TmsCarDO record){
        return tmsCarExtMapper.updateByPrimaryKeySelective(record);
    }
}