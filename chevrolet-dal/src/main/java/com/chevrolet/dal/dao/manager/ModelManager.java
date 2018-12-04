package com.chevrolet.dal.dao.manager;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.ModelDO;
import com.chevrolet.dal.dao.domain.query.ModelQuery;

import java.util.List;


/**
 * Manager for Model.
 */
public interface ModelManager {
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
    long insertSelective(ModelDO record);

    /**
     * select by query condition.
     */
    List<ModelDO> selectByQuery(ModelQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ModelDO> selectByQueryWithPage(ModelQuery query);

    /**
     * select by primary key.
     */
    ModelDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ModelDO record);

    /**
     * 查询车系对应的车规list
     *
     * @return
     */
    List<ModelDO> queryModelStandardList();

    List<ModelDO> queryBrandStandardList();

    /**
     * 根据指导价获取车型(仅限国产和中规)
     *
     * @param guidePrice
     * @return
     */
    List<ModelDO> getModelsByGuidePrice(String guidePrice, Integer status);

    List<ModelDO> getModelsBySeriesAndChinaStandard(Long seriesId, Integer status);

    List<ModelDO> getModelsBySeriesAndStandard(Long seriesId, Integer standard, Integer status);

    List<ModelDO> getModelsByGuidePriceWithPage(String guidePrice, Integer status, Integer start, Integer pageSize);
}