package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("/hi")
	public String greet1(@RequestParam(value = "Uname")String name,Model model) {
		System.out.println("Hello form controller");
		model.addAttribute("Uname", name);
		return "home"; //return jsp called hello which is in WEB-INF folder
	}
	
}

