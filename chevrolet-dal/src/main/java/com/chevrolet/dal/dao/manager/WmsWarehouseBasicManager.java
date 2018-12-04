package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseBasicDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseBasicQuery;

import java.util.List;


/**
 * Manager for WmsWarehouseBasic.
 */
public interface WmsWarehouseBasicManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseBasicQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseBasicDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsWarehouseBasicDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WmsWarehouseBasicDO> records);

    /**
     * select by query condition.
     */
    List<WmsWarehouseBasicDO> selectByQuery(WmsWarehouseBasicQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsWarehouseBasicDO> selectByQueryWithPage(WmsWarehouseBasicQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseBasicDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseBasicDO record);
}