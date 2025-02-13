package com.cg.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Product product() {
		Product p=new Product();
		p.setName("HeadPhone");
		p.setPrice(1500);
		return p;
	}
	
	@Bean
	public Order order() {
		Order o=new Order();
		o.setQuantity(2);
		o.setProduct(product());
		return o;
	}
}
