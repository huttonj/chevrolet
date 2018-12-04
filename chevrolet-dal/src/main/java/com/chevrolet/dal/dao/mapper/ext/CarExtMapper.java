package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.mapper.CarMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * MyBatis Ext Mapper for Car.
 */
public interface CarExtMapper extends CarMapper {

    int batchInsert(List<CarDO> carDOS);

    int batchUpdateByCarIds(@Param(value = "carDO") CarDO carDO, @Param(value = "carIds") List<Long> carIds);

    int updateAssetRightByCarIds(@Param(value = "carDO") CarDO cardo,
                                 @Param(value = "carIds") List<Long> carIds,
                                 @Param(value = "oldAssetRight") Long oldAssetRight,
                                 @Param(value = "oldAssetRightType") Integer oldAssetRightType);


    int updateAssetRightByCarIdsTemp(@Param(value = "carDO") CarDO cardo,
                                 @Param(value = "carIds") List<Long> carIds);
}