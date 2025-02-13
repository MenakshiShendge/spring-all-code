package com.cg.model;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseOrder {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(AppConfig.class);
		Order o=contex.getBean(Order.class);
		o.showOrderdetails();
		contex.close();
	}

}
