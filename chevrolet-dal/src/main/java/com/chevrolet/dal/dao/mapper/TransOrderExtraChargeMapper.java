package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TransOrderExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransOrderExtraChargeQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TransOrderExtraCharge.
 */
public interface TransOrderExtraChargeMapper {
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
    int insertSelective(TransOrderExtraChargeDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<TransOrderExtraChargeDO> records);

    /**
     * select by query condition.
     */
    List<TransOrderExtraChargeDO> selectByQuery(TransOrderExtraChargeQuery query);

    /**
     * select by primary key.
     */
    TransOrderExtraChargeDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TransOrderExtraChargeDO record);
}