package com.chevrolet.core.ao.impl;

import com.buick.api.enums.StatusEnum;
import com.chevrolet.core.ao.AllotCarAO;
import com.chevrolet.dal.dao.domain.AllotCarDO;
import com.chevrolet.dal.dao.domain.query.AllotCarQuery;
import com.chevrolet.dal.dao.manager.AllotCarManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author wenruo
 * @date 2017/11/8.
 */
@Component
public class AllotCarAOImpl implements AllotCarAO {

    @Autowired
    private AllotCarManager allotCarManager;

    @Override
    public List<AllotCarDO> getAllotCarDOListByWmsCarIdList(List<Long> wmsCarIdList) {
        if (CollectionUtils.isEmpty(wmsCarIdList)) {
            return new LinkedList<>();
        }

        AllotCarQuery query = new AllotCarQuery();
        query.createCriteria().andWmsCarIdIn(wmsCarIdList);

        return allotCarManager.selectByQuery(query);
    }

    @Override
    public Map<Long, List<AllotCarDO>> getWmsCarIdAllotCarDOListMapByWmsCarIdList(List<Long> wmsCarIdList) {
        Map<Long, List<AllotCarDO>> map = new HashMap<>();

        for (AllotCarDO allotCarDO : getAllotCarDOListByWmsCarIdList(wmsCarIdList)) {
            List<AllotCarDO> allotCarDOList = map.get(allotCarDO.getWmsCarId());

            if (allotCarDOList == null) {
                allotCarDOList = new LinkedList<>();
                map.put(allotCarDO.getWmsCarId(), allotCarDOList);
            }

            allotCarDOList.add(allotCarDO);
        }
        return map;
    }

    /**
     * 查询该车辆是否在调拨中 调拨车辆状态（1待执行 10 待出库 20 已出库（在途）30 已到达已入库 40 已到达已中途入库 50 已关闭)
     *
     * @param wmsCarId
     * @return
     */
    @Override
    public List<AllotCarDO> getAllotCarByWmsCarId(Long wmsCarId) {
        if (Objects.isNull(wmsCarId)) {
            return new ArrayList<>();
        } else {
            AllotCarQuery allotCarQuery = new AllotCarQuery();
            allotCarQuery.createCriteria().andStatusEqualTo(StatusEnum.NORMAL.getCode())
                    .andAllotCarStatusIn(Arrays.asList(1, 10, 20)).andWmsCarIdEqualTo(wmsCarId);
            return allotCarManager.selectByQuery(allotCarQuery);
        }
    }
}
