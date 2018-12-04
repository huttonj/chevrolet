package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.domain.DaasOnlinePriceDO;
import com.chevrolet.dal.dao.mapper.DaasOnlinePriceMapper;

import java.util.List;

/**
 * MyBatis Ext Mapper for DaasOnlinePrice.
 */
public interface DaasOnlinePriceExtMapper extends DaasOnlinePriceMapper {

    int batchInsert(List<DaasOnlinePriceDO> daasOnlinePriceDOS);

    int truncateData();
}