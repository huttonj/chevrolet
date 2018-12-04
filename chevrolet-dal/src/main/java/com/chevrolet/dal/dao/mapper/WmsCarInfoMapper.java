package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsCarInfoDO;
import com.chevrolet.dal.dao.domain.query.WmsCarInfoQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsCarInfo.
 */
public interface WmsCarInfoMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarInfoQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarInfoDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsCarInfoDO record);

    /**
     * select by query condition.
     */
    List<WmsCarInfoDO> selectByQuery(WmsCarInfoQuery query);

    /**
     * select by primary key.
     */
    WmsCarInfoDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarInfoDO record);
}