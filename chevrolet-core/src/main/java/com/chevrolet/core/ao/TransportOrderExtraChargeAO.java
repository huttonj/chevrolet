package com.chevrolet.core.ao;


import com.chevrolet.dal.dao.domain.TmsOrderPriceDO;
import com.chevrolet.dal.dao.domain.TransOrderExtraChargeDO;

/**
 * 运单附加费业务
 * @Author wangxiaolong <xiaolong@maihaoche.com>
 * @Date 18/1/13 下午2:14
 */
public interface TransportOrderExtraChargeAO {
    /**
     * 获取订单附加费
     * @param transportOrderId 运单ID
     * @param chargeType 附加费类型
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    TransOrderExtraChargeDO getExtraChargeBy(Long transportOrderId, String chargeType, Integer customCarrierType);
    /**
     * 获取订单放空费
     * @param transportCarId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    Integer getEmptyRunCharge(Long transportCarId, Integer customCarrierType);

    /**
     * 获取订单等待费
     * @param transportCarId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    Integer getWaitCharge(Long transportCarId, Integer customCarrierType);

    /**
     * 为订单报价纪录填充附加费
     * 适配使用
     * @param orderPriceDO
     */
    void fillUpExtraChargeFor(TmsOrderPriceDO orderPriceDO);
}
