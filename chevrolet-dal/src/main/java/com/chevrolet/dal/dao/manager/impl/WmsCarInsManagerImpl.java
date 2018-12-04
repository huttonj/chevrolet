package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarInsDO;
import com.chevrolet.dal.dao.domain.query.WmsCarInsQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsCarInsExtMapper;
import com.chevrolet.dal.dao.manager.WmsCarInsManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsCarIns.
 */

@Component
public class WmsCarInsManagerImpl implements WmsCarInsManager{
    
    @Autowired
    protected WmsCarInsExtMapper wmsCarInsExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsCarInsQuery query){
        return wmsCarInsExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsCarInsDO record){
        return wmsCarInsExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsCarInsDO record){
        return wmsCarInsExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<WmsCarInsDO> records){
        return wmsCarInsExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsCarInsDO> selectByQuery(WmsCarInsQuery query){
        return wmsCarInsExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsCarInsDO> selectByQueryWithPage(WmsCarInsQuery query) {
        PageResult<WmsCarInsDO> result = new PageResult<WmsCarInsDO>();
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
    public WmsCarInsDO selectByPrimaryKey(Long id){
        return wmsCarInsExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsCarInsDO record){
        return wmsCarInsExtMapper.updateByPrimaryKeySelective(record);
    }
}