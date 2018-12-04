package com.chevrolet.core.ao;

import com.chevrolet.api.dto.request.BrandListRequest;
import com.chevrolet.dal.dao.domain.BrandDO;

import java.util.List;

/**
 * Created by suclogger on 2017/5/16.
 */
public interface BrandAO {

    List<BrandDO> getAllBrand();

    List<BrandDO> getByIds(List<Long> brandIds);

    /**
     * 根据车规获取品牌
     *
     * @param standard
     * @return
     */
    List<BrandDO> getBrandListByStandard(Integer standard);

    /**
     * 根据品牌ID获取品牌名字
     *
     * @param brandId
     * @return
     */
    String getBrandNameById(Long brandId);

    /**
     * 获取有车源品牌
     * @return
     */
    List<BrandDO> getAllBrandWithCars();

    /**
     * 获取最近发布过的5个品牌
     *
     * @param partnerId
     * @param standard
     * @return
     */
    List<BrandDO> getRecentBrandList(Long partnerId, Integer standard);

    /**
     * 根据id集合查询品牌集合
     *
     * @param ids
     * @return
     */
    List<BrandDO> findBrandsByIdsOrderLetter(List<Long> ids);

    /**
     * 获取有效的品牌,管理员专用
     * @param brandListForm
     * @return
     */
    List<BrandDO> getVaildBrandListForAdmin(BrandListRequest brandListForm);

    /**
     * 获取有效的品牌,普通用户专用
     * @param partnerId
     * @param status
     * @param userId
     * @param brandIds
     * @return
     */
    List<BrandDO> getVaildBrandListForUser(Long partnerId, Integer status, Long userId, List<Long> brandIds);

    /**
     * @param brandNames
     * @return
     */
    List<BrandDO> getBrandByNames(List<String> brandNames);

    /**
     * @param brandIds
     * @return
     */
    List<BrandDO> getBrandByIds(List<Long> brandIds);

    /**
     * 获取有车系的品牌
     *
     * @param standard
     * @return
     */
    List<BrandDO> getBrandListWithSeries(Integer standard);

    /**
     * 根据品牌主键brandId获取品牌信息
     * @param brandId
     * @return
     */
    BrandDO getBrandById(Long brandId);

}
