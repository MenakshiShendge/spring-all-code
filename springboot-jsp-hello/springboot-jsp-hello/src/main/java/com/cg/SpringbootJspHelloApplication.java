package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJspHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJspHelloApplication.class, args);
		System.out.println("Hello");
	}

}
