package com.dxl.mall.search.config;

import com.dxl.mall.common.config.BaseSwaggerConfig;
import com.dxl.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.macro.mall.search.controller")
                .title("mall搜索系统")
                .description("mall搜索相关接口文档")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
