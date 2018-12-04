/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.core.ao
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2018/4/26 上午10:08
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.core.ao;

import com.chevrolet.dal.dao.domain.FactoryDO;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2018/4/26 上午10:08
 * @since V1.0
 */
public interface FactoryAO {

    /**
     * 根据id获取厂商
     * @param factoryId
     * @return
     */
    FactoryDO getFactoryById(Long factoryId);
}
