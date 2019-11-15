package com.luv2code.springDemo.mainClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springDemo.service.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	
		//read spring config file..
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		
		
		Coach theCoach =context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach =context.getBean("tennisCoach",Coach.class);
		
		
		boolean result=(theCoach== alphaCoach);
		System.out.println(">> Pointing The Same Point   : "+result);
		
		System.out.println(">> Memory Location for theCoach    "+theCoach);
		
		System.out.println(">> Memory Location for alphaCoach    "+alphaCoach);
		//close the container
		context.close();
	}

}
