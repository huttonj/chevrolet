package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsWarehouseStaffRelationDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseStaffRelationQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsWarehouseStaffRelation.
 */
public interface WmsWarehouseStaffRelationMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseStaffRelationQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseStaffRelationDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsWarehouseStaffRelationDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseStaffRelationDO> selectByQuery(WmsWarehouseStaffRelationQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseStaffRelationDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseStaffRelationDO record);
}