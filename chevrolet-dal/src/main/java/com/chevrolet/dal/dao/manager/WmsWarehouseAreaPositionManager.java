package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseAreaPositionDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseAreaPositionQuery;

import java.util.List;


/**
 * Manager for WmsWarehouseAreaPosition.
 */
public interface WmsWarehouseAreaPositionManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseAreaPositionQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseAreaPositionDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsWarehouseAreaPositionDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseAreaPositionDO> selectByQuery(WmsWarehouseAreaPositionQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsWarehouseAreaPositionDO> selectByQueryWithPage(WmsWarehouseAreaPositionQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseAreaPositionDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseAreaPositionDO record);
}