package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.CarAssetChglogDO;
import com.chevrolet.dal.dao.mapper.CarAssetChglogMapper;

import java.util.List;

/**
 * MyBatis Ext Mapper for CarAssetChglog.
 */
public interface CarAssetChglogExtMapper extends CarAssetChglogMapper {
    int batchInsert(List<CarAssetChglogDO> carAssetChglogDOS);
}