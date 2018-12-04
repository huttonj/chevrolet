package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.VinWhitelistDO;
import com.chevrolet.dal.dao.domain.query.VinWhitelistQuery;
import com.chevrolet.dal.dao.mapper.ext.VinWhitelistExtMapper;
import com.chevrolet.dal.dao.manager.VinWhitelistManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for VinWhitelist.
 */

@Component
public class VinWhitelistManagerImpl implements VinWhitelistManager{
    
    @Autowired
    protected VinWhitelistExtMapper vinWhitelistExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(VinWhitelistQuery query){
        return vinWhitelistExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(VinWhitelistDO record){
        return vinWhitelistExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(VinWhitelistDO record){
        return vinWhitelistExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<VinWhitelistDO> selectByQuery(VinWhitelistQuery query){
        return vinWhitelistExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<VinWhitelistDO> selectByQueryWithPage(VinWhitelistQuery query) {
        PageResult<VinWhitelistDO> result = new PageResult<VinWhitelistDO>();
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
    public VinWhitelistDO selectByPrimaryKey(Long id){
        return vinWhitelistExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(VinWhitelistDO record){
        return vinWhitelistExtMapper.updateByPrimaryKeySelective(record);
    }
}