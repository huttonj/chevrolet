package com.chevrolet.dal.dao.manager.impl;

import com.alibaba.fastjson.JSON;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.query.CarQuery;
import com.chevrolet.dal.dao.manager.CarManager;
import com.chevrolet.dal.dao.mapper.ext.CarExtMapper;
import com.subaru.common.query.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Manager for Car.
 */

@Component
@Slf4j
public class CarManagerImpl implements CarManager{

    @Autowired
    protected CarExtMapper carExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarQuery query){
        return carExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarDO record){
        return carExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarDO record){
        return carExtMapper.insertSelective(record);
    }


    /**
     * select by query condition.
     */
    @Override
    public List<CarDO> selectByQuery(CarQuery query){

        return carExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarDO> selectByQueryWithPage(CarQuery query) {
        PageResult<CarDO> result = new PageResult<CarDO>();
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
    public CarDO selectByPrimaryKey(Long id){
        return carExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarDO record){
        return carExtMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * select by ids.
     */
    @Override
    public List<CarDO> selectByCarIds(List<Long> carIds){
        CarQuery carQuery = new CarQuery();
        carQuery.or().andCarIdIn(carIds);
        return carExtMapper.selectByQuery(carQuery);
    }

    @Override
    public Map<Long, CarDO> selectMapByCarIds(List<Long> transportCarIds) {
        Map<Long, CarDO> resultMap = new HashMap<>();
        CarQuery query = new CarQuery();
        query.or().andCarIdIn(transportCarIds);
        List<CarDO> list = carExtMapper.selectByQuery(query);
        for (CarDO entity : list){
            resultMap.put(entity.getCarId(),entity);
        }
        return resultMap;
    }

    @Override
    public int batchInsert(List<CarDO> carDOS) {
        return carExtMapper.batchInsert(carDOS);
    }

    @Override
    public int batchUpdateByCarIds(CarDO carDO, List<Long> carIds){
        return carExtMapper.batchUpdateByCarIds(carDO, carIds);
    }

    @Override
    public int updateAssetRightByCarIds(CarDO carDO, List<Long> carIds, Long oldAssetRight, Integer oldAssetRightType){
        return carExtMapper.updateAssetRightByCarIds(carDO,carIds,oldAssetRight,oldAssetRightType);
    }

    @Override
    public int updateAssetRightByCarIdsTemp(CarDO carDO, List<Long> carIds){
        return carExtMapper.updateAssetRightByCarIdsTemp(carDO,carIds);
    }
}