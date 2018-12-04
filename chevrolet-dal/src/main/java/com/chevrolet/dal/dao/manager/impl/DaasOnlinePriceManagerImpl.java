package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.DaasOnlinePriceDO;
import com.chevrolet.dal.dao.domain.query.DaasOnlinePriceQuery;
import com.chevrolet.dal.dao.mapper.ext.DaasOnlinePriceExtMapper;
import com.chevrolet.dal.dao.manager.DaasOnlinePriceManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for DaasOnlinePrice.
 */

@Component
public class DaasOnlinePriceManagerImpl implements DaasOnlinePriceManager{
    
    @Autowired
    protected DaasOnlinePriceExtMapper daasOnlinePriceExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(DaasOnlinePriceQuery query){
        return daasOnlinePriceExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(DaasOnlinePriceDO record){
        return daasOnlinePriceExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(DaasOnlinePriceDO record){
        return daasOnlinePriceExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<DaasOnlinePriceDO> selectByQuery(DaasOnlinePriceQuery query){
        return daasOnlinePriceExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<DaasOnlinePriceDO> selectByQueryWithPage(DaasOnlinePriceQuery query) {
        PageResult<DaasOnlinePriceDO> result = new PageResult<DaasOnlinePriceDO>();
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
    public DaasOnlinePriceDO selectByPrimaryKey(Long id){
        return daasOnlinePriceExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(DaasOnlinePriceDO record){
        return daasOnlinePriceExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int batchInsert(List<DaasOnlinePriceDO> daasOnlinePriceDOS){
        return daasOnlinePriceExtMapper.batchInsert(daasOnlinePriceDOS);
    }

    @Override
    public int truncateData(){
        return daasOnlinePriceExtMapper.truncateData();
    }
}