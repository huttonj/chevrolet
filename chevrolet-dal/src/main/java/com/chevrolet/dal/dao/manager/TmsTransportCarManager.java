package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsTransportCarDO;
import com.chevrolet.dal.dao.domain.query.TmsTransportCarQuery;

import java.util.List;
import java.util.Map;


/**
 * Manager for TmsTransportCar.
 */
public interface TmsTransportCarManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsTransportCarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsTransportCarDO record);

    /**
     * insert selective.
     */
    long insertSelective(TmsTransportCarDO record);

    /**
     * select by query condition.
     */
    List<TmsTransportCarDO> selectByQuery(TmsTransportCarQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TmsTransportCarDO> selectByQueryWithPage(TmsTransportCarQuery query);

    /**
     * select by primary key.
     */
    TmsTransportCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsTransportCarDO record);

    Map<Long,List<TmsTransportCarDO>> selectTmsCarMapByTransportIds(List<Long> transportIds);

    List<TmsTransportCarDO> selectByTransportIds(List<Long> transportIds);

    List<Long> selectCarIdByTransportId(List<Long> transportOrderIds);

    List<TmsTransportCarDO> selectByTransportCarIds(List<Long> transportCarIds);
}