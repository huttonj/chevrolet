package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.MhcCountyDO;
import com.chevrolet.dal.dao.domain.query.MhcCountyQuery;
import com.chevrolet.dal.dao.mapper.ext.MhcCountyExtMapper;
import com.chevrolet.dal.dao.manager.MhcCountyManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * Manager for MhcCounty.
 */

@Component
public class MhcCountyManagerImpl implements MhcCountyManager{
    
    @Autowired
    protected MhcCountyExtMapper mhcCountyExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(MhcCountyQuery query){
        return mhcCountyExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(MhcCountyDO record){
        return mhcCountyExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(MhcCountyDO record){
        return mhcCountyExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<MhcCountyDO> selectByQuery(MhcCountyQuery query){
        List<MhcCountyDO> countyDOList = mhcCountyExtMapper.selectByQuery(query);
        if (!CollectionUtils.isEmpty(countyDOList)) {
            for (MhcCountyDO temp : countyDOList) {
                if (temp.getCountyShortName() == null) {
                    temp.setCountyShortName("");
                }
            }
        }
        return countyDOList;
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<MhcCountyDO> selectByQueryWithPage(MhcCountyQuery query) {
        PageResult<MhcCountyDO> result = new PageResult<MhcCountyDO>();
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
    public MhcCountyDO selectByPrimaryKey(Long id){
        return mhcCountyExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(MhcCountyDO record){
        return mhcCountyExtMapper.updateByPrimaryKeySelective(record);
    }
}