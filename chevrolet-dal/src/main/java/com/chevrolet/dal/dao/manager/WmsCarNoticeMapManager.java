package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarNoticeMapDO;
import com.chevrolet.dal.dao.domain.query.WmsCarNoticeMapQuery;

import java.util.List;


/**
 * Manager for WmsCarNoticeMap.
 */
public interface WmsCarNoticeMapManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarNoticeMapQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarNoticeMapDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsCarNoticeMapDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WmsCarNoticeMapDO> records);

    /**
     * select by query condition.
     */
    List<WmsCarNoticeMapDO> selectByQuery(WmsCarNoticeMapQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsCarNoticeMapDO> selectByQueryWithPage(WmsCarNoticeMapQuery query);

    /**
     * select by primary key.
     */
    WmsCarNoticeMapDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarNoticeMapDO record);

    
    List<WmsCarNoticeMapDO> selectByNoticeIds(List<Long> limitNoticeIds);
}