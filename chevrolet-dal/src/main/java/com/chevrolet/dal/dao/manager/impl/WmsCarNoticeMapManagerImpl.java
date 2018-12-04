package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarNoticeMapDO;
import com.chevrolet.dal.dao.domain.query.WmsCarNoticeMapQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsCarNoticeMapExtMapper;
import com.chevrolet.dal.dao.manager.WmsCarNoticeMapManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * Manager for WmsCarNoticeMap.
 */

@Component
public class WmsCarNoticeMapManagerImpl implements WmsCarNoticeMapManager {

    @Autowired
    protected WmsCarNoticeMapExtMapper wmsCarNoticeMapExtMapper;

    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsCarNoticeMapQuery query) {
        return wmsCarNoticeMapExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsCarNoticeMapDO record) {
        return wmsCarNoticeMapExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsCarNoticeMapDO record) {
        return wmsCarNoticeMapExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<WmsCarNoticeMapDO> records) {
        return wmsCarNoticeMapExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsCarNoticeMapDO> selectByQuery(WmsCarNoticeMapQuery query) {
        return wmsCarNoticeMapExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
     */
    @Override
    public PageResult<WmsCarNoticeMapDO> selectByQueryWithPage(WmsCarNoticeMapQuery query) {
        PageResult<WmsCarNoticeMapDO> result = new PageResult<WmsCarNoticeMapDO>();
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
    public WmsCarNoticeMapDO selectByPrimaryKey(Long id) {
        return wmsCarNoticeMapExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsCarNoticeMapDO record) {
        return wmsCarNoticeMapExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<WmsCarNoticeMapDO> selectByNoticeIds(List<Long> limitNoticeIds) {
        if (CollectionUtils.isEmpty(limitNoticeIds)) {
            return new ArrayList<>();
        }
        WmsCarNoticeMapQuery carNoticeMapQuery = new WmsCarNoticeMapQuery();
        carNoticeMapQuery.createCriteria().andNoticeIdIn(limitNoticeIds)
                .andStatusEqualTo(1).andTypeEqualTo(1);
        return wmsCarNoticeMapExtMapper.selectByQuery(carNoticeMapQuery);
    }
}