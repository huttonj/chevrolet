package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.enums.IsDeletedEnum;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.CarLoanDO;
import com.chevrolet.dal.dao.domain.query.CarLoanQuery;
import com.chevrolet.dal.dao.mapper.ext.CarLoanExtMapper;
import com.chevrolet.dal.dao.manager.CarLoanManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Manager for CarLoan.
 */

@Component
public class CarLoanManagerImpl implements CarLoanManager{

    @Autowired
    protected CarLoanExtMapper carLoanExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CarLoanQuery query){
        return carLoanExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CarLoanDO record){
        return carLoanExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CarLoanDO record){
        return carLoanExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CarLoanDO> selectByQuery(CarLoanQuery query){
        return carLoanExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CarLoanDO> selectByQueryWithPage(CarLoanQuery query) {
        PageResult<CarLoanDO> result = new PageResult<CarLoanDO>();
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
    public CarLoanDO selectByPrimaryKey(Long id){
        return carLoanExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CarLoanDO record){
        return carLoanExtMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * update by carid selective.
     */
    @Override
    public int updateByCarIdAndOrderNoSelective(CarLoanDO record){
        return carLoanExtMapper.updateByCarIdAndOrderNoSelective(record);
    }

    /**
     * update by CarLoanOrderNo selective.
     */
    @Override
    public int updateByCarLoanOrderNoSelective(CarLoanDO record) {
        return carLoanExtMapper.updateByCarLoanOrderNoSelective(record);
    }

    @Override
    public List<Long> selectUnbindCarIdsByOrderNos(List<Long> carIds, List<String> orderNos) {
        List<Long> resultList = new ArrayList<>();
        CarLoanQuery query = new CarLoanQuery();
        CarLoanQuery.Criteria criteria = query.or();
        criteria.andCarLoanOrderNoIn(orderNos).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        if (!CollectionUtils.isEmpty(carIds)){
            criteria.andCarIdNotIn(carIds);
        }
        List<CarLoanDO> list = carLoanExtMapper.selectByQuery(query);
        for (CarLoanDO entity : list){
            resultList.add(entity.getCarId());
        }
        return resultList;
    }

    @Override
    public List<CarLoanDO> selectCarNotInCarIds(List<Long> carIds, List<String> orderNos) {
        CarLoanQuery query = new CarLoanQuery();
        CarLoanQuery.Criteria criteria = query.or();
        criteria.andCarLoanOrderNoIn(orderNos).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        if (!CollectionUtils.isEmpty(carIds)){
            criteria.andCarIdNotIn(carIds);
        }
        return carLoanExtMapper.selectByQuery(query);
    }

    @Override
    public Map<Long, CarLoanDO> selectCarLoanMap(List<Long> carIds) {
        Map<Long, CarLoanDO> resultMap = new HashMap<>();
        CarLoanQuery query = new CarLoanQuery();
        query.or().andCarIdIn(carIds).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        List<CarLoanDO> loanDOList = carLoanExtMapper.selectByQuery(query);
        for (CarLoanDO entity : loanDOList){
            resultMap.put(entity.getCarId(),entity);
        }
        return resultMap;
    }

    @Override
    public Integer batchInsert(List<CarLoanDO> carLoanDOs) {
        return carLoanExtMapper.batchInsert(carLoanDOs);
    }

    @Override
    public Integer batchUpdateByCarIds(CarLoanDO carLoanDO, List<Long> carIds){
        return carLoanExtMapper.batchUpdateByCarIds(carLoanDO,carIds);
    }

    @Override
    public List<String> queryAllOnLoanOrderNos(){
        return carLoanExtMapper.queryAllOnLoanOrderNos();
    }
}