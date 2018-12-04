package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.PaymentApplyDO;
import com.chevrolet.dal.dao.domain.query.PaymentApplyQuery;
import com.chevrolet.dal.dao.mapper.ext.PaymentApplyExtMapper;
import com.chevrolet.dal.dao.manager.PaymentApplyManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for PaymentApply.
 */

@Component
public class PaymentApplyManagerImpl implements PaymentApplyManager{
    
    @Autowired
    protected PaymentApplyExtMapper paymentApplyExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(PaymentApplyQuery query){
        return paymentApplyExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(PaymentApplyDO record){
        return paymentApplyExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(PaymentApplyDO record){
        return paymentApplyExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<PaymentApplyDO> selectByQuery(PaymentApplyQuery query){
        return paymentApplyExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<PaymentApplyDO> selectByQueryWithPage(PaymentApplyQuery query) {
        PageResult<PaymentApplyDO> result = new PageResult<PaymentApplyDO>();
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
    public PaymentApplyDO selectByPrimaryKey(Long id){
        return paymentApplyExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(PaymentApplyDO record){
        return paymentApplyExtMapper.updateByPrimaryKeySelective(record);
    }
}