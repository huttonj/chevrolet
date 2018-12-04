package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsWarehouseCarMoveRecordDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseCarMoveRecordQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsWarehouseCarMoveRecord.
 */
public interface WmsWarehouseCarMoveRecordMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseCarMoveRecordQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseCarMoveRecordDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsWarehouseCarMoveRecordDO record);

    /**
     * select by query condition.
     */
    List<WmsWarehouseCarMoveRecordDO> selectByQuery(WmsWarehouseCarMoveRecordQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseCarMoveRecordDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseCarMoveRecordDO record);
}