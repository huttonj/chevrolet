/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.core.ao.impl
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2018/4/27 下午3:06
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.core.ao.impl;

import com.chevrolet.core.ao.SeriesImageAO;
import com.chevrolet.dal.dao.domain.SeriesImageDO;
import com.chevrolet.dal.dao.domain.query.SeriesImageQuery;
import com.chevrolet.dal.dao.manager.SeriesImageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2018/4/27 下午3:06
 * @since V1.0
 */
@Component
public class SeriesImageAOImpl implements SeriesImageAO {

    @Autowired
    private SeriesImageManager seriesImageManager;

    @Override
    public List<SeriesImageDO> getSeriesImageBySeriesIdAndType(Long seriesId, Integer type) {
        SeriesImageQuery query = new SeriesImageQuery();
        query.or().andSeriesIdEqualTo(seriesId).andTypeEqualTo(type).andStatusEqualTo(0);
        return seriesImageManager.selectByQuery(query);
    }
}
