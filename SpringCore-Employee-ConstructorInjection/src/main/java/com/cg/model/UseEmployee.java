package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationsContext.xml");
		//singleton scope
		Employee e= (Employee) context.getBean("empbean");
		System.out.println(e);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		System.out.println();
		
		Employee e3= (Employee) context.getBean("empbean");
		System.out.println(e3);
		System.out.println(e3.getId()+" "+e3.getName()+" "+e3.getSalary());
		System.out.println();
		
		//prototype scope
		Employee e1=(Employee)context.getBean("empbean1");
		System.out.println(e1);
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		System.out.println();
		
		Employee e2=(Employee)context.getBean("empbean1");
		System.out.println(e2);
		System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getSalary());
		System.out.println();

	}

}
