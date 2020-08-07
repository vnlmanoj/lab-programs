package com.capg.spring_labbook.lab1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

Employee emp=context.getBean(Employee.class);
SBU sbu=container.getBean(SBU.class);
System.out.println(emp);
System.out.println(sbu);
	}
}
