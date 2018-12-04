package com.chevrolet.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 附加费费用类型
 *
 * @Author duanzhang <duanzhang@maihaoche.com>
 * @Date 2017/12/26 下午4:29
 */
@AllArgsConstructor
@Getter
public enum ExtraChargeTypeEnum {
    EMPTY_RUN_CHARGE("EMPTY_RUN_CHARGE","放空费"),
    AWAIT_CHARGE("AWAIT_CHARGE", "等待费"),
    ;

    private String code;
    private String name;
}
