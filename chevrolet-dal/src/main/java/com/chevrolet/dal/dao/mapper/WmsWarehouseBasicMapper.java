package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsWarehouseBasicDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseBasicQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsWarehouseBasic.
 */
public interface WmsWarehouseBasicMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsWarehouseBasicQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsWarehouseBasicDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsWarehouseBasicDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<WmsWarehouseBasicDO> records);

    /**
     * select by query condition.
     */
    List<WmsWarehouseBasicDO> selectByQuery(WmsWarehouseBasicQuery query);

    /**
     * select by primary key.
     */
    WmsWarehouseBasicDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsWarehouseBasicDO record);
}