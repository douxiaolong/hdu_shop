package com.dxl.mall.portal.service;

public interface SmsService {

    void send(String phone,String code) throws Exception;

}
