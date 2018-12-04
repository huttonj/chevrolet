package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.CarAssetChglogDO;
import com.chevrolet.dal.dao.domain.query.CarAssetChglogQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for CarAssetChglog.
 */
public interface CarAssetChglogMapper {
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
    int insertSelective(CarAssetChglogDO record);

    /**
     * select by query condition.
     */
    List<CarAssetChglogDO> selectByQuery(CarAssetChglogQuery query);

    /**
     * select by primary key.
     */
    CarAssetChglogDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarAssetChglogDO record);
}