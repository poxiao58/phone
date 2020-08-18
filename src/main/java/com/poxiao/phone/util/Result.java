package com.poxiao.phone.util;

/**
 * @description
 * @param <T>
 * @author bug程序猿
 */
public class Result<T> {
    /*状态码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体的内容*/
    private T data;
    /*响应状态*/
    private Boolean success;

    public Result(Integer code, String msg, Boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

    public Result(Integer code, String msg, T data, Boolean success) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
