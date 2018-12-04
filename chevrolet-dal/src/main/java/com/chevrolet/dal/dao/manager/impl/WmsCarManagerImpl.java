package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarDO;
import com.chevrolet.dal.dao.domain.query.WmsCarQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsCarExtMapper;
import com.chevrolet.dal.dao.manager.WmsCarManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsCar.
 */

@Component
public class WmsCarManagerImpl implements WmsCarManager{
    
    @Autowired
    protected WmsCarExtMapper wmsCarExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsCarQuery query){
        return wmsCarExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsCarDO record){
        return wmsCarExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsCarDO record){
        return wmsCarExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsCarDO> selectByQuery(WmsCarQuery query){
        return wmsCarExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsCarDO> selectByQueryWithPage(WmsCarQuery query) {
        PageResult<WmsCarDO> result = new PageResult<WmsCarDO>();
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
    public WmsCarDO selectByPrimaryKey(Long id){
        return wmsCarExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsCarDO record){
        return wmsCarExtMapper.updateByPrimaryKeySelective(record);
    }
}