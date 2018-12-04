package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TmsCarDO;
import com.chevrolet.dal.dao.domain.query.TmsCarQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TmsCar.
 */
public interface TmsCarMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsCarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsCarDO record);

    /**
     * insert selective.
     */
    int insertSelective(TmsCarDO record);

    /**
     * select by query condition.
     */
    List<TmsCarDO> selectByQuery(TmsCarQuery query);

    /**
     * select by primary key.
     */
    TmsCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsCarDO record);
}