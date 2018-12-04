package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TmsOrderPriceDO;
import com.chevrolet.dal.dao.domain.query.TmsOrderPriceQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TmsOrderPrice.
 */
public interface TmsOrderPriceMapper {
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
    int insertSelective(TmsOrderPriceDO record);

    /**
     * select by query condition.
     */
    List<TmsOrderPriceDO> selectByQuery(TmsOrderPriceQuery query);

    /**
     * select by primary key.
     */
    TmsOrderPriceDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsOrderPriceDO record);
}