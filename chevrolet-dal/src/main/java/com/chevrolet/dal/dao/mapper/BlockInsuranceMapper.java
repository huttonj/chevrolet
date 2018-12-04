package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.BlockInsuranceDO;
import com.chevrolet.dal.dao.domain.query.BlockInsuranceQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for BlockInsurance.
 */
public interface BlockInsuranceMapper {
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
    int insertSelective(BlockInsuranceDO record);

    /**
     * batch insert.
     */
    int batchInsert(List<BlockInsuranceDO> records);

    /**
     * select by query condition.
     */
    List<BlockInsuranceDO> selectByQuery(BlockInsuranceQuery query);

    /**
     * select by primary key.
     */
    BlockInsuranceDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(BlockInsuranceDO record);
}