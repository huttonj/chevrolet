package com.chevrolet.core.ao.impl;

import com.chevrolet.core.ao.VinWhitelistAO;
import com.chevrolet.dal.dao.domain.VinWhitelistDO;
import com.chevrolet.dal.dao.domain.query.VinWhitelistQuery;
import com.chevrolet.dal.dao.manager.VinWhitelistManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

/**
 * Created by suclogger on 2017/12/5
 * Modified by
 * Description:
 */
@Component
public class VinWhitelistAOImpl implements VinWhitelistAO {

    private VinWhitelistManager vinWhitelistManager;

    @Autowired
    public void setVinWhitelistManager(VinWhitelistManager vinWhitelistManager) {
        this.vinWhitelistManager = vinWhitelistManager;
    }

    @Override
    public boolean addWhitelistVIN(VinWhitelistDO vinWhitelistDO) {
        return vinWhitelistManager.insertSelective(vinWhitelistDO) > 0;
    }

    @Override
    public boolean isExistInWhitelist(String vin) {
        VinWhitelistQuery vinWhitelistQuery = new VinWhitelistQuery();
        vinWhitelistQuery.or().andVinEqualTo(vin);
        return !CollectionUtils.isEmpty(vinWhitelistManager.selectByQuery(vinWhitelistQuery));
    }
}
