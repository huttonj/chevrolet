package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarRiskConfirmDO;
import com.chevrolet.dal.dao.domain.query.CarRiskConfirmQuery;
import com.chevrolet.dal.dao.mapper.ext.CarRiskConfirmExtMapper;
import com.chevrolet.dal.dao.manager.CarRiskConfirmManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for CarRiskConfirm.
 */

@Component
public class CarRiskConfirmManagerImpl implements CarRiskConfirmManager{
    
    @Autowired
    protected CarRiskConfirmExtMapper carRiskConfirmExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarRiskConfirmQuery query){
        return carRiskConfirmExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarRiskConfirmDO record){
        return carRiskConfirmExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarRiskConfirmDO record){
        return carRiskConfirmExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CarRiskConfirmDO> selectByQuery(CarRiskConfirmQuery query){
        return carRiskConfirmExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarRiskConfirmDO> selectByQueryWithPage(CarRiskConfirmQuery query) {
        PageResult<CarRiskConfirmDO> result = new PageResult<CarRiskConfirmDO>();
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
    public CarRiskConfirmDO selectByPrimaryKey(Long id){
        return carRiskConfirmExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarRiskConfirmDO record){
        return carRiskConfirmExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByCarIdSelective(CarRiskConfirmDO record){
        return carRiskConfirmExtMapper.updateByCarIdSelective(record);
    }
}