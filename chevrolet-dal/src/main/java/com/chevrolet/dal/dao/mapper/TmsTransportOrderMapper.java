package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TmsTransportOrderDO;
import com.chevrolet.dal.dao.domain.query.TmsTransportOrderQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TmsTransportOrder.
 */
public interface TmsTransportOrderMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsTransportOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsTransportOrderDO record);

    /**
     * insert selective.
     */
    int insertSelective(TmsTransportOrderDO record);

    /**
     * select by query condition.
     */
    List<TmsTransportOrderDO> selectByQuery(TmsTransportOrderQuery query);

    /**
     * select by primary key.
     */
    TmsTransportOrderDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsTransportOrderDO record);
}