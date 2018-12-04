package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TransOrderExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransOrderExtraChargeQuery;
import com.chevrolet.dal.dao.mapper.ext.TransOrderExtraChargeExtMapper;
import com.chevrolet.dal.dao.manager.TransOrderExtraChargeManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 * Manager for TransOrderExtraCharge.
 */

@Component
public class TransOrderExtraChargeManagerImpl implements TransOrderExtraChargeManager{
    private static final Map EMPTY_MAP = new HashMap();
    @Autowired
    protected TransOrderExtraChargeExtMapper transOrderExtraChargeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TransOrderExtraChargeQuery query){
        return transOrderExtraChargeExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TransOrderExtraChargeDO record){
        return transOrderExtraChargeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TransOrderExtraChargeDO record){
        return transOrderExtraChargeExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<TransOrderExtraChargeDO> records){
        return transOrderExtraChargeExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TransOrderExtraChargeDO> selectByQuery(TransOrderExtraChargeQuery query){
        return transOrderExtraChargeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TransOrderExtraChargeDO> selectByQueryWithPage(TransOrderExtraChargeQuery query) {
        PageResult<TransOrderExtraChargeDO> result = new PageResult<TransOrderExtraChargeDO>();
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
    public TransOrderExtraChargeDO selectByPrimaryKey(Long id){
        return transOrderExtraChargeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TransOrderExtraChargeDO record){
        return transOrderExtraChargeExtMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 通过transportOrderIds查询transportOrderId与TransOrderExtraChargeDOs的映射
     *
     * @param transportOrderIds
     * @param customerCarrierType
     * @return
     */
    @Override
    public Map<Long, List<TransOrderExtraChargeDO>> getTransportOrderIdExtraChargeDOsMap(List<Long> transportOrderIds, Integer customerCarrierType) {
        if (CollectionUtils.isEmpty(transportOrderIds)) {
            return EMPTY_MAP;
        }
        TransOrderExtraChargeQuery query = new TransOrderExtraChargeQuery();
        query.createCriteria()
                .andTransportOrderIdIn(transportOrderIds)
                .andPayeeTypeEqualTo(customerCarrierType)
                .andStatusEqualTo(1);

        List<TransOrderExtraChargeDO> extraChargeDOs = transOrderExtraChargeExtMapper.selectByQuery(query);
        if (CollectionUtils.isEmpty(extraChargeDOs)) {
            return EMPTY_MAP;
        }

        return extraChargeDOs.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(TransOrderExtraChargeDO::getTransportOrderId));
    }
}