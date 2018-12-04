package com.chevrolet.dal.dao.mapper;

import com.chevrolet.dal.dao.domain.TmsTransportCarDO;
import com.chevrolet.dal.dao.domain.query.TmsTransportCarQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for TmsTransportCar.
 */
public interface TmsTransportCarMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(TmsTransportCarQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TmsTransportCarDO record);

    /**
     * insert selective.
     */
    int insertSelective(TmsTransportCarDO record);

    /**
     * select by query condition.
     */
    List<TmsTransportCarDO> selectByQuery(TmsTransportCarQuery query);

    /**
     * select by primary key.
     */
    TmsTransportCarDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TmsTransportCarDO record);
}