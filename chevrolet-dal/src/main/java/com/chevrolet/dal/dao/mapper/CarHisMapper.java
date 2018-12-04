package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.CarHisDO;
import com.chevrolet.dal.dao.domain.query.CarHisQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for CarHis.
 */
public interface CarHisMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(CarHisQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarHisDO record);

    /**
     * insert selective.
     */
    int insertSelective(CarHisDO record);

    /**
     * select by query condition.
     */
    List<CarHisDO> selectByQuery(CarHisQuery query);

    /**
     * select by primary key.
     */
    CarHisDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarHisDO record);
}