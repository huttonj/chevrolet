package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsWarehouseEntryNoticeDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseEntryNoticeQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsWarehouseEntryNotice.
 */
public interface WmsWarehouseEntryNoticeMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseEntryNoticeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseEntryNoticeDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsWarehouseEntryNoticeDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WmsWarehouseEntryNoticeDO> records);

    /**
     * select by query condition.
     */
    List<WmsWarehouseEntryNoticeDO> selectByQuery(WmsWarehouseEntryNoticeQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseEntryNoticeDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseEntryNoticeDO record);
}