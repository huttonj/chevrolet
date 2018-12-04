package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseCarMoveRecordDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseCarMoveRecordQuery;

import java.util.List;


/**
 * Manager for WmsWarehouseCarMoveRecord.
 */
public interface WmsWarehouseCarMoveRecordManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseCarMoveRecordQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseCarMoveRecordDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsWarehouseCarMoveRecordDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseCarMoveRecordDO> selectByQuery(WmsWarehouseCarMoveRecordQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsWarehouseCarMoveRecordDO> selectByQueryWithPage(WmsWarehouseCarMoveRecordQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseCarMoveRecordDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseCarMoveRecordDO record);
}