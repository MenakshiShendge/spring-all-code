package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationsContext.xml");
		Employee e= (Employee) context.getBean("empbean");
		System.out.println(e);
		context.close();

	}

}
