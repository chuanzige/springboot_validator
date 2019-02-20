package com.test.validator.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019/02/20
 * @Description
 * 全局捕捉异常处理类
 * @ControllerAdvice注解可以加参数basePackages:指定捕捉异常的包范围
 */
@ControllerAdvice
public class TestControllerAdvice {
    /**
     * 自定义异常处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = TestException.class)
    public Map myErrorHandler(TestException ex) {
        Map map = new HashMap(3);
        map.put("code", ex.getCode());
        map.put("message", ex.getMsg());
        map.put("data",ex.getData());
        return map;
    }
}
