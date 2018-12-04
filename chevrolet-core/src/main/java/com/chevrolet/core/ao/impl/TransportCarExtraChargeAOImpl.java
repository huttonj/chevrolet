package com.chevrolet.core.ao.impl;

import com.chevrolet.core.ao.TransportCarExtraChargeAO;
import com.chevrolet.core.enums.CustomCarrierTypeEnum;
import com.chevrolet.core.enums.ExtraChargeTypeEnum;
import com.chevrolet.core.enums.ValidStatusEnum;
import com.chevrolet.core.utils.BeanCopierUtil;
import com.chevrolet.core.utils.StreamUtils;
import com.chevrolet.dal.dao.domain.TmsTransportCarDO;
import com.chevrolet.dal.dao.domain.TransCarExtraChargeDO;
import com.chevrolet.dal.dao.domain.query.TransCarExtraChargeQuery;
import com.chevrolet.dal.dao.manager.TransCarExtraChargeManager;
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
 * 车辆附加费业务
 * @Author wangxiaolong <xiaolong@maihaoche.com>
 * @Date 18/1/13 下午2:16
 */
@Service
@Slf4j
public class TransportCarExtraChargeAOImpl implements TransportCarExtraChargeAO {
    @Autowired
    private TransCarExtraChargeManager transCarExtraChargeManager;

    /**
     * 获取车辆附加费
     * @param transportCarId 车辆ID
     * @param chargeType 附加费类型
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    @Override
    public TransCarExtraChargeDO getExtraChargeBy(Long transportCarId, String chargeType, Integer customCarrierType) {
        if(StringUtils.isBlank(chargeType) || Objects.isNull(transportCarId)){
            return null;
        }

        TransCarExtraChargeQuery transCarExtraChargeQuery = new TransCarExtraChargeQuery();
        transCarExtraChargeQuery.createCriteria()
                .andTransportCarIdEqualTo(transportCarId)
                .andPayeeTypeEqualTo(customCarrierType)
                .andChargeTypeEqualTo(chargeType)
                .andIsValidEqualTo(ValidStatusEnum.VALID.getCode())
                .andStatusEqualTo(ValidStatusEnum.VALID.getCode());

        List<TransCarExtraChargeDO> transCarExtraChargeDOS = transCarExtraChargeManager.selectByQuery(transCarExtraChargeQuery);
        if(CollectionUtils.isEmpty(transCarExtraChargeDOS)){
            return null;
        }

        return transCarExtraChargeDOS.get(0);
    }

    /**
     * 获取车辆放空费
     * @param transportCarId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    @Override
    public Integer getEmptyRunCharge(Long transportCarId, Integer customCarrierType) {
        TransCarExtraChargeDO transCarExtraChargeDO = getExtraChargeBy(transportCarId, ExtraChargeTypeEnum.EMPTY_RUN_CHARGE.getCode(),customCarrierType);
        return Optional.ofNullable(transCarExtraChargeDO).map(TransCarExtraChargeDO::getChargeFee).orElse(0);
    }

    /**
     * 获取车辆等待费
     * @param transportCarId
     * @param customCarrierType 针对客户报价／针对承运商报价类型
     * @return
     */
    @Override
    public Integer getWaitCharge(Long transportCarId, Integer customCarrierType) {
        TransCarExtraChargeDO transCarExtraChargeDO = getExtraChargeBy(transportCarId, ExtraChargeTypeEnum.AWAIT_CHARGE.getCode(),customCarrierType);
        return Optional.ofNullable(transCarExtraChargeDO).map(TransCarExtraChargeDO::getChargeFee).orElse(0);
    }

    /**
     * 为车辆填充附加费
     * 适配使用
     * @param transportCarDO
     */
    @Override
    public void fillUpExtraChargeFor(TmsTransportCarDO transportCarDO) {
        Integer waitCharge = getWaitCharge(transportCarDO.getTransportCarId(),CustomCarrierTypeEnum.FOR_CUSTOMER.getCode());
        Integer emptyRunCharge = getEmptyRunCharge(transportCarDO.getTransportCarId(),CustomCarrierTypeEnum.FOR_CUSTOMER.getCode());
        transportCarDO.setAwaitPrice(waitCharge);
        transportCarDO.setEmptyRunPrice(emptyRunCharge);
    }
}
