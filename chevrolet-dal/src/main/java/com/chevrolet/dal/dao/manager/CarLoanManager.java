package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.domain.query.CarLoanQuery;

import java.util.List;
import java.util.Map;


/**
 * Manager for CarLoan.
 */
public interface CarLoanManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CarLoanQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarLoanDO record);

    /**
     * insert selective.
     */
    long insertSelective(CarLoanDO record);

    /**
     * select by query condition.
     */
    List<CarLoanDO> selectByQuery(CarLoanQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarLoanDO> selectByQueryWithPage(CarLoanQuery query);

    /**
     * select by primary key.
     */
    CarLoanDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarLoanDO record);

    /**
     * update by carid selective.
     */
    int updateByCarIdAndOrderNoSelective(CarLoanDO record);

    /**
     * update by carLoanOrderNo selective.
     */
    int updateByCarLoanOrderNoSelective(CarLoanDO record);

    List<Long> selectUnbindCarIdsByOrderNos(List<Long> carIds, List<String> orderNos);

    List<CarLoanDO> selectCarNotInCarIds(List<Long> carIds, List<String> orderNos);

    Map<Long,CarLoanDO> selectCarLoanMap(List<Long> carIds);

    Integer batchInsert(List<CarLoanDO> carLoanDOs);

    Integer batchUpdateByCarIds(CarLoanDO carLoanDO, List<Long> carIds);

    List<String> queryAllOnLoanOrderNos();
}