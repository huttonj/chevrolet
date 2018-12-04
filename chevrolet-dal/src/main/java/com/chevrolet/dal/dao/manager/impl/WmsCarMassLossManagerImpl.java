package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.WmsCarMassLossDO;
import com.chevrolet.dal.dao.domain.query.WmsCarMassLossQuery;
import com.chevrolet.dal.dao.mapper.ext.WmsCarMassLossExtMapper;
import com.chevrolet.dal.dao.manager.WmsCarMassLossManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for WmsCarMassLoss.
 */

@Component
public class WmsCarMassLossManagerImpl implements WmsCarMassLossManager{
    
    @Autowired
    protected WmsCarMassLossExtMapper wmsCarMassLossExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(WmsCarMassLossQuery query){
        return wmsCarMassLossExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(WmsCarMassLossDO record){
        return wmsCarMassLossExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(WmsCarMassLossDO record){
        return wmsCarMassLossExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<WmsCarMassLossDO> selectByQuery(WmsCarMassLossQuery query){
        return wmsCarMassLossExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<WmsCarMassLossDO> selectByQueryWithPage(WmsCarMassLossQuery query) {
        PageResult<WmsCarMassLossDO> result = new PageResult<WmsCarMassLossDO>();
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
    public WmsCarMassLossDO selectByPrimaryKey(Long id){
        return wmsCarMassLossExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(WmsCarMassLossDO record){
        return wmsCarMassLossExtMapper.updateByPrimaryKeySelective(record);
    }
}