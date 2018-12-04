package com.chevrolet.core.ao;

import com.chevrolet.dal.dao.domain.VinWhitelistDO;

/**
 * Created by suclogger on 2017/12/5
 * Modified by
 * Description:
 */
public interface VinWhitelistAO {

    boolean addWhitelistVIN(VinWhitelistDO vinWhitelistDO);

    boolean isExistInWhitelist(String vin);

}
