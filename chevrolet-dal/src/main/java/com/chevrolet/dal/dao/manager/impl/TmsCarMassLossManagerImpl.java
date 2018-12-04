package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsCarMassLossDO;
import com.chevrolet.dal.dao.domain.query.TmsCarMassLossQuery;
import com.chevrolet.dal.dao.mapper.ext.TmsCarMassLossExtMapper;
import com.chevrolet.dal.dao.manager.TmsCarMassLossManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for TmsCarMassLoss.
 */

@Component
public class TmsCarMassLossManagerImpl implements TmsCarMassLossManager{
    
    @Autowired
    protected TmsCarMassLossExtMapper tmsCarMassLossExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TmsCarMassLossQuery query){
        return tmsCarMassLossExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TmsCarMassLossDO record){
        return tmsCarMassLossExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TmsCarMassLossDO record){
        return tmsCarMassLossExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TmsCarMassLossDO> selectByQuery(TmsCarMassLossQuery query){
        return tmsCarMassLossExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TmsCarMassLossDO> selectByQueryWithPage(TmsCarMassLossQuery query) {
        PageResult<TmsCarMassLossDO> result = new PageResult<TmsCarMassLossDO>();
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
    public TmsCarMassLossDO selectByPrimaryKey(Long id){
        return tmsCarMassLossExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TmsCarMassLossDO record){
        return tmsCarMassLossExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<TmsCarMassLossDO> selectCarMassLossByCarId(List<Long> transportCarIds) {
        TmsCarMassLossQuery massLossQuery = new TmsCarMassLossQuery();
        massLossQuery.or()
                .andStatusEqualTo(1)
                .andTransportCarIdIn(transportCarIds);
        List<TmsCarMassLossDO> carMassLossDOs = tmsCarMassLossExtMapper.selectByQuery(massLossQuery);
        return carMassLossDOs;
    }
}