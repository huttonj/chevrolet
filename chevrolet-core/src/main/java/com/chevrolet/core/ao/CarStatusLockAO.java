package com.chevrolet.core.ao;

import com.chevrolet.api.dto.CarLockStatusDTO;
import com.chevrolet.api.dto.CarStatusLockResultDTO;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import com.chevrolet.core.enums.lock.CarLockResultEnum;
import com.chevrolet.dal.dao.domain.CarStatusLockDO;

import java.util.Date;
import java.util.List;

public interface CarStatusLockAO {
    //冻结
    CarLockResultEnum lock(Long carId, Integer bizType, String bizNo, Date expireTime);

    //冻结
    CarLockResultEnum lock(List<Long> carIds, Integer bizType, String bizNo, Date expireTime);

    //解冻
    CarLockResultEnum unlock(List<Long> carIds, Integer bizType, String bizNo);

    //是否冻结
    Boolean isLock(Long carId);

    List<CarStatusLockResultDTO> queryCarLocks(List<Long> carIds,List<Integer> types);

    List<CarStatusLockResultDTO> queryCarUniqueLocks(List<String> carUniques,List<Integer> types);

    List<CarLockStatusDTO> queryCarNowLocks(List<Long> carIds, List<Integer> types);

    Boolean placeExtFlag(List<Long> carIds, CarLockExtStatusEnum statusEnum, List<Integer> types);

}
