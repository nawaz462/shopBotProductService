package com.shopBot.shopBotProducts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(metaData())
                .select().apis(RequestHandlerSelectors.basePackage("com.shopBot.shopBotProducts"))
                .paths(regex("/products.*"))
                .build();
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder().title("ShopBot Application products API")
                .description("ShopBot Application products API reference for developers")
                .termsOfServiceUrl("http://localhost:8080/products")
                .contact("shahbaznawaz786@gmail.com").license("ShopBot License")
                .licenseUrl("shahbaznawaz786@gmail.com").version("1.0").build();
    }
}