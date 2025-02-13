package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationsContext.xml");
		//2 obj can wired by ref 
		Employee e= (Employee) context.getBean("empbean");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		System.out.println(e.getAddress().getCity()+" "+e.getAddress().getState());
		System.out.println();
		

	}

}
