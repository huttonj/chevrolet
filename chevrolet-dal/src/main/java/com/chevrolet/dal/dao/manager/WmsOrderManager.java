package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsOrderDO;
import com.chevrolet.dal.dao.domain.query.WmsOrderQuery;

import java.util.List;


/**
 * Manager for WmsOrder.
 */
public interface WmsOrderManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsOrderDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsOrderDO record);

    /**
     * select by query condition.
     */
    List<WmsOrderDO> selectByQuery(WmsOrderQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsOrderDO> selectByQueryWithPage(WmsOrderQuery query);

    /**
     * select by primary key.
     */
    WmsOrderDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsOrderDO record);
}