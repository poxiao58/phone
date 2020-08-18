package com.poxiao.phone.controller;

import com.poxiao.phone.service.SmsService;
import com.poxiao.phone.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:测试短信接口
 * @Description:TODO
 * @Author:but程序猿
 * @Date:2020/8/18 10:45 上午
 * @Version:1.0
 **/
@RestController
public class TestController {
    @Autowired
    private SmsService smsService;

    @GetMapping(value = "/testSms/{phone}")
    public Result testSms(@PathVariable(name = "phone") String phone) {
        return smsService.sendSmsCode(phone);

    }
}
