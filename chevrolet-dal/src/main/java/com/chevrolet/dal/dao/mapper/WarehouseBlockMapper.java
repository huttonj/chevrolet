package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WarehouseBlockDO;
import com.chevrolet.dal.dao.domain.query.WarehouseBlockQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WarehouseBlock.
 */
public interface WarehouseBlockMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WarehouseBlockQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WarehouseBlockDO record);

    /**
     * insert selective.
     */
    int insertSelective(WarehouseBlockDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WarehouseBlockDO> records);

    /**
     * select by query condition.
     */
    List<WarehouseBlockDO> selectByQuery(WarehouseBlockQuery query);

    /**
     * select by primary key.
     */
    WarehouseBlockDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WarehouseBlockDO record);
}