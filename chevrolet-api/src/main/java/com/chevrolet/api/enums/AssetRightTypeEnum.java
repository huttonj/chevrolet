package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 * 物权归属类型
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/9/4 下午3:21
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum AssetRightTypeEnum {

    DEFAULT(0,"默认"),
    PERSONAL(1, "个人"),
    ENTERPRISE(2, "企业");



    private Integer code;
    private String desc;

    AssetRightTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetRightTypeEnum getAssetRightType(Integer assetRightType){
        for (AssetRightTypeEnum assetRightTypeEnum : AssetRightTypeEnum.values()) {
            if(assetRightTypeEnum.getCode().equals(assetRightType)){
                return assetRightTypeEnum;
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
