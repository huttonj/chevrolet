package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.PaymentApplyCarListDO;
import com.chevrolet.dal.dao.domain.query.PaymentApplyCarListQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for PaymentApplyCarList.
 */
public interface PaymentApplyCarListMapper {
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
    int insertSelective(PaymentApplyCarListDO record);

    /**
     * select by query condition.
     */
    List<PaymentApplyCarListDO> selectByQuery(PaymentApplyCarListQuery query);

    /**
     * select by primary key.
     */
    PaymentApplyCarListDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(PaymentApplyCarListDO record);
}