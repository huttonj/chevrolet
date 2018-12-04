package com.chevrolet.dal.dao.manager.impl;

import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.ModelDO;
import com.chevrolet.dal.dao.domain.query.ModelQuery;
import com.chevrolet.dal.dao.mapper.ext.ModelExtMapper;
import com.chevrolet.dal.dao.manager.ModelManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Manager for Model.
 */

@Component
public class ModelManagerImpl implements ModelManager{

    @Autowired
    protected ModelExtMapper modelExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ModelQuery query){
        return modelExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ModelDO record){
        return modelExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ModelDO record){
        return modelExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ModelDO> selectByQuery(ModelQuery query){
        return modelExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ModelDO> selectByQueryWithPage(ModelQuery query) {
        PageResult<ModelDO> result = new PageResult<ModelDO>();
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
    public ModelDO selectByPrimaryKey(Long id){
        return modelExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ModelDO record){
        return modelExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ModelDO> queryModelStandardList() {
        return modelExtMapper.getModelStandardList();
    }

    @Override
    public List<ModelDO> queryBrandStandardList() {
        return modelExtMapper.getBrandStandardList();
    }

    @Override
    public List<ModelDO> getModelsByGuidePrice(String guidePrice, Integer status) {
        Map<String, Object> param = new HashMap<>();
        param.put("guidePrice", guidePrice);
        param.put("status", status);
        return modelExtMapper.getModelByGuidePrice(param);
    }

    @Override
    public List<ModelDO> getModelsByGuidePriceWithPage(String guidePrice, Integer status, Integer start, Integer pageSize) {
        Map<String, Object> param = new HashMap<>();
        param.put("guidePrice", guidePrice);
        param.put("status", status);
        param.put("start", start);
        param.put("pageSize", pageSize);
        return modelExtMapper.getModelByGuidePrice(param);
    }

    @Override
    public List<ModelDO> getModelsBySeriesAndChinaStandard(Long seriesId, Integer status) {
        return modelExtMapper.getModelBySeriesAndChinaStandard(seriesId, status);
    }

    @Override
    public List<ModelDO> getModelsBySeriesAndStandard(Long seriesId, Integer standard, Integer status) {
        Map<String, Object> param = new HashMap<>();
        param.put("seriesId", seriesId);
        param.put("standard", standard);
        param.put("status", status);
        return modelExtMapper.getModelBySeriesAndStandard(param);
    }
}