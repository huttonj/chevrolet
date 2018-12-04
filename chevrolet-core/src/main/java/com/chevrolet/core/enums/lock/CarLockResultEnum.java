package com.chevrolet.core.enums.lock;

/**
 * @author maihe
 */
public enum CarLockResultEnum {
    SUCCESS(1,"解锁/加锁 成功"),
    FAILED(2,"解锁/加锁 失败"),
    EXISTED(3,"锁已存在"),
    NOT_EXISTED(4,"锁不存在");


    private Integer code;
    private String desc;

    CarLockResultEnum(Integer code, String desc) {
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
