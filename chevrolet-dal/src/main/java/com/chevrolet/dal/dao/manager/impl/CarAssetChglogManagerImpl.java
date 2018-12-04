package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarAssetChglogDO;
import com.chevrolet.dal.dao.domain.query.CarAssetChglogQuery;
import com.chevrolet.dal.dao.mapper.ext.CarAssetChglogExtMapper;
import com.chevrolet.dal.dao.manager.CarAssetChglogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for CarAssetChglog.
 */

@Component
public class CarAssetChglogManagerImpl implements CarAssetChglogManager{
    
    @Autowired
    protected CarAssetChglogExtMapper carAssetChglogExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarAssetChglogQuery query){
        return carAssetChglogExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarAssetChglogDO record){
        return carAssetChglogExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarAssetChglogDO record){
        return carAssetChglogExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CarAssetChglogDO> selectByQuery(CarAssetChglogQuery query){
        return carAssetChglogExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarAssetChglogDO> selectByQueryWithPage(CarAssetChglogQuery query) {
        PageResult<CarAssetChglogDO> result = new PageResult<CarAssetChglogDO>();
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
    public CarAssetChglogDO selectByPrimaryKey(Long id){
        return carAssetChglogExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarAssetChglogDO record){
        return carAssetChglogExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public  int batchInsert(List<CarAssetChglogDO> carAssetChglogDOS){
        return carAssetChglogExtMapper.batchInsert(carAssetChglogDOS);
    }
}