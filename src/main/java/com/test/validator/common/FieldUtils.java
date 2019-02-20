package com.test.validator.common;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import com.test.validator.exception.TestException;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019/02/20
 * @Description
 * 自定义校验工具类
 */
public class FieldUtils {

    /**
     * 字符串非空校验
     * @param filed 要校验的字段
     * @param message message
     * @param code code
     * @param data data
     */
    public static void stringIsNullCheck(String filed,String message,String code,Object data){
        if (StrUtil.isBlank(filed)){
            throw new TestException(code,message,data);
        }
    }

    /**
     * 数字校验
     * @param filed 要校验的字段
     * @param message message
     * @param code code
     * @param data data
     */
    public static void isNumberCheck(String filed,String message,String code,Object data){
        if (!NumberUtil.isNumber(filed)){
            throw new TestException(code,message,data);
        }
    }

    /**
     * 整数校验
     * @param filed 要校验的字段
     * @param message message
     * @param code code
     * @param data data
     */
    public static void isIntCheck(String filed,String message,String code,Object data){
        if (!NumberUtil.isInteger(filed)){
            throw new TestException(code,message,data);
        }
    }

    /**
     * 邮件校验
     * @param filed 要校验的字段
     * @param message message
     * @param code code
     * @param data data
     */
    public static void isEmailCheck(String filed,String message,String code,Object data){
        if (!Validator.isEmail(filed)){
            throw new TestException(code,message,data);
        }
    }

    /**
     * 手机号校验
     * @param filed 要校验的字段
     * @param message message
     * @param code code
     * @param data data
     */
    public static void isMobileCheck(String filed,String message,String code,Object data){
        if (!Validator.isMobile(filed)){
            throw new TestException(code,message,data);
        }
    }
}
