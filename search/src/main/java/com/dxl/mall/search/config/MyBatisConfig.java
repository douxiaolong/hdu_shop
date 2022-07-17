package com.dxl.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 */
@Configuration
@MapperScan({"com.dxl.mall.mapper","com.dxl.mall.search.dao"})
public class MyBatisConfig {
}

