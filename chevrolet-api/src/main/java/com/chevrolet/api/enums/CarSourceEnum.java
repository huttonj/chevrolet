package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  车辆来源枚举
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/9/4 下午3:25
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CarSourceEnum {


    FINANCE_COMMON(199, "金融产品"),
    /**
     *
     * from FinancialProductTypeEnum
     ORDER_LOAN(Integer.valueOf(0), "订车宝-订单宝"),
     RECEIVE_CAR_LOAN(Integer.valueOf(1), "订车宝-接车宝"),
     CAR_MORTGAGE_LOAN(Integer.valueOf(2), "融租宝-库融宝"),
     CAR_SHOW_LOAN(Integer.valueOf(3), "融租宝-展车宝")
     */
    FINANCE_DDD(100, "订单宝"),
    FINANCE_JCB(101, "接车宝"),
    FINANCE_KRB(102, "库融宝"),
    FINANCE_ZCB(103, "展车宝"),

    TMS_COMMON(200, "TMS"),

    WMS_COMMON(300, "WMS"),

    ;

    private Integer code;
    private String msg;

    CarSourceEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return msg;
    }

    public static String getMsgByCode(Integer code) {
        for (CarSourceEnum status : CarSourceEnum.values()) {
            if (status.code.equals(code)) {
                return status.msg;
            }
        }
        return null;
    }

}
