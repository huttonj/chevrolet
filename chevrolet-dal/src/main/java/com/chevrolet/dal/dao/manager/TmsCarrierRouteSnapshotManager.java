package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsCarrierRouteSnapshotDO;
import com.chevrolet.dal.dao.domain.query.TmsCarrierRouteSnapshotQuery;

import java.util.List;


/**
 * Manager for TmsCarrierRouteSnapshot.
 */
public interface TmsCarrierRouteSnapshotManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsCarrierRouteSnapshotQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsCarrierRouteSnapshotDO record);

    /**
     * insert selective.
     */
    long insertSelective(TmsCarrierRouteSnapshotDO record);

    /**
     * select by query condition.
     */
    List<TmsCarrierRouteSnapshotDO> selectByQuery(TmsCarrierRouteSnapshotQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TmsCarrierRouteSnapshotDO> selectByQueryWithPage(TmsCarrierRouteSnapshotQuery query);

    /**
     * select by primary key.
     */
    TmsCarrierRouteSnapshotDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsCarrierRouteSnapshotDO record);
}