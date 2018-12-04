package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.DaasOnlinePriceDO;
import com.chevrolet.dal.dao.domain.query.DaasOnlinePriceQuery;

import java.util.List;


/**
 * Manager for DaasOnlinePrice.
 */
public interface DaasOnlinePriceManager {
    /**
     * query count by query condition.
     */
    int countByQuery(DaasOnlinePriceQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(DaasOnlinePriceDO record);

    /**
     * insert selective.
     */
    long insertSelective(DaasOnlinePriceDO record);

    /**
     * select by query condition.
     */
    List<DaasOnlinePriceDO> selectByQuery(DaasOnlinePriceQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<DaasOnlinePriceDO> selectByQueryWithPage(DaasOnlinePriceQuery query);

    /**
     * select by primary key.
     */
    DaasOnlinePriceDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(DaasOnlinePriceDO record);

    int batchInsert(List<DaasOnlinePriceDO> daasOnlinePriceDOS);

    int truncateData();
}