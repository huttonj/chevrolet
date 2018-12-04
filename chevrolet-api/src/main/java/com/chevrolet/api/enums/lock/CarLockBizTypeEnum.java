package com.chevrolet.api.enums.lock;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  车辆锁业务类型枚举
 * @Package com.chevrolet.api.enums.lock
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/9/4 下午3:18
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CarLockBizTypeEnum {
    INVALID(-1,"无效"),
    CAR_LOA_PICK_UP(1,"订单宝提车"),
    LOAN_CAR_PICK_UP(2,"库融宝提车"),
    CAPITAL_PICK_UP(6,"资方提车"),
    WTO(3,"秒车库"),
    TMS(4,"物流"),
    WMS(5,"仓储"),
    MJB(7,"卖家宝"),
    WMS_PICK_UP(501,"仓储-提车申请");

    private Integer code;
    private String desc;

    CarLockBizTypeEnum(Integer code, String desc) {
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
