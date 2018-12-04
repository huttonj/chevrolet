package com.chevrolet.core.service.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.chevrolet.api.dto.CarLockStatusDTO;
import com.chevrolet.api.dto.CarStatusLockResultDTO;
import com.chevrolet.api.dto.request.CarLockReq;
import com.chevrolet.api.enums.lock.CarLockBizTypeEnum;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import com.chevrolet.api.service.CarStatusLockService;
import com.chevrolet.core.ao.CarStatusLockAO;
import com.chevrolet.core.enums.lock.CarLockResultEnum;
import com.subaru.common.entity.BizResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author maihe
 */
@Slf4j
@Component
@Service(interfaceClass = CarStatusLockService.class)
public class CarStatusLockServiceImpl implements CarStatusLockService {

    @Autowired
    private CarStatusLockAO carStatusLockAO;

    @Override
    public BizResult<Boolean> lock(CarLockReq carLockReq) {
        try {
            log.info("CarStatusLockService lock carLockReq={}", JSON.toJSONString(carLockReq));
            Long carId = carLockReq.getCarId();
            List<Long> carIds = carLockReq.getCarIds();
            Integer bizType = carLockReq.getBizType().getCode();
            String bizNo = carLockReq.getBizNo();
            Date expireTime = carLockReq.getExpireTime();
            CarLockResultEnum result = CarLockResultEnum.FAILED;
            if(carId != null && bizNo != null && bizType != null){
                result = carStatusLockAO.lock(carId,bizType,bizNo,expireTime);
            } else if(CollectionUtils.isNotEmpty(carIds) && bizNo != null && bizType != null){
                result = carStatusLockAO.lock(carIds,bizType,bizNo,expireTime);
            }
            log.info("CarStatusLockService lock carLockReq={} result={}", JSON.toJSONString(carLockReq), JSON.toJSONString(result));
            if(CarLockResultEnum.FAILED.equals(result)){
                return BizResult.create(false);
            } else {
                return BizResult.create(true);
            }
        } catch (Exception e){
            log.error("CarStatusLockService lock e={}", e);
        }
        return BizResult.create(false);
    }

    @Override
    public BizResult<Boolean> unlock(CarLockReq carLockReq) {
        log.info("CarStatusLockService unlock carLockReq={}",JSON.toJSONString(carLockReq));
        CarLockResultEnum result = carStatusLockAO.unlock(carLockReq.getCarIds(), carLockReq.getBizType().getCode(), carLockReq.getBizNo());
        log.info("CarStatusLockService unlock carLockReq={} result={}", JSON.toJSONString(carLockReq), JSON.toJSONString(result));
        if(CarLockResultEnum.FAILED.equals(result)){
            return BizResult.create(false);
        } else {
            return BizResult.create(true);
        }
    }

    @Override
    public BizResult<Boolean> isLock(CarLockReq carLockReq) {
        return BizResult.create(carStatusLockAO.isLock(carLockReq.getCarId()));
    }


    @Override
    public BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds){
        log.info("CarStatusLockService queryCarLocks carIds={}",JSON.toJSONString(carIds));
        return BizResult.create(carStatusLockAO.queryCarLocks(carIds,null));
    }

    @Override
    public BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds,List<Integer> types){
        log.info("CarStatusLockService queryCarLocks carIds={} types={}",JSON.toJSONString(carIds),JSON.toJSONString(types));
        return BizResult.create(carStatusLockAO.queryCarLocks(carIds,types));
    }

    @Override
    public BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques){
        log.info("CarStatusLockService queryCarUniqueLocks carUniques={}",JSON.toJSONString(carUniques));
        return BizResult.create(carStatusLockAO.queryCarUniqueLocks(carUniques,null));
    }

    @Override
    public BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques,List<Integer> types){
        log.info("CarStatusLockService queryCarUniqueLocks carUniques={} types={}",JSON.toJSONString(carUniques),JSON.toJSONString(types));
        return BizResult.create(carStatusLockAO.queryCarUniqueLocks(carUniques,types));
    }

    @Override
    public BizResult<List<CarLockStatusDTO>> queryAllCarLocks(List<Long> carIds,List<Integer> types){
        log.info("CarStatusLockService queryCarLocks carIds={} types={}",JSON.toJSONString(carIds),JSON.toJSONString(types));
        return BizResult.create(carStatusLockAO.queryCarNowLocks(carIds,types));
    }

    @Override
    public BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum){
        log.info("CarStatusLockService placeExt1Flag carIds={} statusEnum={}",JSON.toJSONString(carIds),JSON.toJSONString(statusEnum));
        return BizResult.create(carStatusLockAO.placeExtFlag(carIds,statusEnum, Arrays.asList(CarLockBizTypeEnum.CAR_LOA_PICK_UP.getCode())));
    }

    @Override
    public BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum, List<CarLockBizTypeEnum> carLockBizTypes){
        log.info("CarStatusLockService placeExt1Flag carIds={} statusEnum={} carLockBizTypeEnum={}",JSON.toJSONString(carIds),JSON.toJSONString(statusEnum),
                JSON.toJSONString(carLockBizTypes));
        return BizResult.create(carStatusLockAO.placeExtFlag(carIds,statusEnum,
                carLockBizTypes.stream().map(CarLockBizTypeEnum::getCode).collect(Collectors.toList())));
    }

}
