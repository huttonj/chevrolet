package com.chevrolet.core.ao;

import com.chevrolet.dal.dao.domain.TmsTransportCarDO;
import com.chevrolet.dal.dao.domain.TransCarExtraChargeDO;

import java.util.List;

/**
 * 车辆附加费业务
 * @Author wangxiaolong <xiaolong@maihaoche.com>
 * @Date 18/1/13 下午2:14
 */
public interface TransportCarExtraChargeAO {

    /**
     * 获取车辆附加费
     * @param transportCarId 车辆ID
     * @param chargeType 附加费类型
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    TransCarExtraChargeDO getExtraChargeBy(Long transportCarId, String chargeType, Integer customCarrierType);

    /**
     * 获取车辆放空费
     * @param transportCarId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    Integer getEmptyRunCharge(Long transportCarId, Integer customCarrierType);

    /**
     * 获取车辆等待费
     * @param transportCarId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    Integer getWaitCharge(Long transportCarId, Integer customCarrierType);

    /**
     * 为车辆填充附加费
     * 适配使用
     * @param transportCarDO
     */
    void fillUpExtraChargeFor(TmsTransportCarDO transportCarDO);
}
