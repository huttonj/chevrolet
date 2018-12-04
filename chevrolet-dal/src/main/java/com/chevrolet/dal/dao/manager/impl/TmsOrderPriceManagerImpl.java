package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsOrderPriceDO;
import com.chevrolet.dal.dao.domain.query.TmsOrderPriceQuery;
import com.chevrolet.dal.dao.mapper.ext.TmsOrderPriceExtMapper;
import com.chevrolet.dal.dao.manager.TmsOrderPriceManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for TmsOrderPrice.
 */

@Component
public class TmsOrderPriceManagerImpl implements TmsOrderPriceManager{
    
    @Autowired
    protected TmsOrderPriceExtMapper tmsOrderPriceExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TmsOrderPriceQuery query){
        return tmsOrderPriceExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TmsOrderPriceDO record){
        return tmsOrderPriceExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TmsOrderPriceDO record){
        return tmsOrderPriceExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TmsOrderPriceDO> selectByQuery(TmsOrderPriceQuery query){
        return tmsOrderPriceExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TmsOrderPriceDO> selectByQueryWithPage(TmsOrderPriceQuery query) {
        PageResult<TmsOrderPriceDO> result = new PageResult<TmsOrderPriceDO>();
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
    public TmsOrderPriceDO selectByPrimaryKey(Long id){
        return tmsOrderPriceExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TmsOrderPriceDO record){
        return tmsOrderPriceExtMapper.updateByPrimaryKeySelective(record);
    }
}