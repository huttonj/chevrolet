package com.chevrolet.dal.dao.manager;

import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.query.CarQuery;
import com.subaru.common.query.PageResult;

import java.util.List;
import java.util.Map;


/**
 * Manager for Car.
 */
public interface CarManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarDO record);

    /**
     * insert selective.
     */
    long insertSelective(CarDO record);

    /**
     * select by query condition.
     */
    List<CarDO> selectByQuery(CarQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarDO> selectByQueryWithPage(CarQuery query);

    /**
     * select by primary key.
     */
    CarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarDO record);

    /**
     * select by ids.
     */
    List<CarDO> selectByCarIds(List<Long> carIds);

    Map<Long,CarDO> selectMapByCarIds(List<Long> transportCarIds);

    /**
     * 批量写入carId
     * @param carDOS
     * @return
     */
    int batchInsert(List<CarDO> carDOS);

    int batchUpdateByCarIds(CarDO carDO, List<Long> carIds);

    int updateAssetRightByCarIds(CarDO carDO, List<Long> carIds, Long oldAssetRight, Integer oldAssetRightType);
    //临时用
    int updateAssetRightByCarIdsTemp(CarDO carDO, List<Long> carIds);

}