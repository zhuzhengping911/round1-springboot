package com.zzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/")
@RestController
@SpringBootApplication
public class Round1Application {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String helloWorld(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(Round1Application.class, args);
	}


}
