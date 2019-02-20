package com.test.validator.service.impl;

import com.test.validator.common.FieldUtils;
import com.test.validator.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019/02/20
 * @Description
 */
@Service
public class TestServiceImpl implements TestService {
    private static final String CODE = "Y50000";

    @Override
    public Map post(Map<String,String> record) {
        FieldUtils.stringIsNullCheck(record.get("username"),"用户名不能为空",CODE,"");
        FieldUtils.stringIsNullCheck(record.get("password"),"密码不能为空",CODE,"");
        FieldUtils.stringIsNullCheck(record.get("sex"),"性别不能为空",CODE,"");
        FieldUtils.isNumberCheck(record.get("age"),"输入的年龄不合法",CODE,"");
        FieldUtils.isIntCheck(record.get("age2"),"请输入整数",CODE,"");
        FieldUtils.isEmailCheck(record.get("email"),"请输入正确的邮件",CODE,"");
        FieldUtils.isMobileCheck(record.get("mobile"),"请输入正确的手机号",CODE,"");
        //dao逻辑操作
        return record;
    }
}
