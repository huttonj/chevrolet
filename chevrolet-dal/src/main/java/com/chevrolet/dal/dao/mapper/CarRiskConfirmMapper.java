package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.CarRiskConfirmDO;
import com.chevrolet.dal.dao.domain.query.CarRiskConfirmQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for CarRiskConfirm.
 */
public interface CarRiskConfirmMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(CarRiskConfirmQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarRiskConfirmDO record);

    /**
     * insert selective.
     */
    int insertSelective(CarRiskConfirmDO record);

    /**
     * select by query condition.
     */
    List<CarRiskConfirmDO> selectByQuery(CarRiskConfirmQuery query);

    /**
     * select by primary key.
     */
    CarRiskConfirmDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarRiskConfirmDO record);

    int updateByCarIdSelective(CarRiskConfirmDO record);
}