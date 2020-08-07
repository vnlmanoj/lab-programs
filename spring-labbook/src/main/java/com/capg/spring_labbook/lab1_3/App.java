package com.capg.spring_labbook.lab1_3;

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
    	SBU sbu=(SBU) container.getBean("sbu2");
    System.out.println(sbu);
    }
}
