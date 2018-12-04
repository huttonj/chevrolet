package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarInsDO;
import com.chevrolet.dal.dao.domain.query.WmsCarInsQuery;

import java.util.List;


/**
 * Manager for WmsCarIns.
 */
public interface WmsCarInsManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarInsQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarInsDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsCarInsDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WmsCarInsDO> records);

    /**
     * select by query condition.
     */
    List<WmsCarInsDO> selectByQuery(WmsCarInsQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsCarInsDO> selectByQueryWithPage(WmsCarInsQuery query);

    /**
     * select by primary key.
     */
    WmsCarInsDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarInsDO record);
}