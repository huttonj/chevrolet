package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  验车业务来源枚举
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/8/23 上午9:55
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CheckBizSourceEnum {
    /**
     *
     */
    WMS(1,"WMS"),
    TMS(2,"TMS");

    private Integer code;
    private String msg;

    CheckBizSourceEnum(Integer code, String msg) {
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
        for (CheckBizSourceEnum status : CheckBizSourceEnum.values()) {
            if (status.code.equals(code)) {
                return status.msg;
            }
        }
        return null;
    }

}
