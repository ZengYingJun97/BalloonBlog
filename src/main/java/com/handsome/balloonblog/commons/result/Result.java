package com.handsome.balloonblog.commons.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: balloonblog
 * @description: 对http的请求结果进行封装
 * @author: handsome
 * @create: 2020-08-06 15:02
 **/
@Getter
@Setter
@ToString
public class Result {

    private boolean status;

    private String message;

    private String errorMsg;

    private int errorCode;

    private Object data;

    public static Result success(final Object data) {
        return new Result(true, "获取信息成功", data);
    }

    public static Result success(final Object data, String message) {
        return new Result(true, message, data);
    }

    public static Result success(String message) {
        return new Result(true, message);
    }

    public static Result fail(String errorMsg, int errorCode) {
        return new Result(false, errorMsg, errorCode);
    }

    public static Result fail(String errorMsg, int errorCode, final Object data) {
        return new Result(false, errorMsg, errorCode, data);
    }

    public Result(boolean status) {
        this.status = status;
    }

    public Result(boolean status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Result(boolean status, String errorMsg, int errorCode) {
        this.status = status;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public Result(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(boolean status, Object data) {
        this.status = status;
        this.data = data;
    }

    public Result(boolean status, String errorMsg, int errorCode, Object data) {
        this.status = status;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
        this.data = data;
    }
}
