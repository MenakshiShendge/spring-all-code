package com.cg.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.model.Employee;

import jakarta.servlet.http.HttpSession;

@Controller
public class HelloController {

	
	
	
	@GetMapping({ "/loginpage"})
	public String getlogin() {
		return "login";
	}
	
	@PostMapping("/loginpage")
    public String processLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password, Model model,HttpSession session) {
    	System.out.println("username: "+username);
    	System.out.println("username: "+password);
        if ("minu".equals(username) && "minu@123".equals(password)) {
            model.addAttribute("username", username);
            session.setAttribute("username", username);
            return "loginSuccess"; // Move to success page
        } else {
            model.addAttribute("error", "Invalid credentials. Please try again.");
            return "loginFailure"; // Move to failure page
        }
    }
	@GetMapping({ "/employeepage"})
	public String getemployee(HttpSession session, Model model) {
		String username = (String) session.getAttribute("username"); // Retrieve username from session
        model.addAttribute("username", username); // Add username to the model
		return "employee";
	}
	
	@PostMapping("/employeepage")
	public String processemployee(@RequestParam(value="empid",required = false)String empid,
			@RequestParam(value="empname",required = false) String empname,
			@RequestParam(value="empsalary",required = false) String empsalary,Model model,HttpSession session) {
		String username = (String) session.getAttribute("username"); // Retrieve username from session
		
		//pass single value
		model.addAttribute("empid",empid);
		model.addAttribute("empname",empname);
		model.addAttribute("empsalary",empsalary);
		
		
		
		model.addAttribute("username", username); // Add username to the model
		System.out.println("empid : "+empid);
		System.out.println("empname : "+empname);
		System.out.println("empsalary : "+empsalary);
		if(empid==null&&empname==null&&empsalary==null) {
			return "employee";
		}
		else {
			//pass value in obj
			Employee emp=new Employee();
			emp.setId(Integer.parseInt(empid));
			emp.setName(String.valueOf(empname));
			emp.setSalary(Double.parseDouble(empsalary));
			model.addAttribute("employee",emp);
			
			List<Employee> employees=new ArrayList<>();
			Employee e1=new Employee(2,"minu",55000);
			Employee e2=new Employee(3,"tina",75000);
			Employee e3=new Employee(4,"meera",65000);
			employees.add(e1);
			employees.add(e2);
			employees.add(e3);
			model.addAttribute("employees",employees);
			return "finalpage";
		}
	}
}

