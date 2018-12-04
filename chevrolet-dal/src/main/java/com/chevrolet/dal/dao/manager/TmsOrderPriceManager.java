package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsOrderPriceDO;
import com.chevrolet.dal.dao.domain.query.TmsOrderPriceQuery;

import java.util.List;


/**
 * Manager for TmsOrderPrice.
 */
public interface TmsOrderPriceManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsOrderPriceQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsOrderPriceDO record);

    /**
     * insert selective.
     */
    long insertSelective(TmsOrderPriceDO record);

    /**
     * select by query condition.
     */
    List<TmsOrderPriceDO> selectByQuery(TmsOrderPriceQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TmsOrderPriceDO> selectByQueryWithPage(TmsOrderPriceQuery query);

    /**
     * select by primary key.
     */
    TmsOrderPriceDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsOrderPriceDO record);
}