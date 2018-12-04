package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.CarSnapDO;
import com.chevrolet.dal.dao.domain.query.CarSnapQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for CarSnap.
 */
public interface CarSnapMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(CarSnapQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarSnapDO record);

    /**
     * insert selective.
     */
    int insertSelective(CarSnapDO record);

    /**
     * select by query condition.
     */
    List<CarSnapDO> selectByQuery(CarSnapQuery query);

    /**
     * select by primary key.
     */
    CarSnapDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarSnapDO record);
}