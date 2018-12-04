package com.chevrolet.core.ao;

import com.chevrolet.api.dto.CarLoanOrderDetailDTO;
import com.chevrolet.dal.dao.domain.CarLoanDO;

import java.util.List;

/**
 * Created by maihe on 2017/5/22.
 */
public interface CarLoanOrderAO {

    @Deprecated
    Long insertCarInfo(CarLoanOrderDetailDTO carLoanOrderDetailDTO);

    Integer batchInsert(CarLoanOrderDetailDTO carLoanOrderDetailDTO, List<Long> carIds);


    List<CarLoanDO> queryLoanOrderNoByCarUnique(String carUnique);

    Integer countCarByLoanOrderNoWithoutStatus(String carLoanOrderNO, Integer status);

    Integer countCarByLoanOrderNoWithStatus(String carLoanOrderNO, Integer status);

    void batchUpdateCarLoanOrderInfo(List<CarLoanOrderDetailDTO> carLoanOrderDetailDTOS);

    int updateByCarLoanOrderNo(String carLoanOrderNO, Integer carStatus);

    List<String> queryAllOnLoanOrderNos();
}
