package com.chevrolet.dal.dao.manager;

import com.chevrolet.api.dto.request.BrandListRequest;
import com.subaru.common.query.PageResult;
import com.chevrolet.dal.dao.domain.BrandDO;
import com.chevrolet.dal.dao.domain.query.BrandQuery;

import java.util.List;


/**
 * Manager for Brand.
 */
public interface BrandManager {
    /**
     * query count by query condition.
     */
    int countByQuery(BrandQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(BrandDO record);

    /**
     * insert selective.
     */
    long insertSelective(BrandDO record);

    /**
     * select by query condition.
     */
    List<BrandDO> selectByQuery(BrandQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<BrandDO> selectByQueryWithPage(BrandQuery query);

    /**
     * select by primary key.
     */
    BrandDO selectByPrimaryKey(Long id);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(BrandDO record);

    /**
     * select by standard.
     */
    List<BrandDO> getBrandListByStandard(Integer standard);

    List<BrandDO> getBrandListByChinaStandard();

    List<Long> getRecentBrandIds(Long partnerId, Integer standard);

    List<BrandDO> getVaildBrandListForAdmin(BrandListRequest brandListForm);

    List<BrandDO> getVaildBrandListForUser(Long partnerId, Integer status, Long userId, List<Long> brandIds);

    List<BrandDO> getBrandListWithSeries(Integer standard);
}