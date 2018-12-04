package com.chevrolet.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 针对客户报价／针对承运商报价类型枚举
 * Created by xingxuan on 17/12/26.
 */
@Getter
@AllArgsConstructor
public enum CustomCarrierTypeEnum {

    DEFAULT(0, "默认"),
    FOR_CARRIER(1, "针对承运商报价"),
    FOR_CUSTOMER(2, "针对客户报价"),
    ;

    private Integer code;
    private String msg;
}
