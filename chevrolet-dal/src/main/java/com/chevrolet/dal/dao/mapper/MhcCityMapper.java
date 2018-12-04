package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.MhcCityDO;
import com.chevrolet.dal.dao.domain.query.MhcCityQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for MhcCity.
 */
public interface MhcCityMapper {
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
    int insertSelective(MhcCityDO record);

    /**
     * select by query condition.
     */
    List<MhcCityDO> selectByQuery(MhcCityQuery query);

    /**
     * select by primary key.
     */
    MhcCityDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(MhcCityDO record);
}