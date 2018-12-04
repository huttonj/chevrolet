package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TmsCarrierRouteSnapshotDO;
import com.chevrolet.dal.dao.domain.query.TmsCarrierRouteSnapshotQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TmsCarrierRouteSnapshot.
 */
public interface TmsCarrierRouteSnapshotMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsCarrierRouteSnapshotQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsCarrierRouteSnapshotDO record);

    /**
     * insert selective.
     */
    int insertSelective(TmsCarrierRouteSnapshotDO record);

    /**
     * select by query condition.
     */
    List<TmsCarrierRouteSnapshotDO> selectByQuery(TmsCarrierRouteSnapshotQuery query);

    /**
     * select by primary key.
     */
    TmsCarrierRouteSnapshotDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsCarrierRouteSnapshotDO record);
}