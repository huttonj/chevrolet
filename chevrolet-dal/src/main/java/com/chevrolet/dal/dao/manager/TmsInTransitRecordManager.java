package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsInTransitRecordDO;
import com.chevrolet.dal.dao.domain.query.TmsInTransitRecordQuery;

import java.util.List;


/**
 * Manager for TmsInTransitRecord.
 */
public interface TmsInTransitRecordManager {
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
    long insertSelective(TmsInTransitRecordDO record);

    /**
     * select by query condition.
     */
    List<TmsInTransitRecordDO> selectByQuery(TmsInTransitRecordQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TmsInTransitRecordDO> selectByQueryWithPage(TmsInTransitRecordQuery query);

    /**
     * select by primary key.
     */
    TmsInTransitRecordDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsInTransitRecordDO record);

    /**
     * 获取运输车辆最新的记录
     *
     * @param transportCarIdList 集合中的每一个元素代表一个transport_car_id对应的最新记录的信息,如果有transport_car_id没有记录,
     *                           则列表中没有该car_id对应的信息
     * @return
     */
    List<TmsInTransitRecordDO> getLatestTmsInTransitRecordDOByTransportCarIdList(List<Long> transportCarIdList);
}