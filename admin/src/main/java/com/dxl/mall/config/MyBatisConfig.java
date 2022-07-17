package com.dxl.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
* mybatis的配置
* */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.dxl.mall.dao","com.dxl.mall.mapper"})
public class MyBatisConfig {
}
