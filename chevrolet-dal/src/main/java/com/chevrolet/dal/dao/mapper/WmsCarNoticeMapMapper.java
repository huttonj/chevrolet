package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsCarNoticeMapDO;
import com.chevrolet.dal.dao.domain.query.WmsCarNoticeMapQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsCarNoticeMap.
 */
public interface WmsCarNoticeMapMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarNoticeMapQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarNoticeMapDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsCarNoticeMapDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WmsCarNoticeMapDO> records);

    /**
     * select by query condition.
     */
    List<WmsCarNoticeMapDO> selectByQuery(WmsCarNoticeMapQuery query);

    /**
     * select by primary key.
     */
    WmsCarNoticeMapDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarNoticeMapDO record);
}