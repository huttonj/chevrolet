package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.CarStatusLockDO;
import com.chevrolet.dal.dao.domain.query.CarStatusLockQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for CarStatusLock.
 */
public interface CarStatusLockMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(CarStatusLockQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarStatusLockDO record);

    /**
     * insert selective.
     */
    int insertSelective(CarStatusLockDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<CarStatusLockDO> records);

    /**
     * select by query condition.
     */
    List<CarStatusLockDO> selectByQuery(CarStatusLockQuery query);

    /**
     * select by primary key.
     */
    CarStatusLockDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarStatusLockDO record);
}