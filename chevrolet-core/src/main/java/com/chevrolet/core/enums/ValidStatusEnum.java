package com.chevrolet.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 有效状态枚举
 * Created by xiaolong
 */
@AllArgsConstructor
public enum ValidStatusEnum {

    INVALID(0, "无效"),
    VALID(1, "有效"),
    ;

    @Getter
    private Integer code;
    @Getter
    private String desc;

    /**
     * 将code包装成枚举类型
     * @param code
     * @return
     */
    public static ValidStatusEnum valueOf(Integer code){
        for (ValidStatusEnum statusEnum: ValidStatusEnum.values()) {
            if(statusEnum.getCode().equals(code)){
                return statusEnum;
            }
        }
        return null;
    }

    /**
     * 判断是否包含
     * @param code
     * @return
     */
    public static boolean contain(Integer code){
        for (ValidStatusEnum statusEnum: ValidStatusEnum.values()) {
            if(statusEnum.getCode().equals(code)){
                return true;
            }
        }
        return false;
    }
}
