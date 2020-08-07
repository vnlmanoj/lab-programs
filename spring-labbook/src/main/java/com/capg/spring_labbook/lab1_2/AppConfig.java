package com.capg.spring_labbook.lab1_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.capg.spring_labbook.lab1_2"})
public class AppConfig {

	@Bean(name = "employee")
	public Employee getBean()
	{
	Employee emp=new Employee(11,"kanisk",40000);
	return emp;
}
	public SBU getSbuBean()
	{
		SBU sbu=new SBU();
		return sbu;
	}
}
