package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String greet() {
		System.out.println("Hello form controller");
		return "home"; //return jsp called hello which is in WEB-INF folder
	}
}
