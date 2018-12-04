package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.DaasOnlinePriceDO;
import com.chevrolet.dal.dao.domain.query.DaasOnlinePriceQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for DaasOnlinePrice.
 */
public interface DaasOnlinePriceMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(DaasOnlinePriceQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(DaasOnlinePriceDO record);

    /**
     * insert selective.
     */
    int insertSelective(DaasOnlinePriceDO record);

    /**
     * select by query condition.
     */
    List<DaasOnlinePriceDO> selectByQuery(DaasOnlinePriceQuery query);

    /**
     * select by primary key.
     */
    DaasOnlinePriceDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(DaasOnlinePriceDO record);
}