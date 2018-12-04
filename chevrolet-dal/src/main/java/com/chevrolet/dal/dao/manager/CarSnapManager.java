package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarSnapDO;
import com.chevrolet.dal.dao.domain.query.CarSnapQuery;

import java.util.List;


/**
 * Manager for CarSnap.
 */
public interface CarSnapManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CarSnapQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarSnapDO record);

    /**
     * insert selective.
     */
    long insertSelective(CarSnapDO record);

    /**
     * select by query condition.
     */
    List<CarSnapDO> selectByQuery(CarSnapQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarSnapDO> selectByQueryWithPage(CarSnapQuery query);

    /**
     * select by primary key.
     */
    CarSnapDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarSnapDO record);
}