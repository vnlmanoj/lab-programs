package com.capg.spring_labbook.lab1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	Employee emp=(Employee) container.getBean("employee");
    	System.out.println("Employee Details");
    	System.out.println("-------------------------");
    	System.out.println("Employee ID     : "+emp.getEmployeeId());
    	System.out.println("Employee Name   : "+emp.getEmployeeName());
    	System.out.println("Employee Salary : "+emp.getSalary());
    	System.out.println("Employee BU     : "+emp.getBusiessUnit());
    	System.out.println("Employee Age    : "+emp.getAge());
    }
}
