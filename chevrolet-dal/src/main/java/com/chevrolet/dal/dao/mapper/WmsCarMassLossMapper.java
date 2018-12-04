package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.WmsCarMassLossDO;
import com.chevrolet.dal.dao.domain.query.WmsCarMassLossQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for WmsCarMassLoss.
 */
public interface WmsCarMassLossMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(WmsCarMassLossQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(WmsCarMassLossDO record);

    /**
     * insert selective.
     */
    int insertSelective(WmsCarMassLossDO record);

    /**
     * select by query condition.
     */
    List<WmsCarMassLossDO> selectByQuery(WmsCarMassLossQuery query);

    /**
     * select by primary key.
     */
    WmsCarMassLossDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(WmsCarMassLossDO record);
}