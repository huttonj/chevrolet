package com.chevrolet.api.enums;

/**
 * Created by zhouxiaoliu on 16/9/24.
 */
public enum WarehouseStatusEnum {
    AVAILABLE(1, "正常"),
    /**
     * 2018 9月后的版本仓库,实际已不存在该状态,但是对外暴露仍沿用该状态,外部api仍按原需求继续使用
     * 此状态代表所有仓库状态id大于3的列表集合
     */
    SUSPEND(2, "暂停"),
    CLOSED(3, "关闭");


    private Integer code;
    private String msg;

    private WarehouseStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return msg;
    }

    /**
     * 该方法在记录仓库基础信息日志时有用到,如果修改了请同时修改日志DTO  com.mhc.mclaren.dto.warehouse.WarehouseBasicLogDTO
     * 注意:因为仓库状态已经可配,所以实际状态已经入库,不局限于这三种,只是管尚目前对外暴露继续沿用上述三种,除1,3外其他全部状态均为暂停,获取真实状态请走api调用
     *
     */
    public static String getMsgByCode(Integer code){
        for(WarehouseStatusEnum status : WarehouseStatusEnum.values()){
            if(status.code.equals(code)){
                if(code>3){
                    return SUSPEND.msg;
                }
                return status.msg;
            }
        }
        return null;
    }
}
