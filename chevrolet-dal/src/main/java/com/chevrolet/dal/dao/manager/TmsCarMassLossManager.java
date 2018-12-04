package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsCarMassLossDO;
import com.chevrolet.dal.dao.domain.query.TmsCarMassLossQuery;

import java.util.List;


/**
 * Manager for TmsCarMassLoss.
 */
public interface TmsCarMassLossManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsCarMassLossQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsCarMassLossDO record);

    /**
     * insert selective.
     */
    long insertSelective(TmsCarMassLossDO record);

    /**
     * select by query condition.
     */
    List<TmsCarMassLossDO> selectByQuery(TmsCarMassLossQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TmsCarMassLossDO> selectByQueryWithPage(TmsCarMassLossQuery query);

    /**
     * select by primary key.
     */
    TmsCarMassLossDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsCarMassLossDO record);

    List<TmsCarMassLossDO> selectCarMassLossByCarId(List<Long> transportCarIds);
}