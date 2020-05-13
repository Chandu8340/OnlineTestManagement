package com.capg.otms;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class OnlineTestManagementSystemSaikumarApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestManagementSystemSaikumarApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.capg.otms.controller")).build().apiInfo(myApiInfo());

	}

	private ApiInfo myApiInfo() {
		// TODO Auto-generated method stub
		ApiInfo apiInfo = new ApiInfo("ONLINE TEST MANAGEMENT", "API CREATION", "1.0", "Free to Use",
				new Contact("Sai kumar", "/api", "saiphanikumar1999@gmail.com"), "API licence", "/api",
				Collections.emptyList());
		return apiInfo;
	}

}
