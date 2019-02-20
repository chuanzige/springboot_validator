package com.test.validator.exception;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019/02/20
 * @Description
 * 自定义异常
 */
public class TestException extends RuntimeException{
    private String code;
    private String msg;
    private Object data;

    public TestException(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}
