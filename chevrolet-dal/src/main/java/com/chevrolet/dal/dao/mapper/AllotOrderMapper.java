package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.AllotOrderDO;
import com.chevrolet.dal.dao.domain.query.AllotOrderQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for AllotOrder.
 */
public interface AllotOrderMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(AllotOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(AllotOrderDO record);

    /**
     * insert selective.
     */
    int insertSelective(AllotOrderDO record);

    /**
     * select by query condition.
     */
    List<AllotOrderDO> selectByQuery(AllotOrderQuery query);

    /**
     * select by primary key.
     */
    AllotOrderDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(AllotOrderDO record);
}