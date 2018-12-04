package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.VinWhitelistDO;
import com.chevrolet.dal.dao.domain.query.VinWhitelistQuery;

import java.util.List;


/**
 * Manager for VinWhitelist.
 */
public interface VinWhitelistManager {
    /**
     * query count by query condition.
     */
    int countByQuery(VinWhitelistQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(VinWhitelistDO record);

    /**
     * insert selective.
     */
    long insertSelective(VinWhitelistDO record);

    /**
     * select by query condition.
     */
    List<VinWhitelistDO> selectByQuery(VinWhitelistQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<VinWhitelistDO> selectByQueryWithPage(VinWhitelistQuery query);

    /**
     * select by primary key.
     */
    VinWhitelistDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(VinWhitelistDO record);
}