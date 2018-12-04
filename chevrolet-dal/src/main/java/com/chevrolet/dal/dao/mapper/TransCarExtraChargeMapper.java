package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TransCarExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransCarExtraChargeQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TransCarExtraCharge.
 */
public interface TransCarExtraChargeMapper {
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
    int insertSelective(TransCarExtraChargeDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<TransCarExtraChargeDO> records);

    /**
     * select by query condition.
     */
    List<TransCarExtraChargeDO> selectByQuery(TransCarExtraChargeQuery query);

    /**
     * select by primary key.
     */
    TransCarExtraChargeDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TransCarExtraChargeDO record);
}