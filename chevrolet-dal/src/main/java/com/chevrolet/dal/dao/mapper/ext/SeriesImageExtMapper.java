package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.SeriesImageDO;
import com.chevrolet.dal.dao.mapper.SeriesImageMapper;

import java.util.List;
import java.util.Map;

/**
 * MyBatis Ext Mapper for SeriesImage.
 */
public interface SeriesImageExtMapper extends SeriesImageMapper {
    List<SeriesImageDO> list(Map<String, Object> param);
}