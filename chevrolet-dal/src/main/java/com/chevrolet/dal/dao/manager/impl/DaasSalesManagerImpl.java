package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.DaasSalesDO;
import com.chevrolet.dal.dao.domain.query.DaasSalesQuery;
import com.chevrolet.dal.dao.mapper.ext.DaasSalesExtMapper;
import com.chevrolet.dal.dao.manager.DaasSalesManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for DaasSales.
 */

@Component
public class DaasSalesManagerImpl implements DaasSalesManager{
    
    @Autowired
    protected DaasSalesExtMapper daasSalesExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(DaasSalesQuery query){
        return daasSalesExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(DaasSalesDO record){
        return daasSalesExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(DaasSalesDO record){
        return daasSalesExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<DaasSalesDO> selectByQuery(DaasSalesQuery query){
        return daasSalesExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<DaasSalesDO> selectByQueryWithPage(DaasSalesQuery query) {
        PageResult<DaasSalesDO> result = new PageResult<DaasSalesDO>();
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
    public DaasSalesDO selectByPrimaryKey(Long id){
        return daasSalesExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(DaasSalesDO record){
        return daasSalesExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int batchInsert(List<DaasSalesDO> daasSalesDOS){
        return daasSalesExtMapper.batchInsert(daasSalesDOS);
    }

    @Override
    public int truncateData(){
        return daasSalesExtMapper.truncateData();
    }
}