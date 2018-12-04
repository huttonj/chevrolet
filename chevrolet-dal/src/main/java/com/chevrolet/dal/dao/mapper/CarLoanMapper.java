package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.domain.query.CarLoanQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for CarLoan.
 */
public interface CarLoanMapper {
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
    int insertSelective(CarLoanDO record);

    /**
     * select by query condition.
     */
    List<CarLoanDO> selectByQuery(CarLoanQuery query);

    /**
     * select by primary key.
     */
    CarLoanDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarLoanDO record);
}