package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationsContext.xml");
		Employee e= (Employee) context.getBean("empbean");
		System.out.println(e);
		
		Employee e1=(Employee)context.getBean("empbean1");
		System.out.println(e1);

	}

}
