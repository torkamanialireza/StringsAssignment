package com.alireza.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "<h1>Hello Client! How are You doing</h1>";
	}
	@RequestMapping("/random")
	public String adminRandom() {
		return "<h1>Spring Boot is great! So easy to just respond with strings</h1>";
	}
}
