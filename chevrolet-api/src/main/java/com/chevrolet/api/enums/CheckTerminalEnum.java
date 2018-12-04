package com.chevrolet.api.enums;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *  验车业务来源枚举
 * @Package com.chevrolet.api.enums
 * @author: 文远（wenyuan@maihaoche.com）
 * @date: 2018/8/23 上午9:55
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public enum CheckTerminalEnum {
    /**
     *0 未知（默认）；1 物流验车小程序；2 物流承运商APP；3 物流PC端；4；物流司机APP；20 钉钉仓储管理；11 PDA仓储管理
     */
    UNKNOWN(0,"未知"),
    TMS_APPLET(1,"物流验车小程序"),
    TMS_APP_CARRIER(2,"物流承运商APP"),
    TMS_PC(3,"物流PC端"),
    TMS_APP_DRIVER(4,"物流司机APP"),
    WMS_DINGTALK(20,"钉钉仓储管理"),
    WMS_PDA(21,"PDA仓储管理");

    private Integer code;
    private String msg;

    CheckTerminalEnum(Integer code, String msg) {
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
        for (CheckTerminalEnum status : CheckTerminalEnum.values()) {
            if (status.code.equals(code)) {
                return status.msg;
            }
        }
        return null;
    }

}
