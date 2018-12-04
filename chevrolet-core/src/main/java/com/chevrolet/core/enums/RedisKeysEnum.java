package com.chevrolet.core.enums;

/**
 * Created by maihe on 2017/5/25.
 */
public enum RedisKeysEnum {
    /**
     * 车辆中心
     */
    CAR_CENTER_carInitDaasData_SWITCH("CAR_CENTER:carInitDaasData:SWITCH"),
    CAR_CENTER_carInitDaasData_LOCK("CAR_CENTER:carInitDaasData:LOCK"),
    CAR_CENTER_carOnlinePriceTask_exec_LIST("CAR_CENTER:carOnlinePriceTask_exec:LIST"),
    CAR_CENTER_carOnlinePriceTask_pageNum_RECORD("CAR_CENTER:carOnlinePriceTask_pageNum:"),
    CAR_CENTER_carSalesTask_exec_LIST("CAR_CENTER:carSalesTask_exec:LIST");
    String value;

    RedisKeysEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
