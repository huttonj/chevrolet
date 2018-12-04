package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TmsTransportCarDO;
import com.chevrolet.dal.dao.domain.query.TmsTransportCarQuery;
import com.chevrolet.dal.dao.mapper.ext.TmsTransportCarExtMapper;
import com.chevrolet.dal.dao.manager.TmsTransportCarManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Manager for TmsTransportCar.
 */

@Component
public class TmsTransportCarManagerImpl implements TmsTransportCarManager{
    
    @Autowired
    protected TmsTransportCarExtMapper tmsTransportCarExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TmsTransportCarQuery query){
        return tmsTransportCarExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TmsTransportCarDO record){
        return tmsTransportCarExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TmsTransportCarDO record){
        return tmsTransportCarExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TmsTransportCarDO> selectByQuery(TmsTransportCarQuery query){
        return tmsTransportCarExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TmsTransportCarDO> selectByQueryWithPage(TmsTransportCarQuery query) {
        PageResult<TmsTransportCarDO> result = new PageResult<TmsTransportCarDO>();
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
    public TmsTransportCarDO selectByPrimaryKey(Long id){
        return tmsTransportCarExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TmsTransportCarDO record){
        return tmsTransportCarExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Map<Long, List<TmsTransportCarDO>> selectTmsCarMapByTransportIds(List<Long> transportIds) {
        Map<Long, List<TmsTransportCarDO>> resultMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(transportIds)){
            TmsTransportCarQuery query = new TmsTransportCarQuery();
            query.or().andStatusEqualTo(1).andTransportOrderIdIn(transportIds);
            List<TmsTransportCarDO> tmsTransportCarDOList = selectByQuery(query);
            for (TmsTransportCarDO entity : tmsTransportCarDOList){
                if (resultMap.get(entity.getTransportOrderId()) == null){
                    resultMap.put(entity.getTransportOrderId(),new ArrayList<>());
                }
                resultMap.get(entity.getTransportOrderId()).add(entity);
            }
        }
        return resultMap;
    }

    @Override
    public List<TmsTransportCarDO> selectByTransportIds(List<Long> transportIds) {
        List<TmsTransportCarDO> resultList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(transportIds)){
            TmsTransportCarQuery query = new TmsTransportCarQuery();
            query.or().andStatusEqualTo(1).andTransportOrderIdIn(transportIds);
            resultList = selectByQuery(query);
        }
        return resultList;
    }

    @Override
    public List<Long> selectCarIdByTransportId(List<Long> transportOrderIds) {
        List<Long> resultList = new ArrayList<>();
        if (CollectionUtils.isEmpty(transportOrderIds)){
            return resultList;
        }
        TmsTransportCarQuery query = new TmsTransportCarQuery();
        TmsTransportCarQuery.Criteria criteria = query.or();
        criteria.andStatusEqualTo(1);
        criteria.andTransportOrderIdIn(transportOrderIds);
        List<TmsTransportCarDO> list = selectByQuery(query);
        for (TmsTransportCarDO entity : list){
            resultList.add(entity.getTransportCarId());
        }
        return resultList;
    }

    @Override
    public List<TmsTransportCarDO> selectByTransportCarIds(List<Long> transportCarIds) {
        if (CollectionUtils.isEmpty(transportCarIds)) {
            return new ArrayList<>();
        } else {
            TmsTransportCarQuery transportCarQuery = new TmsTransportCarQuery();
            transportCarQuery.or()
                    .andStatusEqualTo(1)
                    .andCarTransportStatusNotEqualTo(10)
                    .andTransportCarIdIn(transportCarIds);
            return tmsTransportCarExtMapper.selectByQuery(transportCarQuery);
        }
    }
}