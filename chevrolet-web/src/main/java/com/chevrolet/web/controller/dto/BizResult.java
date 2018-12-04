package com.chevrolet.web.controller.dto;

/**
 * Created by suclogger on 2017/12/5
 * Modified by
 * Description: 视图层的dto对象
 * */
public class BizResult<T> {

    private Boolean success;

    private String message;

    private T data;


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static BizResult create(Object data) {
        BizResult<Object> r = new BizResult<>();
        r.setSuccess(true);
        r.setData(data);
        return r;
    }

    public static BizResult create(String message) {
        BizResult<Object> r = new BizResult<>();
        r.setSuccess(false);
        r.setMessage(message);
        return r;
    }

}
