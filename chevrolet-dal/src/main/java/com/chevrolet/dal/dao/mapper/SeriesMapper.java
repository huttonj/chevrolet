package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.SeriesDO;
import com.chevrolet.dal.dao.domain.query.SeriesQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for Series.
 */
public interface SeriesMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(SeriesQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(SeriesDO record);

    /**
     * insert selective.
     */
    int insertSelective(SeriesDO record);

    /**
     * select by query condition.
     */
    List<SeriesDO> selectByQuery(SeriesQuery query);

    /**
     * select by primary key.
     */
    SeriesDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(SeriesDO record);
}