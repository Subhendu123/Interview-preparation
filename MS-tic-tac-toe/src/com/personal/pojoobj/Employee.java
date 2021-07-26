package com.personal.pojoobj;

import java.util.List;

import java.util.List;

public class Employee {
	
	private int salary;
	private int id;
	private String name;
	private String dept;
	private List<Skills> skills;
	
	public Employee(int salary, int id, String name, String dept) {
		super();
		this.salary = salary;
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
