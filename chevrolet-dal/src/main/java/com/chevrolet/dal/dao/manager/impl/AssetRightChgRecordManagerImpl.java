package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.AssetRightChgRecordDO;
import com.chevrolet.dal.dao.domain.query.AssetRightChgRecordQuery;
import com.chevrolet.dal.dao.mapper.ext.AssetRightChgRecordExtMapper;
import com.chevrolet.dal.dao.manager.AssetRightChgRecordManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for AssetRightChgRecord.
 */

@Component
public class AssetRightChgRecordManagerImpl implements AssetRightChgRecordManager{
    
    @Autowired
    protected AssetRightChgRecordExtMapper assetRightChgRecordExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(AssetRightChgRecordQuery query){
        return assetRightChgRecordExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(AssetRightChgRecordDO record){
        return assetRightChgRecordExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(AssetRightChgRecordDO record){
        assetRightChgRecordExtMapper.insertSelective(record);
        return record.getAssetRightChgRecordId();
    }

    /**
     * select by query condition.
     */
    @Override
    public List<AssetRightChgRecordDO> selectByQuery(AssetRightChgRecordQuery query){
        return assetRightChgRecordExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<AssetRightChgRecordDO> selectByQueryWithPage(AssetRightChgRecordQuery query) {
        PageResult<AssetRightChgRecordDO> result = new PageResult<AssetRightChgRecordDO>();
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
    public AssetRightChgRecordDO selectByPrimaryKey(Long id){
        return assetRightChgRecordExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(AssetRightChgRecordDO record){
        return assetRightChgRecordExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Integer updateByPrimaryKeySelectiveWithStatus(AssetRightChgRecordDO assetRightChgRecordDO, List<Integer> recordStatus){
        return assetRightChgRecordExtMapper.updateByPrimaryKeySelectiveWithStatus(assetRightChgRecordDO,recordStatus);
    }

    @Override
    public Integer discardByChgRecordIds(List<Long> recordIds){
        return assetRightChgRecordExtMapper.discardByChgRecordIds(recordIds);
    }
}