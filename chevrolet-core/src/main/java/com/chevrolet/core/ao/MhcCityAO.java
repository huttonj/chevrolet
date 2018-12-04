package com.chevrolet.core.ao;

import com.chevrolet.dal.dao.domain.MhcCityDO;
import com.chevrolet.dal.dao.domain.MhcCountyDO;

import java.util.List;
import java.util.Map;

/**
 * @author wenruo
 * @date 2017/5/25.
 */
public interface MhcCityAO {

    /**
     * 获取MhcCityDOMap,以cityId为key
     *
     * @param mhcCityIdList
     * @return
     */
    Map<Long,MhcCountyDO> getMhcCityDOMapByMhcCityIdList(List<Long> mhcCityIdList);
}
