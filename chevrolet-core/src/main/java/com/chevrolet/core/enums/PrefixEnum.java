package com.chevrolet.core.enums;

/**
 * Created by maihe on 2017/5/25.
 */
public enum PrefixEnum {

    cc_brandName_by_id("cc_brandName_by_id:"),
    cc_seriesName_by_id("cc_seriesName_by_id:"),
    cc_modelName_by_id("cc_modelName_by_id:"),
    cc_guidePrice_by_id("cc_guidePrice_by_id:"),

    /**
     * 车辆中心
     */
    CAR_CENTER_BRAND("CAR_CENTER_brand"),
    CAR_CENTER_MODEL("CAR_CENTER_model"),
    CAR_CENTER_SERIES("CAR_CENTER"),


    /**
     * car toolbox
     */
    cc_brand_list("cc_brand_list"),
    cc_series_by_brand("cc_series_by_brand:"),
    cc_model_by_series("cc_model_by_series:"),
    cc_brand_by_standard("cc_brand_by_standard:"),


    ;

    String value;

    private PrefixEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public String getKey(Integer sufix) {
        return this.value + String.valueOf(sufix);
    }

    public String getKey(Long sufix) {
        return this.value + String.valueOf(sufix);
    }
}
