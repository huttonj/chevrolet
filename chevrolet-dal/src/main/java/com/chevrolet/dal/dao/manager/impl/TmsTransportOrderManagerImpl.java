package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsTransportOrderDO;
import com.chevrolet.dal.dao.domain.query.TmsTransportOrderQuery;
import com.chevrolet.dal.dao.mapper.ext.TmsTransportOrderExtMapper;
import com.chevrolet.dal.dao.manager.TmsTransportOrderManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * Manager for TmsTransportOrder.
 */

@Component
public class TmsTransportOrderManagerImpl implements TmsTransportOrderManager{
    
    @Autowired
    protected TmsTransportOrderExtMapper tmsTransportOrderExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TmsTransportOrderQuery query){
        return tmsTransportOrderExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TmsTransportOrderDO record){
        return tmsTransportOrderExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TmsTransportOrderDO record){
        return tmsTransportOrderExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TmsTransportOrderDO> selectByQuery(TmsTransportOrderQuery query){
        return tmsTransportOrderExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TmsTransportOrderDO> selectByQueryWithPage(TmsTransportOrderQuery query) {
        PageResult<TmsTransportOrderDO> result = new PageResult<TmsTransportOrderDO>();
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
    public TmsTransportOrderDO selectByPrimaryKey(Long id){
        return tmsTransportOrderExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TmsTransportOrderDO record){
        return tmsTransportOrderExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Long> selectTransportOrderIdsByOrderNo(List<String> orderNos) {
        List<Long> resultList = new ArrayList<>();
        TmsTransportOrderQuery query = new TmsTransportOrderQuery();
        TmsTransportOrderQuery.Criteria criteria = query.or();
        criteria.andStatusEqualTo(1);
        criteria.andBizOrderNoIn(orderNos);
        List<TmsTransportOrderDO> list = selectByQuery(query);
        for (TmsTransportOrderDO entity : list){
            resultList.add(entity.getTransportOrderId());
        }
        return resultList;
    }

}