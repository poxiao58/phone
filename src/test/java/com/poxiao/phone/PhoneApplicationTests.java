package com.poxiao.phone;

import com.poxiao.phone.service.SmsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PhoneApplicationTests {
    @Autowired
    private SmsService smsService;

    @Test
    public void contextLoads() throws Exception{
        String phone="您的手机号";
        smsService.sendSmsCode(phone);
    }

}
