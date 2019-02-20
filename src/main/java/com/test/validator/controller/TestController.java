package com.test.validator.controller;

import com.test.validator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019/02/20
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/post")
    public Map post(@RequestParam Map record){
        return testService.post(record);
    }

}
