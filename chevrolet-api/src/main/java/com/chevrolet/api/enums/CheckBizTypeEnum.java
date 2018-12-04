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
public enum CheckBizTypeEnum {
    /**
     *1 运单验车; 2 提单验车；3 无物流验车；20 入库验车；21 出库验车；22 盘库验车；
     */
    YDYC(1,"运单验车"),
    TDYC(2,"提单验车"),
    WWLYC(3,"无物流验车"),
    RKYC(20,"入库验车"),
    CKYC(21,"出库验车"),
    PKYC(22,"盘库验车");

    private Integer code;
    private String msg;

    CheckBizTypeEnum(Integer code, String msg) {
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
        for (CheckBizTypeEnum status : CheckBizTypeEnum.values()) {
            if (status.code.equals(code)) {
                return status.msg;
            }
        }
        return null;
    }

}
