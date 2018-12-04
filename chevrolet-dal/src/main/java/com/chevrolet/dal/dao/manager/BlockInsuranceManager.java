package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.BlockInsuranceDO;
import com.chevrolet.dal.dao.domain.query.BlockInsuranceQuery;

import java.util.List;


/**
 * Manager for BlockInsurance.
 */
public interface BlockInsuranceManager {
    /**
     * query count by query condition.
     */
    int countByQuery(BlockInsuranceQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(BlockInsuranceDO record);

    /**
     * insert selective.
     */
    long insertSelective(BlockInsuranceDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<BlockInsuranceDO> records);

    /**
     * select by query condition.
     */
    List<BlockInsuranceDO> selectByQuery(BlockInsuranceQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<BlockInsuranceDO> selectByQueryWithPage(BlockInsuranceQuery query);

    /**
     * select by primary key.
     */
    BlockInsuranceDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(BlockInsuranceDO record);
}