package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.DaasOnlinePriceDO;
import com.chevrolet.dal.dao.domain.DaasSalesDO;
import com.chevrolet.dal.dao.mapper.DaasSalesMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * MyBatis Ext Mapper for DaasSales.
 */
public interface DaasSalesExtMapper extends DaasSalesMapper {

    int batchInsert(List<DaasSalesDO> daasSalesDOS);

    int truncateData();
}