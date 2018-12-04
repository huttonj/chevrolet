package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.MhcCountyDO;
import com.chevrolet.dal.dao.domain.query.MhcCountyQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for MhcCounty.
 */
public interface MhcCountyMapper {
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
    int insertSelective(MhcCountyDO record);

    /**
     * select by query condition.
     */
    List<MhcCountyDO> selectByQuery(MhcCountyQuery query);

    /**
     * select by primary key.
     */
    MhcCountyDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(MhcCountyDO record);
}