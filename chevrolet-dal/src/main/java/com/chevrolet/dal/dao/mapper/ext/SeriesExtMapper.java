package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.mapper.SeriesMapper;
import org.apache.ibatis.annotations.Param;
import com.chevrolet.dal.dao.domain.SeriesDO;

import java.util.List;
import java.util.Map;

/**
 * MyBatis Ext Mapper for Series.
 */
public interface SeriesExtMapper extends SeriesMapper {


    /**
     * 查询中规或者国产车的车系
     * @param brandId
     * @param status
     * @return
     */
    List<SeriesDO> getSeriesListByBrandAndChinaStandard(@Param("brandId") Long brandId, @Param("status") Integer status);

    /**
     * 根据 车规、品牌ID、状态 获取车系
     * @param param
     * @return
     */
    List<SeriesDO> getSeriesListByBrandAndStandard(Map<String, Object> param);

    /**
     * 获取有效的车系
     * @param param
     * @return
     */
    List<SeriesDO> listVaild(Map<String, Object> param);

    List<SeriesDO> listVaildForAdmin(Map<String, Object> param);

}