package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.FactoryDO;
import com.chevrolet.dal.dao.domain.query.FactoryQuery;

import java.util.List;


/**
 * Manager for Factory.
 */
public interface FactoryManager {
    /**
     * query count by query condition.
     */
    int countByQuery(FactoryQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(FactoryDO record);

    /**
     * insert selective.
     */
    long insertSelective(FactoryDO record);

    /**
     * select by query condition.
     */
    List<FactoryDO> selectByQuery(FactoryQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<FactoryDO> selectByQueryWithPage(FactoryQuery query);

    /**
     * select by primary key.
     */
    FactoryDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(FactoryDO record);
}