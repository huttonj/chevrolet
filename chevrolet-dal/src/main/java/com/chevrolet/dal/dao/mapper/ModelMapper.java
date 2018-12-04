package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.ModelDO;
import com.chevrolet.dal.dao.domain.query.ModelQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for Model.
 */
public interface ModelMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ModelQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ModelDO record);

    /**
     * insert selective.
     */
    int insertSelective(ModelDO record);

    /**
     * select by query condition.
     */
    List<ModelDO> selectByQuery(ModelQuery query);

    /**
     * select by primary key.
     */
    ModelDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ModelDO record);
}