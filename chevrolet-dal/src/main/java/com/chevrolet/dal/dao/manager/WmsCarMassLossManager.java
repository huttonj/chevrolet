package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarMassLossDO;
import com.chevrolet.dal.dao.domain.query.WmsCarMassLossQuery;

import java.util.List;


/**
 * Manager for WmsCarMassLoss.
 */
public interface WmsCarMassLossManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarMassLossQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarMassLossDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsCarMassLossDO record);

    /**
     * select by query condition.
     */
    List<WmsCarMassLossDO> selectByQuery(WmsCarMassLossQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsCarMassLossDO> selectByQueryWithPage(WmsCarMassLossQuery query);

    /**
     * select by primary key.
     */
    WmsCarMassLossDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarMassLossDO record);
}