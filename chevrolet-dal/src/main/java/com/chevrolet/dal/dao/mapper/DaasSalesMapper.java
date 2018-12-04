package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.DaasSalesDO;
import com.chevrolet.dal.dao.domain.query.DaasSalesQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for DaasSales.
 */
public interface DaasSalesMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(DaasSalesQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(DaasSalesDO record);

    /**
     * insert selective.
     */
    int insertSelective(DaasSalesDO record);

    /**
     * select by query condition.
     */
    List<DaasSalesDO> selectByQuery(DaasSalesQuery query);

    /**
     * select by primary key.
     */
    DaasSalesDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(DaasSalesDO record);
}