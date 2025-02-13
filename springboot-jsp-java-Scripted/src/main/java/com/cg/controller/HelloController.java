package com.cg.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/hi")
	public String greet1(@RequestParam(value = "Uname")String name,Model model) {
		System.out.println("Hello form controller");
		model.addAttribute("Uname", name);
		return "home"; //return jsp called hello which is in WEB-INF folder
	}
	@GetMapping({ "/sqr"})
    public String hello(@RequestParam(value = "name", defaultValue = "World",
        required = true) String name,@RequestParam(value = "number") String number, Model model) {
    	System.out.println("Hi");
        model.addAttribute("name", name);
        model.addAttribute("number", number);
        model.addAttribute("CurrentDate",new Date());
        return "squre";
    }
	
	@GetMapping({ "/login"})
	public String getlogin() {
		return "login";
	}
	
	@PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password, Model model) {
    	System.out.println("username: "+username);
    	System.out.println("username: "+password);
        if ("minu".equals(username) && "minu@123".equals(password)) {
            model.addAttribute("username", username);
            return "loginSuccess"; // Move to success page
        } else {
            model.addAttribute("error", "Invalid credentials. Please try again.");
            return "loginFailure"; // Move to failure page
        }
    }
	
}

