package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TmsCarMassLossDO;
import com.chevrolet.dal.dao.domain.query.TmsCarMassLossQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TmsCarMassLoss.
 */
public interface TmsCarMassLossMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsCarMassLossQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsCarMassLossDO record);

    /**
     * insert selective.
     */
    int insertSelective(TmsCarMassLossDO record);

    /**
     * select by query condition.
     */
    List<TmsCarMassLossDO> selectByQuery(TmsCarMassLossQuery query);

    /**
     * select by primary key.
     */
    TmsCarMassLossDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsCarMassLossDO record);
}