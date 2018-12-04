package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseEntryNoticeDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseEntryNoticeQuery;

import java.util.List;


/**
 * Manager for WmsWarehouseEntryNotice.
 */
public interface WmsWarehouseEntryNoticeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseEntryNoticeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseEntryNoticeDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsWarehouseEntryNoticeDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseEntryNoticeDO> selectByQuery(WmsWarehouseEntryNoticeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsWarehouseEntryNoticeDO> selectByQueryWithPage(WmsWarehouseEntryNoticeQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseEntryNoticeDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseEntryNoticeDO record);

    List<WmsWarehouseEntryNoticeDO> selectNewNoticeDO(List<Long> wmsCarIds);
}