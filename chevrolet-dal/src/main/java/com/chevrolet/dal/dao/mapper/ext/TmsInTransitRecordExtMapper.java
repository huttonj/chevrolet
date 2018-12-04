package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.TmsInTransitRecordDO;
import com.chevrolet.dal.dao.mapper.TmsInTransitRecordMapper;

import java.util.List;

/**
 * MyBatis Ext Mapper for TmsInTransitRecord.
 */
public interface TmsInTransitRecordExtMapper extends TmsInTransitRecordMapper {

    /**
     * 获取运输车辆最新的记录
     *
     * @param transportCarIdList 集合中的每一个元素代表一个transport_car_id对应的最新记录的信息,如果有transport_car_id没有记录,
     *                           则列表中没有该car_id对应的信息
     * @return
     */
    List<TmsInTransitRecordDO> getLatestTmsInTransitRecordDOByTransportCarIdList(List<Long> transportCarIdList);
}