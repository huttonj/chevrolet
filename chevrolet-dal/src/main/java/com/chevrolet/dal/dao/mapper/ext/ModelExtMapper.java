package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.ModelDO;
import com.chevrolet.dal.dao.mapper.ModelMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * MyBatis Ext Mapper for Model.
 */
public interface ModelExtMapper extends ModelMapper {
    List<ModelDO> getModelStandardList();

    List<ModelDO> getBrandStandardList();

    List<ModelDO> getModelByGuidePrice(Map<String, Object> param);

    List<ModelDO> getModelBySeriesAndChinaStandard(@Param("seriesId") Long seriesId, @Param("status") Integer status);

    List<ModelDO> getModelBySeriesAndStandard(Map<String, Object> param);
}