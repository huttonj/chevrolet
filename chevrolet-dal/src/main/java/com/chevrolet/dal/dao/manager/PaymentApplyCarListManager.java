package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.PaymentApplyCarListDO;
import com.chevrolet.dal.dao.domain.query.PaymentApplyCarListQuery;

import java.util.List;


/**
 * Manager for PaymentApplyCarList.
 */
public interface PaymentApplyCarListManager {
    /**
     * query count by query condition.
     */
    int countByQuery(PaymentApplyCarListQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(PaymentApplyCarListDO record);

    /**
     * insert selective.
     */
    long insertSelective(PaymentApplyCarListDO record);

    /**
     * select by query condition.
     */
    List<PaymentApplyCarListDO> selectByQuery(PaymentApplyCarListQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<PaymentApplyCarListDO> selectByQueryWithPage(PaymentApplyCarListQuery query);

    /**
     * select by primary key.
     */
    PaymentApplyCarListDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(PaymentApplyCarListDO record);
}