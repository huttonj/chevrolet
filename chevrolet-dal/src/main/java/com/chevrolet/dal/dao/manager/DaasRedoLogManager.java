package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.DaasRedoLogDO;
import com.chevrolet.dal.dao.domain.query.DaasRedoLogQuery;

import java.util.List;


/**
 * Manager for DaasRedoLog.
 */
public interface DaasRedoLogManager {
    /**
     * query count by query condition.
     */
    int countByQuery(DaasRedoLogQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(DaasRedoLogDO record);

    /**
     * insert selective.
     */
    long insertSelective(DaasRedoLogDO record);

    /**
     * select by query condition.
     */
    List<DaasRedoLogDO> selectByQuery(DaasRedoLogQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<DaasRedoLogDO> selectByQueryWithPage(DaasRedoLogQuery query);

    /**
     * select by primary key.
     */
    DaasRedoLogDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(DaasRedoLogDO record);

    List<DaasRedoLogDO> selectForUpdate();
}