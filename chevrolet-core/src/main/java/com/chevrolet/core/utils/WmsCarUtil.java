package com.chevrolet.core.utils;

import com.chevrolet.api.enums.WmsCarStoreStatusEnum;
import com.chevrolet.dal.dao.domain.WmsCarDO;

import java.text.ParseException;
import java.util.Date;

/**
 * something
 *
 * @author keben
 * @date 2017/6/27
 */
public class WmsCarUtil {

    public static Integer getInventoryAge(Date entryDate, Date deliveryDate, Integer storeStatus) {
        if (entryDate == null) {
            return 0;
        }

        Date startDate = entryDate;
        Date endDate = new Date();
        if (WmsCarStoreStatusEnum.DEPARTED.getCode().equals(storeStatus)) {
            if (deliveryDate != null) {
                endDate = deliveryDate;
            }
        }
        try {
            Integer inventoryAge = DateUtil.daysBetween(startDate, endDate) + 1;
            return inventoryAge;
        } catch (ParseException e) {
            return 0;
        }
    }

    public static Integer getInventoryAge(WmsCarDO carInfoDO) {
        if (carInfoDO == null) {
            return 0;
        } else {
            return getInventoryAge(carInfoDO.getEntryDate(), carInfoDO.getDeliveryDate(), carInfoDO.getStoreStatus());
        }
    }
}
