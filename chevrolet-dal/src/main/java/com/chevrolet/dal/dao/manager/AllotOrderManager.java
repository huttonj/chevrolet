package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.AllotOrderDO;
import com.chevrolet.dal.dao.domain.query.AllotOrderQuery;

import java.util.List;


/**
 * Manager for AllotOrder.
 */
public interface AllotOrderManager {
    /**
     * query count by query condition.
     */
    int countByQuery(AllotOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(AllotOrderDO record);

    /**
     * insert selective.
     */
    long insertSelective(AllotOrderDO record);

    /**
     * select by query condition.
     */
    List<AllotOrderDO> selectByQuery(AllotOrderQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<AllotOrderDO> selectByQueryWithPage(AllotOrderQuery query);

    /**
     * select by primary key.
     */
    AllotOrderDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(AllotOrderDO record);
}