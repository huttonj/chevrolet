package com.chevrolet.dal.dao.mapper.ext;

import com.chevrolet.dal.dao.domain.BrandDO;
import com.chevrolet.dal.dao.mapper.BrandMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * MyBatis Ext Mapper for Brand.
 */
public interface BrandExtMapper extends BrandMapper {

    /**
     * 根据车规获取品牌
     *
     * @param standard
     * @return
     */
    List<BrandDO> getBrandListByStandard(Integer standard);

    /**
     * @return
     */
    List<BrandDO> getBrandListByChinaStandard();

    /**
     * 获取用户发布过的品牌ID, 按照创建时间倒序
     *
     * @param param
     * @return
     */
    List<Long> getRecentBrandIds(Map<String, Object> param);

    /**
     * 获取有效的品牌,管理员专用
     *
     * @param param
     * @return
     */
    List<BrandDO> listVaildForAdmin(Map<String, Object> param);

    /**
     * 获取有效的品牌，用户专用
     * @param param
     * @return
     */
    List<BrandDO> listVaildForUser(Map<String, Object> param);

    /**
     * 获取有车系的品牌
     *
     * @param standard
     * @return
     */
    List<BrandDO> getBrandListWithSeries(@Param("standard") Integer standard);

}