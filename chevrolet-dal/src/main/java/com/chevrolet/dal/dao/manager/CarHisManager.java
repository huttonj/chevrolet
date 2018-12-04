package com.chevrolet.dal.dao.manager;

import com.chevrolet.dal.dao.domain.query.CarHisQuery;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarHisDO;

import java.util.List;


/**
 * Manager for CarHis.
 */
public interface CarHisManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CarHisQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarHisDO record);

    /**
     * insert selective.
     */
    long insertSelective(CarHisDO record);

    /**
     * select by query condition.
     */
    List<CarHisDO> selectByQuery(CarHisQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarHisDO> selectByQueryWithPage(CarHisQuery query);

    /**
     * select by primary key.
     */
    CarHisDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarHisDO record);
}