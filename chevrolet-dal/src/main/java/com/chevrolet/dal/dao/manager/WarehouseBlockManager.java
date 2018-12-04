package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WarehouseBlockDO;
import com.chevrolet.dal.dao.domain.query.WarehouseBlockQuery;

import java.util.List;


/**
 * Manager for WarehouseBlock.
 */
public interface WarehouseBlockManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WarehouseBlockQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WarehouseBlockDO record);

    /**
     * insert selective.
     */
    long insertSelective(WarehouseBlockDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WarehouseBlockDO> records);

    /**
     * select by query condition.
     */
    List<WarehouseBlockDO> selectByQuery(WarehouseBlockQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WarehouseBlockDO> selectByQueryWithPage(WarehouseBlockQuery query);

    /**
     * select by primary key.
     */
    WarehouseBlockDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WarehouseBlockDO record);
}