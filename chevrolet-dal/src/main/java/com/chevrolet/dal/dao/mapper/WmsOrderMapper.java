package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsOrderDO;
import com.chevrolet.dal.dao.domain.query.WmsOrderQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsOrder.
 */
public interface WmsOrderMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsOrderDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsOrderDO record);

    /**
     * select by query condition.
     */
    List<WmsOrderDO> selectByQuery(WmsOrderQuery query);

    /**
     * select by primary key.
     */
    WmsOrderDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsOrderDO record);
}