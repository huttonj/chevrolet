package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  物权变更单状态枚举
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/9/4 下午3:20
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum AssetRightChgStatusEnum {
    NEED_SIGN(1, "待签约"),
    NEED_CONFIRM(2, "待对方确认"),
    FINISHED(3,"已完成"),
    CANCELED(4,"已取消"),
    DISCARD(5,"已作废(对方超时未确认)");

    private Integer code;
    private String desc;

    AssetRightChgStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetRightChgStatusEnum getRecordStatusEnum(Integer status){
        for (AssetRightChgStatusEnum assetRightChgStatusEnum : AssetRightChgStatusEnum.values()) {
            if(assetRightChgStatusEnum.getCode().equals(status)){
                return assetRightChgStatusEnum;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
