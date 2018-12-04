package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  验车项枚举
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/8/23 上午9:55
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CheckItemEnum {
    /**
     *
     */
    IMS_OTHER(0, "其它照片"),
    IMG_FRONT(1,"前45度角的照片"),
    IMG_LFDOORFRTPILLAR(2,"左前门A柱照片"),
    IMG_LRDOORCTRPILLAR(3,"左后门B柱照片"),
    IMG_WHEEL(4,"轮毂照片"),
    IMG_INNER(5,"内饰图片"),
    IMG_ENTRY_ODOMETER(6,"入库车辆里程表照片"),
    IMG_BEHIND(7,"后45度角的照片"),
    IMG_RFDOORFRTPILLAR(8,"右前门含A柱"),
    IMG_ENTRY_NAMEPLATE(9,"入库车辆铭牌照片"),
    IMG_CUSTOM(10,"交接单"),
    IMG_ENGINECOMPARTMENT(11,"发动机舱"),
    VIDEO(12, "绕车视频"),
    IMG_REAL_RIGHT(13, "物权确认"),
    /**
     * 下述为TMS特有的验车项
     */
    IMS_ODOMETER(14, "里程图片"),
    IMS_NAMEPLATE(15, "铭牌照片"),
    IMG_CUSTOM_TMS(16, "自定义");


    private Integer code;
    private String msg;

    CheckItemEnum(Integer code, String msg) {
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
        for (CheckItemEnum status : CheckItemEnum.values()) {
            if (status.code.equals(code)) {
                return status.msg;
            }
        }
        return null;
    }

}
