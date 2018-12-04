package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.mapper.CarLoanMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * MyBatis Ext Mapper for CarLoan.
 */
public interface CarLoanExtMapper extends CarLoanMapper {

    /**
     * update by CarLoanOrderNo selective.
     */
    int updateByCarLoanOrderNoSelective(CarLoanDO record);

    /**
     * update by carid selective.
     */
    int updateByCarIdAndOrderNoSelective(CarLoanDO record);

    int batchInsert(List<CarLoanDO> carLoanDOS);

    Integer batchUpdateByCarIds(@Param(value = "carLoanDO") CarLoanDO carLoanDO, @Param(value = "carIds") List<Long> carIds);

    List<String> getDistinctLoanOrderNo();

    List<String> queryAllOnLoanOrderNos();
}