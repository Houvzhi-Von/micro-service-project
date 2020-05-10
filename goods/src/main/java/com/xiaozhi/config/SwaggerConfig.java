package com.xiaozhi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 6:21 下午
 * @description: swagger
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value(value = "${swagger.enable}")
    boolean swaggerEnable;

    public boolean isSwaggerEnable() {
        return swaggerEnable;
    }

    public void setSwaggerEnable(boolean swaggerEnable) {
        this.swaggerEnable = swaggerEnable;
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("v1.0")
                .apiInfo(apiInfo())
                .enable(swaggerEnable).select()
                .apis(RequestHandlerSelectors.basePackage("com.xiaozhi.controller"))
                .paths(PathSelectors.any()).build().pathMapping("");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("商品微服务 - API")
                .description("小智")
                .contact(new Contact("xiaozhi",
                        "http://blog.osnooker.com", "13718913664@163.com"))
                .version("1.0.0")
                .build();
    }

}
