package com.stackroute.soulmate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean 
	public Docket soulmateApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("soulmate-api-1.0")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.stackroute.soulmate.controller"))
				.paths(regex("/api/v1/profile.*"))
				.build()
				.apiInfo(new ApiInfoBuilder()
						.version("1.0")
						.title("Soulmate API")
						.description("Documentation on Soulmate API 1.0")
						.build());
	}
}
