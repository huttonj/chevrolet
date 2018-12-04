package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.AssetRightChgRecordDO;
import com.chevrolet.dal.dao.domain.query.AssetRightChgRecordQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Manager for AssetRightChgRecord.
 */
public interface AssetRightChgRecordManager {
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
    long insertSelective(AssetRightChgRecordDO record);

    /**
     * select by query condition.
     */
    List<AssetRightChgRecordDO> selectByQuery(AssetRightChgRecordQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<AssetRightChgRecordDO> selectByQueryWithPage(AssetRightChgRecordQuery query);

    /**
     * select by primary key.
     */
    AssetRightChgRecordDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(AssetRightChgRecordDO record);

    Integer updateByPrimaryKeySelectiveWithStatus(AssetRightChgRecordDO assetRightChgRecordD, List<Integer> recordStatus);

    Integer discardByChgRecordIds(List<Long> recordIds);
}