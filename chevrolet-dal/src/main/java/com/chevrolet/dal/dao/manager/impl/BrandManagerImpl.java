package com.chevrolet.dal.dao.manager.impl;

import com.chevrolet.api.dto.request.BrandListRequest;
import com.google.common.collect.Maps;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.BrandDO;
import com.chevrolet.dal.dao.domain.query.BrandQuery;
import com.chevrolet.dal.dao.mapper.ext.BrandExtMapper;
import com.chevrolet.dal.dao.manager.BrandManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Manager for Brand.
 */

@Component
public class BrandManagerImpl implements BrandManager{

    @Autowired
    protected BrandExtMapper brandExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(BrandQuery query){
        return brandExtMapper.countByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(BrandDO record){
        return brandExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(BrandDO record){
        return brandExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<BrandDO> selectByQuery(BrandQuery query){
        return brandExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<BrandDO> selectByQueryWithPage(BrandQuery query) {
        PageResult<BrandDO> result = new PageResult<BrandDO>();
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
    public BrandDO selectByPrimaryKey(Long id){
        return brandExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(BrandDO record){
        return brandExtMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<BrandDO> getBrandListByStandard(Integer standard) {
        return brandExtMapper.getBrandListByStandard(standard);
    }

    @Override
    public List<BrandDO> getBrandListByChinaStandard() {
        return brandExtMapper.getBrandListByChinaStandard();
    }

    @Override
    public List<Long> getRecentBrandIds(Long partnerId, Integer standard) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("partnerId", partnerId);
        param.put("standard", standard);
        return brandExtMapper.getRecentBrandIds(param);
    }

    @Override
    public List<BrandDO> getVaildBrandListForAdmin(BrandListRequest brandListForm) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("partnerId", brandListForm.getPartnerId());
        param.put("status", brandListForm.getStatus());
        param.put("creator", brandListForm.getUserId());
        return brandExtMapper.listVaildForAdmin(param);
    }

    @Override
    public List<BrandDO> getVaildBrandListForUser(Long partnerId, Integer status, Long userId, List<Long> brandIds) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("partnerId", partnerId);
        param.put("status", status);
        param.put("userId", userId);
        if (brandIds != null && brandIds.size() > 0) {
            param.put("brandIds", brandIds);
        }
        return brandExtMapper.listVaildForUser(param);
    }

    @Override
    public List<BrandDO> getBrandListWithSeries(Integer standard) {
        return brandExtMapper.getBrandListWithSeries(standard);
    }

}