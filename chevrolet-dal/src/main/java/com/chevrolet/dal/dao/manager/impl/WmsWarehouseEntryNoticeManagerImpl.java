package com.chevrolet.dal.dao.manager.impl;

import com.chevrolet.dal.dao.domain.WmsCarNoticeMapDO;
import com.chevrolet.dal.dao.domain.query.WmsCarNoticeMapQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsCarNoticeMapExtMapper;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsWarehouseEntryNoticeDO;
import com.chevrolet.dal.dao.domain.query.WmsWarehouseEntryNoticeQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsWarehouseEntryNoticeExtMapper;
import com.chevrolet.dal.dao.manager.WmsWarehouseEntryNoticeManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Manager for WmsWarehouseEntryNotice.
 */

@Component
public class WmsWarehouseEntryNoticeManagerImpl implements WmsWarehouseEntryNoticeManager {

    @Autowired
    protected WmsWarehouseEntryNoticeExtMapper wmsWarehouseEntryNoticeExtMapper;
    @Autowired
    private WmsCarNoticeMapExtMapper carNoticeMapExtMapper;

    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsWarehouseEntryNoticeQuery query) {
        return wmsWarehouseEntryNoticeExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsWarehouseEntryNoticeDO record) {
        return wmsWarehouseEntryNoticeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsWarehouseEntryNoticeDO record) {
        return wmsWarehouseEntryNoticeExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsWarehouseEntryNoticeDO> selectByQuery(WmsWarehouseEntryNoticeQuery query) {
        return wmsWarehouseEntryNoticeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
     */
    @Override
    public PageResult<WmsWarehouseEntryNoticeDO> selectByQueryWithPage(WmsWarehouseEntryNoticeQuery query) {
        PageResult<WmsWarehouseEntryNoticeDO> result = new PageResult<WmsWarehouseEntryNoticeDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public WmsWarehouseEntryNoticeDO selectByPrimaryKey(Long id) {
        return wmsWarehouseEntryNoticeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsWarehouseEntryNoticeDO record) {
        return wmsWarehouseEntryNoticeExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<WmsWarehouseEntryNoticeDO> selectNewNoticeDO(List<Long> wmsCarIds) {
        List<WmsWarehouseEntryNoticeDO> entryNoticeDOs = new ArrayList<>();
        if (!CollectionUtils.isEmpty(wmsCarIds)) {
            WmsCarNoticeMapQuery carNoticeMapQuery = new WmsCarNoticeMapQuery();
            carNoticeMapQuery.createCriteria().andStatusEqualTo(1).andTypeEqualTo(1).andCarIdIn(wmsCarIds);
            List<WmsCarNoticeMapDO> carNoticeMapDOs = carNoticeMapExtMapper.selectByQuery(carNoticeMapQuery);
            if (!CollectionUtils.isEmpty(carNoticeMapDOs)) {
                Map<Long, WmsCarNoticeMapDO> wmsCarIdAndDOMap = new HashMap<>(carNoticeMapDOs.size());
                for (WmsCarNoticeMapDO newMapDO : carNoticeMapDOs) {
                    Long wmsCarId = newMapDO.getCarId();
                    if (wmsCarIdAndDOMap.containsKey(wmsCarId)) {
                        WmsCarNoticeMapDO oldMapDO = wmsCarIdAndDOMap.get(wmsCarId);
                        if (newMapDO.getGmtCreate().getTime() > oldMapDO.getGmtCreate().getTime()) {
                            wmsCarIdAndDOMap.put(wmsCarId, newMapDO);
                        }
                    } else {
                        wmsCarIdAndDOMap.put(wmsCarId, newMapDO);
                    }
                }
                List<Long> noticeIds = wmsCarIdAndDOMap.values().stream().map(x -> x.getNoticeId()).collect(Collectors.toList());
                WmsWarehouseEntryNoticeQuery entryNoticeQuery = new WmsWarehouseEntryNoticeQuery();
                entryNoticeQuery.createCriteria().andNoticeIdIn(noticeIds);
                entryNoticeDOs = wmsWarehouseEntryNoticeExtMapper.selectByQuery(entryNoticeQuery);
            }
        }
        return entryNoticeDOs;
    }
}