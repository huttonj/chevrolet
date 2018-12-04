package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.PaymentApplyDO;
import com.chevrolet.dal.dao.domain.query.PaymentApplyQuery;

import java.util.List;


/**
 * Manager for PaymentApply.
 */
public interface PaymentApplyManager {
    /**
     * query count by query condition.
     */
    int countByQuery(PaymentApplyQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(PaymentApplyDO record);

    /**
     * insert selective.
     */
    long insertSelective(PaymentApplyDO record);

    /**
     * select by query condition.
     */
    List<PaymentApplyDO> selectByQuery(PaymentApplyQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<PaymentApplyDO> selectByQueryWithPage(PaymentApplyQuery query);

    /**
     * select by primary key.
     */
    PaymentApplyDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(PaymentApplyDO record);
}