package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseStaffRelationDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseStaffRelationQuery;

import java.util.List;


/**
 * Manager for WmsWarehouseStaffRelation.
 */
public interface WmsWarehouseStaffRelationManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseStaffRelationQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseStaffRelationDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsWarehouseStaffRelationDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseStaffRelationDO> selectByQuery(WmsWarehouseStaffRelationQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsWarehouseStaffRelationDO> selectByQueryWithPage(WmsWarehouseStaffRelationQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseStaffRelationDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseStaffRelationDO record);
}