package com.chevrolet.core.task.impl;

import com.chevrolet.core.task.CarLockAutoDiscardTask;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.manager.CarStatusLockManager;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author maihe
 */
@Slf4j
@Component
@Data
public class CarLockAutoDiscardTaskImpl implements CarLockAutoDiscardTask {
    @Autowired
    private CarStatusLockManager carStatusLockManager;

    @Autowired
    private RedisWrapper redisWrapper;

    private static String key = "CarLockAutoDiscardTask";

    @Override
    public void autoDiscardCarLock() {
        try {
            if(redisWrapper.lock(key,30)){
                int updates = carStatusLockManager.autoDiscardCarLock();
                log.info("CarLockAutoDiscardTask autoDiscardCarLock start={} updates={}", new Date(),updates);
            }
        } catch (Exception e){
            log.error("CarLockAutoDiscardTask autoDiscardCarLock time={} e={}", new Date(), e);
        } finally {
            redisWrapper.delete(key);
        }
    }
}
