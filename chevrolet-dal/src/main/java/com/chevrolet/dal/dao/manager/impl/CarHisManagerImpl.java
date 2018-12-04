package com.chevrolet.dal.dao.manager.impl;

import com.chevrolet.dal.dao.domain.query.CarHisQuery;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarHisDO;
import com.chevrolet.dal.dao.mapper.ext.CarHisExtMapper;
import com.chevrolet.dal.dao.manager.CarHisManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for CarHis.
 */

@Component
public class CarHisManagerImpl implements CarHisManager{
    
    @Autowired
    protected CarHisExtMapper carHisExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarHisQuery query){
        return carHisExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarHisDO record){
        return carHisExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarHisDO record){
        return carHisExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CarHisDO> selectByQuery(CarHisQuery query){
        return carHisExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarHisDO> selectByQueryWithPage(CarHisQuery query) {
        PageResult<CarHisDO> result = new PageResult<CarHisDO>();
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
    public CarHisDO selectByPrimaryKey(Long id){
        return carHisExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarHisDO record){
        return carHisExtMapper.updateByPrimaryKeySelective(record);
    }
}