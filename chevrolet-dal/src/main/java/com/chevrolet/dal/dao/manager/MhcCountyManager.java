package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.MhcCountyDO;
import com.chevrolet.dal.dao.domain.query.MhcCountyQuery;

import java.util.List;


/**
 * Manager for MhcCounty.
 */
public interface MhcCountyManager {
    /**
     * query count by query condition.
     */
    int countByQuery(MhcCountyQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(MhcCountyDO record);

    /**
     * insert selective.
     */
    long insertSelective(MhcCountyDO record);

    /**
     * select by query condition.
     */
    List<MhcCountyDO> selectByQuery(MhcCountyQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<MhcCountyDO> selectByQueryWithPage(MhcCountyQuery query);

    /**
     * select by primary key.
     */
    MhcCountyDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(MhcCountyDO record);
}