package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.FactoryDO;
import com.chevrolet.dal.dao.domain.query.FactoryQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for Factory.
 */
public interface FactoryMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(FactoryQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(FactoryDO record);

    /**
     * insert selective.
     */
    int insertSelective(FactoryDO record);

    /**
     * select by query condition.
     */
    List<FactoryDO> selectByQuery(FactoryQuery query);

    /**
     * select by primary key.
     */
    FactoryDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(FactoryDO record);
}