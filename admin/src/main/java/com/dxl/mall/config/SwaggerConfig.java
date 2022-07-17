package com.dxl.mall.config;

import com.dxl.mall.common.config.BaseSwaggerConfig;
import com.dxl.mall.common.domain.SwaggerProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.dxl.mall.controller")
                .title("mall后台系统")
                .description("mall后台相关接口文档")
                .contactName("dxl")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
