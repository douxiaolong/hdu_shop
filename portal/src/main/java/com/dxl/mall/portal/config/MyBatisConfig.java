package com.dxl.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@MapperScan({"com.dxl.mall.mapper","com.dxl.mall.portal.dao"})
public class MyBatisConfig {
}
