package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.DaasRedoLogDO;
import com.chevrolet.dal.dao.domain.query.DaasRedoLogQuery;
import com.chevrolet.dal.dao.mapper.ext.DaasRedoLogExtMapper;
import com.chevrolet.dal.dao.manager.DaasRedoLogManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for DaasRedoLog.
 */

@Component
public class DaasRedoLogManagerImpl implements DaasRedoLogManager{
    
    @Autowired
    protected DaasRedoLogExtMapper daasRedoLogExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(DaasRedoLogQuery query){
        return daasRedoLogExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(DaasRedoLogDO record){
        return daasRedoLogExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(DaasRedoLogDO record){
        return daasRedoLogExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<DaasRedoLogDO> selectByQuery(DaasRedoLogQuery query){
        return daasRedoLogExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<DaasRedoLogDO> selectByQueryWithPage(DaasRedoLogQuery query) {
        PageResult<DaasRedoLogDO> result = new PageResult<DaasRedoLogDO>();
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
    public DaasRedoLogDO selectByPrimaryKey(Long id){
        return daasRedoLogExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(DaasRedoLogDO record){
        return daasRedoLogExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<DaasRedoLogDO> selectForUpdate(){
        return daasRedoLogExtMapper.selectForUpdate();
    }
}