package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.AssetRightChgRecordDO;
import com.chevrolet.dal.dao.domain.query.AssetRightChgRecordQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for AssetRightChgRecord.
 */
public interface AssetRightChgRecordMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(AssetRightChgRecordQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(AssetRightChgRecordDO record);

    /**
     * insert selective.
     */
    int insertSelective(AssetRightChgRecordDO record);

    /**
     * select by query condition.
     */
    List<AssetRightChgRecordDO> selectByQuery(AssetRightChgRecordQuery query);

    /**
     * select by primary key.
     */
    AssetRightChgRecordDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(AssetRightChgRecordDO record);
}