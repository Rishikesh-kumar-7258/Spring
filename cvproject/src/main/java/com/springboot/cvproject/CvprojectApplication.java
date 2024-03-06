package com.springboot.cvproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CvprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvprojectApplication.class, args);
	}
	
	@GetMapping("/")
	public String Home() {
		return "This is home";
	}
	
	@GetMapping("/error")
	public String Error(@RequestParam String param) {
		return "Error occured";
	}
}
