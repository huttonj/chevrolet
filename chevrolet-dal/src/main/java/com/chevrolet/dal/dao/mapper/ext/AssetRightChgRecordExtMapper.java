package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.AssetRightChgRecordDO;
import com.chevrolet.dal.dao.mapper.AssetRightChgRecordMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * MyBatis Ext Mapper for AssetRightChgRecord.
 */
public interface AssetRightChgRecordExtMapper extends AssetRightChgRecordMapper {

    Integer updateByPrimaryKeySelectiveWithStatus(@Param("assetRightChgRecord") AssetRightChgRecordDO assetRightChgRecordD,
                                                  @Param("recordStatus") List<Integer> recordStatus);

    Integer discardByChgRecordIds(@Param("recordIds") List<Long> recordIds);
}