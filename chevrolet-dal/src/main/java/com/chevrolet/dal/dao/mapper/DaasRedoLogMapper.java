package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.DaasRedoLogDO;
import com.chevrolet.dal.dao.domain.query.DaasRedoLogQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for DaasRedoLog.
 */
public interface DaasRedoLogMapper {
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
    int insertSelective(DaasRedoLogDO record);

    /**
     * select by query condition.
     */
    List<DaasRedoLogDO> selectByQuery(DaasRedoLogQuery query);

    /**
     * select by primary key.
     */
    DaasRedoLogDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(DaasRedoLogDO record);
}