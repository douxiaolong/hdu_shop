package com.dxl.mall.security.config;

import com.dxl.mall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {



}
