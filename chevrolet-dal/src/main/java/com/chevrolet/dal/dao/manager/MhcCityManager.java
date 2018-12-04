package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.MhcCityDO;
import com.chevrolet.dal.dao.domain.query.MhcCityQuery;

import java.util.List;


/**
 * Manager for MhcCity.
 */
public interface MhcCityManager {
    /**
     * query count by query condition.
     */
    int countByQuery(MhcCityQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(MhcCityDO record);

    /**
     * insert selective.
     */
    long insertSelective(MhcCityDO record);

    /**
     * select by query condition.
     */
    List<MhcCityDO> selectByQuery(MhcCityQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<MhcCityDO> selectByQueryWithPage(MhcCityQuery query);

    /**
     * select by primary key.
     */
    MhcCityDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(MhcCityDO record);
}