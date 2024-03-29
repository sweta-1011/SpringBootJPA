package com.example.SpringBootJpa.topic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.SpringBootJpa.topic"))
//                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo("Spring boot swagger example",
                "Spring boot swagger example API for topics",
                "1.0",
                "Terms of service",
                new Contact("sweta", "http://www.example.com", "sweta@gmail.com"),
                "Apache license version 2.0",
                "http://www.apache.org/license.html",
                new ArrayList<>()
        );
        return apiInfo;
    }
}