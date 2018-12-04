package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.MhcCityDO;
import com.chevrolet.dal.dao.domain.query.MhcCityQuery;
import com.chevrolet.dal.dao.mapper.ext.MhcCityExtMapper;
import com.chevrolet.dal.dao.manager.MhcCityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for MhcCity.
 */

@Component
public class MhcCityManagerImpl implements MhcCityManager{
    
    @Autowired
    protected MhcCityExtMapper mhcCityExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(MhcCityQuery query){
        return mhcCityExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(MhcCityDO record){
        return mhcCityExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(MhcCityDO record){
        return mhcCityExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<MhcCityDO> selectByQuery(MhcCityQuery query){
        return mhcCityExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<MhcCityDO> selectByQueryWithPage(MhcCityQuery query) {
        PageResult<MhcCityDO> result = new PageResult<MhcCityDO>();
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
    public MhcCityDO selectByPrimaryKey(Long id){
        return mhcCityExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(MhcCityDO record){
        return mhcCityExtMapper.updateByPrimaryKeySelective(record);
    }
}