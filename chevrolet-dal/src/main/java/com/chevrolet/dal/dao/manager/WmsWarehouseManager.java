package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseQuery;

import java.util.List;


/**
 * Manager for WmsWarehouse.
 */
public interface WmsWarehouseManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsWarehouseDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseDO> selectByQuery(WmsWarehouseQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsWarehouseDO> selectByQueryWithPage(WmsWarehouseQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseDO record);
}