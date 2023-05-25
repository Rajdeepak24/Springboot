package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Repository
@RestController
@SpringBootApplication
public class HelloGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloGradleApplication.class, args);
		System.out.println("Vidhi choti");
	}
	
	@GetMapping("/choti")
	public String choti() {
		return "choti is here";
	}

}
