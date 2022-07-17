package com.dxl.mall.portal.service.impl;

import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.dxl.mall.portal.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    com.aliyun.dysmsapi20170525.Client smsClient;

    @Override
    public void send(String phone, String code) throws Exception {
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setSignName("阿里云短信测试")
                .setTemplateCode("SMS_154950909")
                .setPhoneNumbers(phone)
                .setTemplateParam("{\"code\":"+"\""+code+"\"}");
        // 复制代码运行请自行打印 API 的返回值
        smsClient.sendSms(sendSmsRequest);
    }
}
