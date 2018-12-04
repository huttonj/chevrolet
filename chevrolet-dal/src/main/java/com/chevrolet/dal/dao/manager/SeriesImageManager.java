package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.SeriesImageDO;
import com.chevrolet.dal.dao.domain.query.SeriesImageQuery;

import java.util.List;
import java.util.Map;


/**
 * Manager for SeriesImage.
 */
public interface SeriesImageManager {
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
    long insertSelective(SeriesImageDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<SeriesImageDO> records);

    /**
     * select by query condition.
     */
    List<SeriesImageDO> selectByQuery(SeriesImageQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<SeriesImageDO> selectByQueryWithPage(SeriesImageQuery query);

    /**
     * select by primary key.
     */
    SeriesImageDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(SeriesImageDO record);

    List<SeriesImageDO> list(Long seriesId, Integer type, Integer standard);
}