package com.capg.spring_labbook.lab1_1;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String busiessUnit;
	private int age;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusiessUnit() {
		return busiessUnit;
	}
	public void setBusiessUnit(String busiessUnit) {
		this.busiessUnit = busiessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, double salary, String busiessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.busiessUnit = busiessUnit;
		this.age = age;
	}
	
	
}
