package com.chevrolet.core.enums;

/**
 * Created by miaodao on 18/6/04.
 * 同时
 */
public enum NoticeStatusEnum {
    //入库通知单状态:0,待审核，105待完善车架号，1待入库，2部分入库，3完成入库，4作废
    TO_REVIEW(0, "待审核"),
    //实际状态为"待完善车架号"，展示为"待入库"。车架号完善之前不出现在待入库列表中。
    //该状态的意思是审核通过了，但是车架号还未完善。
    TO_COMPL_CU(105, "待入库"),
    WAIT_ENTRY(1, "待入库"),
    PART_ENTRY(2, "部分入库"),
    FINISH_ENTRY(3, "完成入库"),
    CANCEL(4, "作废"),
    IN_STORE_YET(99, "已在库");

    private Integer code;
    private String message;

    NoticeStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMesByCode(Integer code) {
        NoticeStatusEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            NoticeStatusEnum iEnum = arr[i];
            if (iEnum.getCode().equals(code)) {
                return iEnum.getMessage();
            }
        }
        return null;
    }

    public static Integer getCodeByMsg(String msg) {
        if (msg == null) {
            return null;
        }
        NoticeStatusEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            NoticeStatusEnum iEnum = arr[i];
            if (iEnum.getMessage().equals(msg)) {
                return iEnum.getCode();
            }
        }
        return null;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public static NoticeStatusEnum[] getMessages() {
        NoticeStatusEnum[] arr = values();
        return arr;
    }
}
