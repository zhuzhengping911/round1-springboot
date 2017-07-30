package com.zzp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 */
@RequestMapping(value = "/")
@RestController
@SpringBootApplication
@MapperScan(basePackages = "com.zzp.dao")
@Configuration
@EnableSwagger2
@EnableScheduling
public class Round1Application {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String helloWorld(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(Round1Application.class, args);
	}


	@Bean
	public Docket createApi(){
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.zzp.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				.title("API文档")
				.description("API使用即参数定义")
				.termsOfServiceUrl("http://blog.csdn.net/qq_31001665")
				.contact("ZZP")
				.version("0.1")
				.build();
	}
}
