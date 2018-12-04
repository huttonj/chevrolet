package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.PaymentApplyDO;
import com.chevrolet.dal.dao.domain.query.PaymentApplyQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for PaymentApply.
 */
public interface PaymentApplyMapper {
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
    int insertSelective(PaymentApplyDO record);

    /**
     * select by query condition.
     */
    List<PaymentApplyDO> selectByQuery(PaymentApplyQuery query);

    /**
     * select by primary key.
     */
    PaymentApplyDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(PaymentApplyDO record);
}