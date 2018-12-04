package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.DaasSalesDO;
import com.chevrolet.dal.dao.domain.query.DaasSalesQuery;

import java.util.List;


/**
 * Manager for DaasSales.
 */
public interface DaasSalesManager {
    /**
     * query count by query condition.
     */
    int countByQuery(DaasSalesQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(DaasSalesDO record);

    /**
     * insert selective.
     */
    long insertSelective(DaasSalesDO record);

    /**
     * select by query condition.
     */
    List<DaasSalesDO> selectByQuery(DaasSalesQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<DaasSalesDO> selectByQueryWithPage(DaasSalesQuery query);

    /**
     * select by primary key.
     */
    DaasSalesDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(DaasSalesDO record);

    int batchInsert(List<DaasSalesDO> daasSalesDOS);

    int truncateData();
}