package com.webstack.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://3.110.47.123:81/")
public class WebdemoApplication {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Radhe Krishna...!";
	}
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello Welcome to World of CICD...!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}

}
