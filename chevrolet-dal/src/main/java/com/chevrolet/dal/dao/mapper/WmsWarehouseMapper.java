package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsWarehouseDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsWarehouse.
 */
public interface WmsWarehouseMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsWarehouseDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseDO> selectByQuery(WmsWarehouseQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseDO record);
}