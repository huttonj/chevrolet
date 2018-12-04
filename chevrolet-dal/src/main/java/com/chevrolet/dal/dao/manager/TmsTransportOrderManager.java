package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsTransportOrderDO;
import com.chevrolet.dal.dao.domain.query.TmsTransportOrderQuery;

import java.util.List;


/**
 * Manager for TmsTransportOrder.
 */
public interface TmsTransportOrderManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsTransportOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsTransportOrderDO record);

    /**
     * insert selective.
     */
    long insertSelective(TmsTransportOrderDO record);

    /**
     * select by query condition.
     */
    List<TmsTransportOrderDO> selectByQuery(TmsTransportOrderQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TmsTransportOrderDO> selectByQueryWithPage(TmsTransportOrderQuery query);

    /**
     * select by primary key.
     */
    TmsTransportOrderDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsTransportOrderDO record);

    List<Long> selectTransportOrderIdsByOrderNo(List<String> orderNos);

}