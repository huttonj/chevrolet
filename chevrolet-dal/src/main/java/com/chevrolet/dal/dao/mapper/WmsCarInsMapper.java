package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsCarInsDO;
import com.chevrolet.dal.dao.domain.query.WmsCarInsQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsCarIns.
 */
public interface WmsCarInsMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarInsQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarInsDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsCarInsDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WmsCarInsDO> records);

    /**
     * select by query condition.
     */
    List<WmsCarInsDO> selectByQuery(WmsCarInsQuery query);

    /**
     * select by primary key.
     */
    WmsCarInsDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarInsDO record);
}