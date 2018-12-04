package com.chevrolet.core.ao.impl;

import com.chevrolet.core.ao.AllotOrderAO;
import com.chevrolet.dal.dao.domain.AllotOrderDO;
import com.chevrolet.dal.dao.domain.query.AllotOrderQuery;
import com.chevrolet.dal.dao.manager.AllotOrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author wenruo
 * @date 2017/11/8.
 */
@Component
public class AllotOrderAOImpl implements AllotOrderAO {

    @Autowired
    private AllotOrderManager allotOrderManager;

    @Override
    public List<AllotOrderDO> getAllotOrderDOListByAllotOrderIdList(List<Long> allotOrderIdList) {
        if (CollectionUtils.isEmpty(allotOrderIdList)) {
            return new LinkedList<>();
        }

        AllotOrderQuery query = new AllotOrderQuery();
        query.createCriteria().andAllotOrderIdIn(allotOrderIdList);

        return allotOrderManager.selectByQuery(query);
    }

    @Override
    public Map<Long, AllotOrderDO> getAllotOrderIdAllotOrderDOMapByAllotOrderIdList(List<Long> allotOrderIdList) {
        Map<Long, AllotOrderDO> map = new HashMap<>();

        for (AllotOrderDO allotOrderDO : getAllotOrderDOListByAllotOrderIdList(allotOrderIdList)) {
            map.put(allotOrderDO.getAllotOrderId(), allotOrderDO);
        }

        return map;
    }
}
