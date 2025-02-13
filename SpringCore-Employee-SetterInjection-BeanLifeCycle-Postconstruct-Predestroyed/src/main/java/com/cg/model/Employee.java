package com.cg.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@PostConstruct
	public void myinitmethod() {
		System.out.println("bean is redy to use using PostConstruct annotation");
	}
	
	@PreDestroy
	public void destroymethod() {
		System.out.println("bean is destroyed using PreDestroy annotation");
	}
	

}
