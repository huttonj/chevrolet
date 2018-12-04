package com.chevrolet.core.ao.impl;

import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.CarLockStatusDTO;
import com.chevrolet.api.dto.CarStatusLockResultDTO;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import com.chevrolet.core.ao.CarAO;
import com.chevrolet.core.ao.CarStatusLockAO;
import com.chevrolet.core.enums.lock.CarLockResultEnum;
import com.chevrolet.core.enums.lock.CarLockTypeEnum;
import com.chevrolet.core.utils.BeanUtil;
import com.chevrolet.core.utils.CollectionUtil;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.CarDO;
import com.chevrolet.dal.dao.domain.CarStatusLockDO;
import com.chevrolet.dal.dao.domain.query.CarStatusLockQuery;
import com.chevrolet.dal.dao.manager.CarStatusLockManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.subaru.common.enums.IsDeletedEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author maihe
 */
@Slf4j
@Component
public class CarStatusLockAOImpl implements CarStatusLockAO {
    @Autowired
    private CarStatusLockManager carStatusLockManager;
    @Autowired
    private CarAO carAO;
    @Autowired
    private RedisWrapper redisWrapper;
    //锁前缀
    public static final String PREFIX = "Chevrolet:CarStatusLock:";

    public static final int EXPIRE = 5;

    @Override
    public CarLockResultEnum lock(Long carId, Integer bizType, String bizNo, Date expireTime) {
        if (check(carId, bizType, bizNo)) {
            String key = PREFIX + bizType + "_" + bizNo;
            try {
                if (redisWrapper.lock(key, EXPIRE)) {
                    if (canLock(Arrays.asList(carId), bizType, bizNo)) {
                        CarStatusLockDO record = new CarStatusLockDO();
                        record.setCarId(carId);
                        record.setBizType(bizType);
                        record.setBizNo(bizNo);
                        record.setLocked(CarLockTypeEnum.LOCK.getCode());
                        record.setExpireTime(expireTime);
                        long id = carStatusLockManager.insertSelective(record);
                        if (id > 0) {
                            redisWrapper.delete(key);
                            return CarLockResultEnum.SUCCESS;
                        }
                    } else {
                        redisWrapper.delete(key);
                        return CarLockResultEnum.EXISTED;
                    }
                }
            } catch (Exception e) {
                redisWrapper.delete(key);
                log.error("CarLockAO lock 报错 e={}", e);
            }
        }
        return CarLockResultEnum.FAILED;
    }

    @Override
    public CarLockResultEnum lock(List<Long> carIds, Integer bizType, String bizNo, Date expireTime) {
        if (check(carIds, bizType, bizNo)) {
            String key = PREFIX + bizType + "_" + bizNo;
            try {
                if (redisWrapper.lock(key, EXPIRE)) {
                    batchLock(carIds,bizType,bizNo,expireTime);
                    redisWrapper.delete(key);
                    return CarLockResultEnum.SUCCESS;
                }
            } catch (Exception e) {
                log.error("CarLockAO lock 报错 carIds={} bizType={} bizNo={} e={}", JSON.toJSONString(carIds), bizType, bizNo, e);
                redisWrapper.delete(key);
            }
        }
        return CarLockResultEnum.FAILED;
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void batchLock(List<Long> carIds, Integer bizType, String bizNo,Date expireTime){
        //减少数据库中重复数据
        carStatusLockManager.lockByWhereClauseWithLock(carIds,bizType,bizNo,expireTime);
        //先把现有的锁能用的用
        //查找一批车中已经存在的业务lock
        CarStatusLockQuery carStatusLockQuery = new CarStatusLockQuery();
        carStatusLockQuery.or().andCarIdIn(carIds).andBizTypeEqualTo(bizType)
                .andBizNoEqualTo(bizNo).andLockedEqualTo(CarLockTypeEnum.LOCK.getCode())
                .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        List<CarStatusLockDO> result = carStatusLockManager.selectByQuery(carStatusLockQuery);
        List<Long> existed = CollectionUtil.beanToVarList(result, e -> e.getCarId());
        //防止入参carid重复
        Set<Long> set = Sets.newHashSet(carIds);
        if (!CollectionUtils.isEmpty(existed)) {
            log.info("carIds="+ JSON.toJSONString(existed) +"的车辆已加锁，从本次待持久化中删除！");
            set.removeAll(existed);
        }
        List<CarStatusLockDO> carStatusLockDOS = Lists.newArrayList();
        for (Long carId : set) {
            CarStatusLockDO carStatusLockDO = new CarStatusLockDO();
            carStatusLockDO.setCarId(carId);
            carStatusLockDO.setBizNo(bizNo);
            carStatusLockDO.setBizType(bizType);
            carStatusLockDO.setLocked(CarLockTypeEnum.LOCK.getCode());
            carStatusLockDO.setExpireTime(expireTime);
            carStatusLockDOS.add(carStatusLockDO);
        }
        if (CollectionUtils.isEmpty(carStatusLockDOS)) {
            log.info("carIds="+ JSON.toJSONString(carIds) +"的车辆已全部加锁，不再重复记录！");
        } else {
            carStatusLockManager.batchInsert(carStatusLockDOS);
        }
    }

    @Override
    public CarLockResultEnum unlock(List<Long> carIds, Integer bizType, String bizNo) {
        if (check(carIds, bizType, bizNo)) {
            try {
                int count = carStatusLockManager.unlockByWhereClauseWithLock(carIds, bizType, bizNo);
                if (count > 0) {
                    return CarLockResultEnum.SUCCESS;
                } else {
                    return CarLockResultEnum.NOT_EXISTED;
                }
            } catch (Exception e) {
                log.error("CarLockAO unlock 报错 carIds={} bizType={} bizNo={} e={}", JSON.toJSONString(carIds), bizType, bizNo, e);
            }
        }
        return CarLockResultEnum.FAILED;
    }

    @Override
    public Boolean isLock(Long carId) {
        try {
            CarStatusLockQuery carStatusLockQuery = new CarStatusLockQuery();
            carStatusLockQuery.or().andCarIdEqualTo(carId).andLockedEqualTo(CarLockTypeEnum.LOCK.getCode())
                    .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
            return carStatusLockManager.countByQuery(carStatusLockQuery) > 0;
        } catch (Exception e) {
            log.error("CarLockAO isLock 报错 carId={} e={}", carId, e);
        }
        return false;
    }

    @Override
    public List<CarStatusLockResultDTO> queryCarLocks(List<Long> carIds, List<Integer> types) {
        try {
            return getCarLockResult(carIds,types);
        } catch (Exception e) {
            log.error("CarLockAO queryCarLocks 报错 carIds={} types={} e={}", JSON.toJSONString(carIds), JSON.toJSONString(types), e);
        }
        return new ArrayList<>();
    }

    @Override
    public List<CarStatusLockResultDTO> queryCarUniqueLocks(List<String> carUniques,List<Integer> types){
        try {
            List<Long> carIds = getCarIds(carUniques);
            if(!CollectionUtils.isEmpty(carIds)) {
                return getCarLockResult(carIds, types);
            }
        } catch (Exception e) {
            log.error("CarLockAO queryCarUniqueLocks 报错 carUniques={} types={} e={}", JSON.toJSONString(carUniques), JSON.toJSONString(types), e);
        }
        return new ArrayList<>();
    }

    @Override
    public List<CarLockStatusDTO> queryCarNowLocks(List<Long> carIds, List<Integer> types) {
        List<CarLockStatusDTO> carLockStatusDTOS = new ArrayList<>();
        CarStatusLockQuery carStatusLockQuery = new CarStatusLockQuery();
        carStatusLockQuery.or().andCarIdIn(carIds).andBizTypeIn(types).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        List<CarStatusLockDO> carStatusLockDOS = carStatusLockManager.selectByQuery(carStatusLockQuery);
        if(!CollectionUtils.isEmpty(carStatusLockDOS)){
            for(CarStatusLockDO carStatusLockDO : carStatusLockDOS){
                CarLockStatusDTO statusDTO = new CarLockStatusDTO();
                statusDTO.setCcCarId(carStatusLockDO.getCarId());
                statusDTO.setLocked(carStatusLockDO.getLocked());
                carLockStatusDTOS.add(statusDTO);
            }
        }
        return carLockStatusDTOS;
    }

    @Override
    public Boolean placeExtFlag(List<Long> carIds, CarLockExtStatusEnum statusEnum, List<Integer> types){
        try {
            if(CollectionUtils.isEmpty(carIds) || CollectionUtils.isEmpty(types)){
                return false;
            }
            CarStatusLockQuery query = new CarStatusLockQuery();
            query.or().andCarIdIn(carIds).andBizTypeIn(types).andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
            List<CarStatusLockDO> carStatusLockDOS = carStatusLockManager.selectByQuery(query);
            if(!CollectionUtils.isEmpty(carStatusLockDOS)){
                CarStatusLockDO carStatusLockDO = new CarStatusLockDO();
                carStatusLockDO.setExt1(statusEnum.getCode());
                carStatusLockManager.batchUpdateByCarLockId(carStatusLockDO,carStatusLockDOS.stream().map(e->e.getCarStatusLockId()).collect(Collectors.toList()));
            }
            return true;
        } catch (Exception e) {
            log.error("CarLockAO placeExtFlag 报错 carIds={} types={} status={} e={}", JSON.toJSONString(carIds), JSON.toJSONString(types), JSON.toJSONString(statusEnum), e);
        }
        return false;
    }

    private boolean check(Long carId, Integer bizType, String bizNo) {
        if (carId != null && bizType != null && bizNo != null) {
            return true;
        }
        return false;
    }

    private boolean check(List<Long> carIds, Integer bizType, String bizNo) {
        if (!CollectionUtils.isEmpty(carIds) && bizType != null && bizNo != null) {
            return true;
        }
        return false;
    }
    private List<CarStatusLockResultDTO> getCarLockResult(List<Long> carIds, List<Integer> types){
        CarStatusLockQuery query = new CarStatusLockQuery();
        CarStatusLockQuery.Criteria criteria = query.or();
        criteria.andCarIdIn(carIds).andLockedEqualTo(CarLockTypeEnum.LOCK.getCode())
                .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());

        if (!CollectionUtils.isEmpty(types)) {
            criteria.andBizTypeIn(types);
        }

        List<CarStatusLockDO> carStatusLockDOS = carStatusLockManager.selectByQuery(query);
        if (!CollectionUtils.isEmpty(carStatusLockDOS)) {
            return BeanUtil.copyPorp2DOs(CarStatusLockResultDTO.class, carStatusLockDOS);
        }
        return new ArrayList<>();
    }

    private List<Long> getCarIds(List<String> carUniques){
        List<CarDO> carDOS = carAO.getCarDOsByCarUniques(carUniques);
        if(!CollectionUtils.isEmpty(carDOS)){
            return carDOS.stream().map(carDO -> carDO.getCarId()).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    private boolean canLock(List<Long> carIds, Integer bizType, String bizNo) {
        //该车在该业务中没有加锁记录
        CarStatusLockQuery carStatusLockQuery = new CarStatusLockQuery();
        carStatusLockQuery.or().andCarIdIn(carIds).andBizTypeEqualTo(bizType)
                .andBizNoEqualTo(bizNo).andLockedEqualTo(CarLockTypeEnum.LOCK.getCode())
                .andIsDeletedEqualTo(IsDeletedEnum.NOT_DELETED.getCode());
        int count = carStatusLockManager.countByQuery(carStatusLockQuery);
        if (count == 0) {
            return true;
        }
        return false;
    }
}
