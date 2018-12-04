package com.chevrolet.core.ao;

import com.chevrolet.dal.dao.domain.AllotOrderDO;

import java.util.List;
import java.util.Map;

/**
 * @author wenruo
 * @date 2017/11/8.
 */
public interface AllotOrderAO {

    List<AllotOrderDO> getAllotOrderDOListByAllotOrderIdList(List<Long> allotOrderIdList);

    Map<Long, AllotOrderDO> getAllotOrderIdAllotOrderDOMapByAllotOrderIdList(List<Long> allotOrderIdList);
}
