package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TransCarExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransCarExtraChargeQuery;

import java.util.List;
import java.util.Map;


/**
 * Manager for TransCarExtraCharge.
 */
public interface TransCarExtraChargeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TransCarExtraChargeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TransCarExtraChargeDO record);

    /**
     * insert selective.
     */
    long insertSelective(TransCarExtraChargeDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<TransCarExtraChargeDO> records);

    /**
     * select by query condition.
     */
    List<TransCarExtraChargeDO> selectByQuery(TransCarExtraChargeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TransCarExtraChargeDO> selectByQueryWithPage(TransCarExtraChargeQuery query);

    /**
     * select by primary key.
     */
    TransCarExtraChargeDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TransCarExtraChargeDO record);

    /**
     * 通过transportCarIds查询transportCarId与
     * @param transportCarIds
     * @return
     */
    Map<Long, List<TransCarExtraChargeDO>> getTransportCarIdExtraChargeDOsMap (List<Long> transportCarIds, Integer customerCarrierType);
}