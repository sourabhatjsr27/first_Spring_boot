package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Demo1Application {
	
	@GetMapping
	public String helloWorld() {
		return "Andhera kayam rahe";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
		System.out.println("Sourbh Thakre");
		
	}

}
