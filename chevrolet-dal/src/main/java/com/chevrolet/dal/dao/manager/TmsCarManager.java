package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsCarDO;
import com.chevrolet.dal.dao.domain.query.TmsCarQuery;

import java.util.List;


/**
 * Manager for TmsCar.
 */
public interface TmsCarManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsCarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsCarDO record);

    /**
     * insert selective.
     */
    long insertSelective(TmsCarDO record);

    /**
     * select by query condition.
     */
    List<TmsCarDO> selectByQuery(TmsCarQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TmsCarDO> selectByQueryWithPage(TmsCarQuery query);

    /**
     * select by primary key.
     */
    TmsCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsCarDO record);
}