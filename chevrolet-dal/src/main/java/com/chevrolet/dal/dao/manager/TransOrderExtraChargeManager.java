package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TransOrderExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransOrderExtraChargeQuery;

import java.util.List;
import java.util.Map;


/**
 * Manager for TransOrderExtraCharge.
 */
public interface TransOrderExtraChargeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TransOrderExtraChargeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TransOrderExtraChargeDO record);

    /**
     * insert selective.
     */
    long insertSelective(TransOrderExtraChargeDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<TransOrderExtraChargeDO> records);

    /**
     * select by query condition.
     */
    List<TransOrderExtraChargeDO> selectByQuery(TransOrderExtraChargeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TransOrderExtraChargeDO> selectByQueryWithPage(TransOrderExtraChargeQuery query);

    /**
     * select by primary key.
     */
    TransOrderExtraChargeDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TransOrderExtraChargeDO record);

    /**
     * 通过transportOrderIds查询transportOrderId与TransOrderExtraChargeDOs的映射
     * @param transportOrderIds
     * @return
     */
    Map<Long, List<TransOrderExtraChargeDO>> getTransportOrderIdExtraChargeDOsMap (List<Long> transportOrderIds, Integer customerCarrierType);
}