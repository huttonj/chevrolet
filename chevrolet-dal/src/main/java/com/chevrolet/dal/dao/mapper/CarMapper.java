package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.query.CarQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for Car.
 */
public interface CarMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(CarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarDO record);

    /**
     * insert selective.
     */
    int insertSelective(CarDO record);

    /**
     * select by query condition.
     */
    List<CarDO> selectByQuery(CarQuery query);

    /**
     * select by primary key.
     */
    CarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarDO record);
}