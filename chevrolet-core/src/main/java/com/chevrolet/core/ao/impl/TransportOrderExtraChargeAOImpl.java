package com.chevrolet.core.ao.impl;

import com.chevrolet.core.ao.TransportOrderExtraChargeAO;
import com.chevrolet.core.enums.ExtraChargeTypeEnum;
import com.chevrolet.core.enums.ValidStatusEnum;
import com.chevrolet.core.utils.BeanCopierUtil;
import com.chevrolet.core.utils.StreamUtils;
import com.chevrolet.dal.dao.domain.TmsOrderPriceDO;
import com.chevrolet.dal.dao.domain.TransOrderExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransOrderExtraChargeQuery;
import com.chevrolet.dal.dao.manager.TransOrderExtraChargeManager;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 运单附加费业务
 * @Author wangxiaolong <xiaolong@maihaoche.com>
 * @Date 18/1/13 下午2:16
 */
@Service
@Slf4j
public class TransportOrderExtraChargeAOImpl implements TransportOrderExtraChargeAO {
    @Autowired
    private TransOrderExtraChargeManager transOrderExtraChargeManager;

    /**
     * 获取订单附加费
     * @param transportOrderId 运单ID
     * @param chargeType 附加费类型
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    @Override
    public TransOrderExtraChargeDO getExtraChargeBy(Long transportOrderId, String chargeType, Integer customCarrierType) {
        if(StringUtils.isBlank(chargeType) || Objects.isNull(transportOrderId) || Objects.isNull(customCarrierType)){
            return null;
        }

        TransOrderExtraChargeQuery transOrderExtraChargeQuery = new TransOrderExtraChargeQuery();
        transOrderExtraChargeQuery.createCriteria()
                .andTransportOrderIdEqualTo(transportOrderId)
                .andChargeTypeEqualTo(chargeType)
                .andPayeeTypeEqualTo(customCarrierType)
                .andStatusEqualTo(ValidStatusEnum.VALID.getCode());

        List<TransOrderExtraChargeDO> transOrderExtraChargeDOS = transOrderExtraChargeManager.selectByQuery(transOrderExtraChargeQuery);
        if(CollectionUtils.isEmpty(transOrderExtraChargeDOS)){
            return null;
        }

        return transOrderExtraChargeDOS.get(0);
    }

    /**
     * 获取订单放空费
     * @param transportOrderId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    @Override
    public Integer getEmptyRunCharge(Long transportOrderId, Integer customCarrierType) {
        TransOrderExtraChargeDO transOrderExtraChargeDO = getExtraChargeBy(transportOrderId, ExtraChargeTypeEnum.EMPTY_RUN_CHARGE.getCode(),customCarrierType);
        return Optional.ofNullable(transOrderExtraChargeDO).map(TransOrderExtraChargeDO::getChargeFee).orElse(0);
    }

    /**
     * 获取订单等待费
     * @param transportOrderId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    @Override
    public Integer getWaitCharge(Long transportOrderId, Integer customCarrierType) {
        TransOrderExtraChargeDO transOrderExtraChargeDO = getExtraChargeBy(transportOrderId, ExtraChargeTypeEnum.AWAIT_CHARGE.getCode(),customCarrierType);
        return Optional.ofNullable(transOrderExtraChargeDO).map(TransOrderExtraChargeDO::getChargeFee).orElse(0);
    }

    /**
     * 为订单报价纪录填充附加费
     * 适配使用
     * @param orderPriceDO
     */
    @Override
    public void fillUpExtraChargeFor(TmsOrderPriceDO orderPriceDO) {
        Integer waitCharge = getWaitCharge(orderPriceDO.getTmsOrderId(),orderPriceDO.getPriceType());
        Integer emptyRunCharge = getEmptyRunCharge(orderPriceDO.getTmsOrderId(),orderPriceDO.getPriceType());
        orderPriceDO.setAwaitPrice(waitCharge);
        orderPriceDO.setEmptyRunPrice(emptyRunCharge);
    }
}
