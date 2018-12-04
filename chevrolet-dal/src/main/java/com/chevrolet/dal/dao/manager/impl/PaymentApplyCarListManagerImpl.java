package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.PaymentApplyCarListDO;
import com.chevrolet.dal.dao.domain.query.PaymentApplyCarListQuery;
import com.chevrolet.dal.dao.mapper.ext.PaymentApplyCarListExtMapper;
import com.chevrolet.dal.dao.manager.PaymentApplyCarListManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for PaymentApplyCarList.
 */

@Component
public class PaymentApplyCarListManagerImpl implements PaymentApplyCarListManager{
    
    @Autowired
    protected PaymentApplyCarListExtMapper paymentApplyCarListExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(PaymentApplyCarListQuery query){
        return paymentApplyCarListExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(PaymentApplyCarListDO record){
        return paymentApplyCarListExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(PaymentApplyCarListDO record){
        return paymentApplyCarListExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<PaymentApplyCarListDO> selectByQuery(PaymentApplyCarListQuery query){
        return paymentApplyCarListExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<PaymentApplyCarListDO> selectByQueryWithPage(PaymentApplyCarListQuery query) {
        PageResult<PaymentApplyCarListDO> result = new PageResult<PaymentApplyCarListDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public PaymentApplyCarListDO selectByPrimaryKey(Long id){
        return paymentApplyCarListExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(PaymentApplyCarListDO record){
        return paymentApplyCarListExtMapper.updateByPrimaryKeySelective(record);
    }
}