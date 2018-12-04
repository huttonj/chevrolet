package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  物权归属初始默认状态
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/9/4 下午3:20
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum AssetRightDefaultEnum {

    DEFAULT_ASSET_RIGHT(-2L, "初始物权人");

    private Long code;
    private String desc;

    AssetRightDefaultEnum(Long code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Long getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
