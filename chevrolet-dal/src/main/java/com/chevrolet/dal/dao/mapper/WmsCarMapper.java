package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsCarDO;
import com.chevrolet.dal.dao.domain.query.WmsCarQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsCar.
 */
public interface WmsCarMapper {
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
    int insertSelective(WmsCarDO record);

    /**
     * select by query condition.
     */
    List<WmsCarDO> selectByQuery(WmsCarQuery query);

    /**
     * select by primary key.
     */
    WmsCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarDO record);
}