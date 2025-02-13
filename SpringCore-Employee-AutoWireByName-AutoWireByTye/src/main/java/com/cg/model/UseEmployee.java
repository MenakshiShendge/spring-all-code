package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationsContext.xml");
		//by name
		Employee e= (Employee) context.getBean("empbean");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		System.out.println(e.getAddress().getCity()+" "+e.getAddress().getState());
		System.out.println();
		
		//by type
		Employee e1= (Employee) context.getBean("empbean1");
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		System.out.println(e1.getAddress().getCity()+" "+e1.getAddress().getState());
		System.out.println();
		

	}

}
