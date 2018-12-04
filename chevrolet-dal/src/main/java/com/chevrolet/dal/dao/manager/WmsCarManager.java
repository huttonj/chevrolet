package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarDO;
import com.chevrolet.dal.dao.domain.query.WmsCarQuery;

import java.util.List;


/**
 * Manager for WmsCar.
 */
public interface WmsCarManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsCarDO record);

    /**
     * select by query condition.
     */
    List<WmsCarDO> selectByQuery(WmsCarQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsCarDO> selectByQueryWithPage(WmsCarQuery query);

    /**
     * select by primary key.
     */
    WmsCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarDO record);
}