package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.DaasRedoLogDO;
import com.chevrolet.dal.dao.mapper.DaasRedoLogMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * MyBatis Ext Mapper for DaasRedoLog.
 */
public interface DaasRedoLogExtMapper extends DaasRedoLogMapper {
    List<DaasRedoLogDO> selectForUpdate();
}