package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.AllotCarDO;
import com.chevrolet.dal.dao.domain.query.AllotCarQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for AllotCar.
 */
public interface AllotCarMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(AllotCarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(AllotCarDO record);

    /**
     * insert selective.
     */
    int insertSelective(AllotCarDO record);

    /**
     * select by query condition.
     */
    List<AllotCarDO> selectByQuery(AllotCarQuery query);

    /**
     * select by primary key.
     */
    AllotCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(AllotCarDO record);
}