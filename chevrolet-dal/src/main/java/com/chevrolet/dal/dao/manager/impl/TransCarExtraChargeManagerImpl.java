package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.TransCarExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransCarExtraChargeQuery;
import com.chevrolet.dal.dao.mapper.ext.TransCarExtraChargeExtMapper;
import com.chevrolet.dal.dao.manager.TransCarExtraChargeManager;

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
 * Manager for TransCarExtraCharge.
 */

@Component
public class TransCarExtraChargeManagerImpl implements TransCarExtraChargeManager{
    private static final Map EMPTY_MAP = new HashMap();
    @Autowired
    protected TransCarExtraChargeExtMapper transCarExtraChargeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TransCarExtraChargeQuery query){
        return transCarExtraChargeExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TransCarExtraChargeDO record){
        return transCarExtraChargeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TransCarExtraChargeDO record){
        return transCarExtraChargeExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<TransCarExtraChargeDO> records){
        return transCarExtraChargeExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TransCarExtraChargeDO> selectByQuery(TransCarExtraChargeQuery query){
        return transCarExtraChargeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TransCarExtraChargeDO> selectByQueryWithPage(TransCarExtraChargeQuery query) {
        PageResult<TransCarExtraChargeDO> result = new PageResult<TransCarExtraChargeDO>();
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
    public TransCarExtraChargeDO selectByPrimaryKey(Long id){
        return transCarExtraChargeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TransCarExtraChargeDO record){
        return transCarExtraChargeExtMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 通过transportCarIds查询transportCarId与
     *
     * @param transportCarIds
     * @return
     */
    @Override
    public Map<Long, List<TransCarExtraChargeDO>> getTransportCarIdExtraChargeDOsMap(List<Long> transportCarIds, Integer customerCarrierType) {
        if (CollectionUtils.isEmpty(transportCarIds)) {
            return EMPTY_MAP;
        }
        TransCarExtraChargeQuery query = new TransCarExtraChargeQuery();
        query.createCriteria()
                .andTransportCarIdIn(transportCarIds)
                .andPayeeTypeEqualTo(customerCarrierType)
                .andIsValidEqualTo(1)
                .andStatusEqualTo(1);

        List<TransCarExtraChargeDO> extraChargeDOs = transCarExtraChargeExtMapper.selectByQuery(query);
        if (CollectionUtils.isEmpty(extraChargeDOs)) {
            return EMPTY_MAP;
        }

        return extraChargeDOs.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(TransCarExtraChargeDO::getTransportCarId));
    }
}