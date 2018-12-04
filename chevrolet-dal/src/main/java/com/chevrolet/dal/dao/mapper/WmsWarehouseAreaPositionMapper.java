package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsWarehouseAreaPositionDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseAreaPositionQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsWarehouseAreaPosition.
 */
public interface WmsWarehouseAreaPositionMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseAreaPositionQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseAreaPositionDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsWarehouseAreaPositionDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseAreaPositionDO> selectByQuery(WmsWarehouseAreaPositionQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseAreaPositionDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseAreaPositionDO record);
}