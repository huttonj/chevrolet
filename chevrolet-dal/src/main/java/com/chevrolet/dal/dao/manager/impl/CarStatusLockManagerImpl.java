package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarStatusLockDO;
import com.chevrolet.dal.dao.domain.query.CarStatusLockQuery;
import com.chevrolet.dal.dao.mapper.ext.CarStatusLockExtMapper;
import com.chevrolet.dal.dao.manager.CarStatusLockManager;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


/**
 * Manager for CarStatusLock.
 */

@Component
public class CarStatusLockManagerImpl implements CarStatusLockManager{
    
    @Autowired
    protected CarStatusLockExtMapper carStatusLockExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarStatusLockQuery query){
        return carStatusLockExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarStatusLockDO record){
        return carStatusLockExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarStatusLockDO record){
        return carStatusLockExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CarStatusLockDO> selectByQuery(CarStatusLockQuery query){
        return carStatusLockExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarStatusLockDO> selectByQueryWithPage(CarStatusLockQuery query) {
        PageResult<CarStatusLockDO> result = new PageResult<CarStatusLockDO>();
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
    public CarStatusLockDO selectByPrimaryKey(Long id){
        return carStatusLockExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarStatusLockDO record){
        return carStatusLockExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int batchUpdateByCarLockId(CarStatusLockDO carStatusLockDO, List<Long> carStatusLockIds){
        return carStatusLockExtMapper.batchUpdateByCarLockId(carStatusLockDO,carStatusLockIds);
    }

    @Override
    public int lockByWhereClauseWithLock(List<Long> carIds, Integer bizType, String bizNo, Date expireTime){
        return carStatusLockExtMapper.lockByWhereClauseWithLock(carIds,bizType,bizNo,expireTime);
    }

    @Override
    public int unlockByWhereClauseWithLock(List<Long> carIds, Integer bizType, String bizNo){
        return carStatusLockExtMapper.unlockByWhereClauseWithLock(carIds,bizType,bizNo);
    }

    @Override
    public int batchInsert(List<CarStatusLockDO> carStatusLockDOS){
        return carStatusLockExtMapper.batchInsert(carStatusLockDOS);
    }

    @Override
    public int autoDiscardCarLock(){
        return carStatusLockExtMapper.autoDiscardCarLock();
    }
}