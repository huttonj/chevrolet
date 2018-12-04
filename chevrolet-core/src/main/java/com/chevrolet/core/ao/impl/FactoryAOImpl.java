/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.core.ao.impl
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2018/4/26 上午10:10
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.core.ao.impl;

import com.chevrolet.core.ao.FactoryAO;
import com.chevrolet.dal.dao.domain.FactoryDO;
import com.chevrolet.dal.dao.manager.FactoryManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2018/4/26 上午10:10
 * @since V1.0
 */
@Slf4j
@Component
public class FactoryAOImpl implements FactoryAO {

    @Autowired
    private FactoryManager factoryManager;

    @Override
    public FactoryDO getFactoryById(Long factoryId) {
        return factoryManager.selectByPrimaryKey(factoryId);
    }
}
