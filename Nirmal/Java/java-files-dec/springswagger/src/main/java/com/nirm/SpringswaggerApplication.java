package com.nirm;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SpringswaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringswaggerApplication.class, args);
	}
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.nirm"))
				.build()
				.apiInfo(apiDetails());
}
	
	private ApiInfo apiDetails() {
		
		return new ApiInfo(
				"Address Book API",
				"Sample api",
				"1.0",
				"Free to use",
				new contact("Nirmal", "www.nirm.com","nb"),
				"API Licence",
				"http://nirm.io,"
				Collections.emptyList()		
				);
	}
}
