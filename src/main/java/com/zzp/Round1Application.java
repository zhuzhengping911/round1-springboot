package com.zzp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类
 */
@RequestMapping(value = "/")
@RestController
@SpringBootApplication
@MapperScan(basePackages = "com.zzp.dao")
public class Round1Application {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String helloWorld(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(Round1Application.class, args);
	}


}
