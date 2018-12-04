package com.chevrolet.dal.dao.manager;

import com.chevrolet.dal.dao.domain.CarStatusLockDO;
import com.chevrolet.dal.dao.domain.query.CarStatusLockQuery;
import com.subaru.common.query.PageResult;

import java.util.Date;
import java.util.List;


/**
 * Manager for CarStatusLock.
 */
public interface CarStatusLockManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CarStatusLockQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CarStatusLockDO record);

    /**
     * insert selective.
     */
    long insertSelective(CarStatusLockDO record);

    /**
     * select by query condition.
     */
    List<CarStatusLockDO> selectByQuery(CarStatusLockQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CarStatusLockDO> selectByQueryWithPage(CarStatusLockQuery query);

    /**
     * select by primary key.
     */
    CarStatusLockDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CarStatusLockDO record);

    int batchUpdateByCarLockId(CarStatusLockDO carStatusLockDO, List<Long> carStatusLockIds);

    int lockByWhereClauseWithLock(List<Long> carIds, Integer bizType, String bizNo,Date expireTime);

    int unlockByWhereClauseWithLock(List<Long> carIds, Integer bizType, String bizNo);

    int batchInsert(List<CarStatusLockDO> carStatusLockDOS);

    int autoDiscardCarLock();
}
