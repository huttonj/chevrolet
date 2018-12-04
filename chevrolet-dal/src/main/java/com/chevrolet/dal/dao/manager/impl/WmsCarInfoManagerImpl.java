package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarInfoDO;
import com.chevrolet.dal.dao.domain.query.WmsCarInfoQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsCarInfoExtMapper;
import com.chevrolet.dal.dao.manager.WmsCarInfoManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsCarInfo.
 */

@Component
public class WmsCarInfoManagerImpl implements WmsCarInfoManager{
    
    @Autowired
    protected WmsCarInfoExtMapper wmsCarInfoExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsCarInfoQuery query){
        return wmsCarInfoExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsCarInfoDO record){
        return wmsCarInfoExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsCarInfoDO record){
        return wmsCarInfoExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsCarInfoDO> selectByQuery(WmsCarInfoQuery query){
        return wmsCarInfoExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsCarInfoDO> selectByQueryWithPage(WmsCarInfoQuery query) {
        PageResult<WmsCarInfoDO> result = new PageResult<WmsCarInfoDO>();
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
    public WmsCarInfoDO selectByPrimaryKey(Long id){
        return wmsCarInfoExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsCarInfoDO record){
        return wmsCarInfoExtMapper.updateByPrimaryKeySelective(record);
    }
}