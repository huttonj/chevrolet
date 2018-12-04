package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.CarStatusLockDO;
import com.chevrolet.dal.dao.mapper.CarStatusLockMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * MyBatis Ext Mapper for CarStatusLock.
 * @author maihe
 */
public interface CarStatusLockExtMapper extends CarStatusLockMapper {

    /**
     * @param carStatusLockDO
     * @param carStatusLockIds
     * @return
     */
    int batchUpdateByCarLockId(@Param(value = "carStatusLockDO") CarStatusLockDO carStatusLockDO, @Param(value = "carStatusLockIds") List<Long> carStatusLockIds);

    int batchInsert(List<CarStatusLockDO> carStatusLockDOS);

    int lockByWhereClauseWithLock(@Param(value = "carIds") List<Long> carIds, @Param(value = "bizType") Integer bizType, @Param(value = "bizNo") String bizNo, @Param(value = "expireTime") Date expireTime);

    int unlockByWhereClauseWithLock(@Param(value = "carIds") List<Long> carIds, @Param(value = "bizType") Integer bizType, @Param(value = "bizNo") String bizNo);

    int autoDiscardCarLock();
}