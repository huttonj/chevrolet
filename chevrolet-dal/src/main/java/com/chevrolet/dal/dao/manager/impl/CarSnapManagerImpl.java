package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarSnapDO;
import com.chevrolet.dal.dao.domain.query.CarSnapQuery;
import com.chevrolet.dal.dao.mapper.ext.CarSnapExtMapper;
import com.chevrolet.dal.dao.manager.CarSnapManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for CarSnap.
 */

@Component
public class CarSnapManagerImpl implements CarSnapManager{
    
    @Autowired
    protected CarSnapExtMapper carSnapExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarSnapQuery query){
        return carSnapExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarSnapDO record){
        return carSnapExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarSnapDO record){
        return carSnapExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CarSnapDO> selectByQuery(CarSnapQuery query){
        return carSnapExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarSnapDO> selectByQueryWithPage(CarSnapQuery query) {
        PageResult<CarSnapDO> result = new PageResult<CarSnapDO>();
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
    public CarSnapDO selectByPrimaryKey(Long id){
        return carSnapExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarSnapDO record){
        return carSnapExtMapper.updateByPrimaryKeySelective(record);
    }
}