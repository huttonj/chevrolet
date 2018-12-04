package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TmsInTransitRecordDO;
import com.chevrolet.dal.dao.domain.query.TmsInTransitRecordQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TmsInTransitRecord.
 */
public interface TmsInTransitRecordMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsInTransitRecordQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsInTransitRecordDO record);

    /**
     * insert selective.
     */
    int insertSelective(TmsInTransitRecordDO record);

    /**
     * select by query condition.
     */
    List<TmsInTransitRecordDO> selectByQuery(TmsInTransitRecordQuery query);

    /**
     * select by primary key.
     */
    TmsInTransitRecordDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsInTransitRecordDO record);
}