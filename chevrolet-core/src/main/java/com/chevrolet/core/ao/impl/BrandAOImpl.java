package com.chevrolet.core.ao.impl;

import com.chevrolet.api.dto.request.BrandListRequest;
import com.chevrolet.api.enums.CarStandardEnum;
import com.chevrolet.core.ao.BrandAO;
import com.chevrolet.core.enums.PrefixEnum;
import com.chevrolet.core.enums.StandardEnum;
import com.chevrolet.core.wrapper.RedisWrapper;
import com.chevrolet.dal.dao.domain.BrandDO;
import com.chevrolet.dal.dao.domain.query.BrandQuery;
import com.chevrolet.dal.dao.manager.BrandManager;
import com.google.common.collect.Sets;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by suclogger on 2017/5/16.
 */
@Component
public class BrandAOImpl implements BrandAO {

    @Autowired
    private BrandManager brandManager;

    @Autowired
    private RedisWrapper redisManager;

    @Override
    public List<BrandDO> getAllBrand() {
        BrandQuery brandQuery  = new BrandQuery();
        brandQuery.setOrderByClause("brand_letter asc,rank desc");
        return brandManager.selectByQuery(brandQuery);
    }

    @Override
    public List<BrandDO> getByIds(List<Long> brandIds) {
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.or().andBrandIdIn(brandIds);
        brandQuery.setOrderByClause("brand_letter asc,rank desc");
        return brandManager.selectByQuery(brandQuery);
    }

    @Override
    public List<BrandDO> getBrandListByStandard(Integer standard) {
        //中规车 查询 中规或国产
        if (standard.intValue() == CarStandardEnum.China.value()) {
            return brandManager.getBrandListByChinaStandard();
        } else {
            return brandManager.getBrandListByStandard(StandardEnum.getStandard(standard));
        }
    }

    @Override
    public String getBrandNameById(Long brandId) {
        if(brandId == null || brandId < 0) {
            return null;
        }
        String brandName = redisManager.getString(PrefixEnum.cc_brandName_by_id.getKey(brandId));
        if(!StringUtils.isEmpty(brandName)) {
            return brandName;
        }
        brandName = brandManager.selectByPrimaryKey(brandId).getBrandName();
        redisManager.putAsync(PrefixEnum.cc_brandName_by_id.getKey(brandId) , brandName, 36000);
        return brandName;
    }

    @Override
    public List<BrandDO> getAllBrandWithCars() {
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.or().andCarsNumberGreaterThan(0l);
        brandQuery.setOrderByClause("brand_letter asc,rank desc");
        List<BrandDO> brandDOs = brandManager.selectByQuery(brandQuery);
        return brandDOs;
    }

    @Override
    public List<BrandDO> getRecentBrandList(Long partnerId, Integer standard) {
        List<Long> brandIdList = brandManager.getRecentBrandIds(partnerId, standard);

        if (brandIdList != null && brandIdList.size() > 0) {
            Set<Long> brandIdSet = Sets.newHashSet();
            for (Long brandId : brandIdList) {
                brandIdSet.add(brandId);
                if (brandIdSet.size() >= 5) {
                    break;
                }
            }

            if (brandIdSet != null && brandIdSet.size() > 0) {
                List<Long> idsList = new ArrayList<>(brandIdSet);
                return this.findBrandsByIdsOrderLetter(idsList);
            }
        }

        return null;
    }


    @Override
    public List<BrandDO> findBrandsByIdsOrderLetter(List<Long> ids) {
        BrandQuery query = new BrandQuery();
        query.or().andBrandIdIn(ids);
        query.setOrderByClause("brand_letter asc,rank desc");
        return brandManager.selectByQuery(query);
    }

    @Override
    public List<BrandDO> getVaildBrandListForAdmin(BrandListRequest brandListForm) {
        return brandManager.getVaildBrandListForAdmin(brandListForm);
    }

    @Override
    public List<BrandDO> getVaildBrandListForUser(Long partnerId, Integer status, Long userId, List<Long> brandIds) {
        return brandManager.getVaildBrandListForUser(partnerId, status, userId, brandIds);
    }

    @Override
    public List<BrandDO> getBrandByNames(List<String> brandNames) {
        BrandQuery query = new BrandQuery();
        query.or().andBrandNameIn(brandNames);
        return brandManager.selectByQuery(query);
    }

    @Override
    public List<BrandDO> getBrandByIds(List<Long> brandIds) {
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.or().andBrandIdIn(brandIds);
        return brandManager.selectByQuery(brandQuery);
    }

    @Override
    public List<BrandDO> getBrandListWithSeries(Integer standard) {
        return brandManager.getBrandListWithSeries(StandardEnum.getStandard(standard));
    }

    @Override
    public BrandDO getBrandById(Long brandId) {
        return brandManager.selectByPrimaryKey(brandId);
    }

}
