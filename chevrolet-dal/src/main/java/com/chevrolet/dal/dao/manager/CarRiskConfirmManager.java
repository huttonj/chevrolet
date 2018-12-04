package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarRiskConfirmDO;
import com.chevrolet.dal.dao.domain.query.CarRiskConfirmQuery;

import java.util.List;


/**
 * Manager for CarRiskConfirm.
 */
public interface CarRiskConfirmManager {
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
    long insertSelective(CarRiskConfirmDO record);

    /**
     * select by query condition.
     */
    List<CarRiskConfirmDO> selectByQuery(CarRiskConfirmQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarRiskConfirmDO> selectByQueryWithPage(CarRiskConfirmQuery query);

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