package com.chevrolet.api.enums.lock;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  车辆锁状态枚举
 * @Package com.chevrolet.api.enums.lock
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/9/4 下午3:19
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CarLockExtStatusEnum {

    OPEN(1,"打开"),
    CLOSED(0,"关闭"),
    ;
    private Integer code;
    private String desc;

    CarLockExtStatusEnum(Integer code, String desc) {
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
