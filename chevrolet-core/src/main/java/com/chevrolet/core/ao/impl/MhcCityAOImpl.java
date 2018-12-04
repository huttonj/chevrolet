package com.chevrolet.core.ao.impl;

import com.chevrolet.core.ao.MhcCityAO;
import com.chevrolet.dal.dao.domain.MhcCityDO;
import com.chevrolet.dal.dao.domain.MhcCountyDO;
import com.chevrolet.dal.dao.domain.query.MhcCityQuery;
import com.chevrolet.dal.dao.domain.query.MhcCountyQuery;
import com.chevrolet.dal.dao.manager.MhcCityManager;
import com.chevrolet.dal.dao.manager.MhcCountyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wenruo
 * @date 2017/5/25.
 */
@Component
public class MhcCityAOImpl implements MhcCityAO {

//    @Autowired
//    private MhcCityManager mhcCityManager;
    @Autowired
    private MhcCountyManager mhcCountyManager;

    @Override
    public Map<Long, MhcCountyDO> getMhcCityDOMapByMhcCityIdList(List<Long> mhcCityIdList) {
        Map<Long, MhcCountyDO> resultMap = new HashMap<>();

        if (!CollectionUtils.isEmpty(mhcCityIdList)) {
            MhcCountyQuery query = new MhcCountyQuery();
            query.createCriteria().andCountyIdIn(mhcCityIdList);

            List<MhcCountyDO> mhcCityDOList = mhcCountyManager.selectByQuery(query);
            for (MhcCountyDO mhcCityDO : mhcCityDOList) {
                resultMap.put(mhcCityDO.getCountyId(), mhcCityDO);
            }
        }
        return resultMap;
    }
}
