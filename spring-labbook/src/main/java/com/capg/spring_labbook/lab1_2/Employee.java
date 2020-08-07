package com.capg.spring_labbook.lab1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class Employee {


	private int employeeId;
	private String employeeName;
	private double salary;
	@Autowired
	@Qualifier("sbu")
	private SBU busiessUnit;
	
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
	public SBU getBusiessUnit() {
		return busiessUnit;
	}
	public void setBusiessUnit(SBU busiessUnit) {
		this.busiessUnit = busiessUnit;
	}
	
	
	public SBU  getSbuDetails()
	{
		return busiessUnit;
		
	}
	
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	
}
