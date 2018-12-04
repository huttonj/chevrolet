package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.AllotCarDO;
import com.chevrolet.dal.dao.domain.query.AllotCarQuery;

import java.util.List;


/**
 * Manager for AllotCar.
 */
public interface AllotCarManager {
    /**
     * query count by query condition.
     */
    int countByQuery(AllotCarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(AllotCarDO record);

    /**
     * insert selective.
     */
    long insertSelective(AllotCarDO record);

    /**
     * select by query condition.
     */
    List<AllotCarDO> selectByQuery(AllotCarQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<AllotCarDO> selectByQueryWithPage(AllotCarQuery query);

    /**
     * select by primary key.
     */
    AllotCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(AllotCarDO record);
}