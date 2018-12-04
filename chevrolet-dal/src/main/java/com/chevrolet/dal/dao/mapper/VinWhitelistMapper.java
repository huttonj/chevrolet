package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.VinWhitelistDO;
import com.chevrolet.dal.dao.domain.query.VinWhitelistQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for VinWhitelist.
 */
public interface VinWhitelistMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(VinWhitelistQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(VinWhitelistDO record);

    /**
     * insert selective.
     */
    int insertSelective(VinWhitelistDO record);

    /**
     * select by query condition.
     */
    List<VinWhitelistDO> selectByQuery(VinWhitelistQuery query);

    /**
     * select by primary key.
     */
    VinWhitelistDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(VinWhitelistDO record);
}