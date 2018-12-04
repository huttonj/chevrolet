package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/9/4 下午3:25
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CarLoanOrderTypeEnum {

    ORDER(1,"订单宝"),
    CAR(2,"融租宝");

    private Integer code;
    private String desc;

    CarLoanOrderTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
