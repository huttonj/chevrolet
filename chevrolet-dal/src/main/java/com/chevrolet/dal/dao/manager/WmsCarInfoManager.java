package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarInfoDO;
import com.chevrolet.dal.dao.domain.query.WmsCarInfoQuery;

import java.util.List;


/**
 * Manager for WmsCarInfo.
 */
public interface WmsCarInfoManager {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarInfoQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarInfoDO record);

    /**
     * insert selective.
     */
    long insertSelective(WmsCarInfoDO record);

    /**
     * select by query condition.
     */
    List<WmsCarInfoDO> selectByQuery(WmsCarInfoQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<WmsCarInfoDO> selectByQueryWithPage(WmsCarInfoQuery query);

    /**
     * select by primary key.
     */
    WmsCarInfoDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarInfoDO record);
}