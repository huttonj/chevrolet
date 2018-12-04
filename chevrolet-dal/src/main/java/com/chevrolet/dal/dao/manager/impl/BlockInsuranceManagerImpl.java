package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.BlockInsuranceDO;
import com.chevrolet.dal.dao.domain.query.BlockInsuranceQuery;
import com.chevrolet.dal.dao.mapper.ext.BlockInsuranceExtMapper;
import com.chevrolet.dal.dao.manager.BlockInsuranceManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for BlockInsurance.
 */

@Component
public class BlockInsuranceManagerImpl implements BlockInsuranceManager{
    
    @Autowired
    protected BlockInsuranceExtMapper blockInsuranceExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(BlockInsuranceQuery query){
        return blockInsuranceExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(BlockInsuranceDO record){
        return blockInsuranceExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(BlockInsuranceDO record){
        return blockInsuranceExtMapper.insertSelective(record);
    }

    /**
     * insert selective.
     */
    @Override
    public int batchInsert(List<BlockInsuranceDO> records){
        return blockInsuranceExtMapper.batchInsert(records);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<BlockInsuranceDO> selectByQuery(BlockInsuranceQuery query){
        return blockInsuranceExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<BlockInsuranceDO> selectByQueryWithPage(BlockInsuranceQuery query) {
        PageResult<BlockInsuranceDO> result = new PageResult<BlockInsuranceDO>();
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
    public BlockInsuranceDO selectByPrimaryKey(Long id){
        return blockInsuranceExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(BlockInsuranceDO record){
        return blockInsuranceExtMapper.updateByPrimaryKeySelective(record);
    }
}