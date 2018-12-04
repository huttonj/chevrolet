package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.BrandDO;
import com.chevrolet.dal.dao.domain.query.BrandQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for Brand.
 */
public interface BrandMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(BrandQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(BrandDO record);

    /**
     * insert selective.
     */
    int insertSelective(BrandDO record);

    /**
     * select by query condition.
     */
    List<BrandDO> selectByQuery(BrandQuery query);

    /**
     * select by primary key.
     */
    BrandDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(BrandDO record);
}