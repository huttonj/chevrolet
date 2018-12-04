package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.AllotCarDO;
import com.chevrolet.dal.dao.domain.query.AllotCarQuery;
import com.chevrolet.dal.dao.mapper.ext.AllotCarExtMapper;
import com.chevrolet.dal.dao.manager.AllotCarManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for AllotCar.
 */

@Component
public class AllotCarManagerImpl implements AllotCarManager{
    
    @Autowired
    protected AllotCarExtMapper allotCarExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(AllotCarQuery query){
        return allotCarExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(AllotCarDO record){
        return allotCarExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(AllotCarDO record){
        return allotCarExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<AllotCarDO> selectByQuery(AllotCarQuery query){
        return allotCarExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<AllotCarDO> selectByQueryWithPage(AllotCarQuery query) {
        PageResult<AllotCarDO> result = new PageResult<AllotCarDO>();
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
    public AllotCarDO selectByPrimaryKey(Long id){
        return allotCarExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(AllotCarDO record){
        return allotCarExtMapper.updateByPrimaryKeySelective(record);
    }
}