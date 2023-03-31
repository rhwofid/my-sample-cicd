package com.example.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sample2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sample2Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
