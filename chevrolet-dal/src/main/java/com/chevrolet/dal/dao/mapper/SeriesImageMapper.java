package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.SeriesImageDO;
import com.chevrolet.dal.dao.domain.query.SeriesImageQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for SeriesImage.
 */
public interface SeriesImageMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(SeriesImageQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(SeriesImageDO record);

    /**
     * insert selective.
     */
    int insertSelective(SeriesImageDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<SeriesImageDO> records);

    /**
     * select by query condition.
     */
    List<SeriesImageDO> selectByQuery(SeriesImageQuery query);

    /**
     * select by primary key.
     */
    SeriesImageDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(SeriesImageDO record);
}