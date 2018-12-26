package com.test;

public class Employee {

	String name;
	String company;
	double salary;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getCompany(){
		return this.company;
	}
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
}
