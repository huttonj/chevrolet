package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarAssetChglogDO;
import com.chevrolet.dal.dao.domain.query.CarAssetChglogQuery;

import java.util.List;


/**
 * Manager for CarAssetChglog.
 */
public interface CarAssetChglogManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CarAssetChglogQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarAssetChglogDO record);

    /**
     * insert selective.
     */
    long insertSelective(CarAssetChglogDO record);

    /**
     * select by query condition.
     */
    List<CarAssetChglogDO> selectByQuery(CarAssetChglogQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarAssetChglogDO> selectByQueryWithPage(CarAssetChglogQuery query);

    /**
     * select by primary key.
     */
    CarAssetChglogDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarAssetChglogDO record);

    int batchInsert(List<CarAssetChglogDO> carAssetChglogDOS);
}