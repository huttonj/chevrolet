package com.chevrolet.core.enums.lock;

public enum CarLockTypeEnum {
    INVALID(-1,"无效"),
    UNLOCK(0,"非锁定"),
    LOCK(1,"锁定");

    private Integer code;
    private String desc;

    CarLockTypeEnum(Integer code, String desc) {
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
