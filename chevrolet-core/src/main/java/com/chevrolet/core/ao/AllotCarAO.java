package com.chevrolet.core.ao;

import com.chevrolet.dal.dao.domain.AllotCarDO;

import java.util.List;
import java.util.Map;

/**
 * @author wenruo
 * @date 2017/11/8.
 */
public interface AllotCarAO {

    /**
     * 获取wmsCarId集合对应的AllotCarDO集合
     *
     * @param wmsCarIdList
     * @return
     */
    List<AllotCarDO> getAllotCarDOListByWmsCarIdList(List<Long> wmsCarIdList);

    /**
     * 获取以wmsCarId为key,allotCarDO集合为value的Map
     *
     * @param wmsCarIdList
     * @return
     */
    Map<Long, List<AllotCarDO>> getWmsCarIdAllotCarDOListMapByWmsCarIdList(List<Long> wmsCarIdList);


    List<AllotCarDO> getAllotCarByWmsCarId(Long wmsCarId);
}
