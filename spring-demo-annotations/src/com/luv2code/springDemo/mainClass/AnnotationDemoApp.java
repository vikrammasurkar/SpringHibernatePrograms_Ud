package com.luv2code.springDemo.mainClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springDemo.service.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		//read spring config file..
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		//Coach theCoach =context.getBean("thatCoach",Coach.class);// this is for userDefined Component
		
		
		Coach theCoach =context.getBean("rugbiCoach",Coach.class);//This is for Spring defined default COmponent
		
		//call a method on  the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//close the container
		context.close();
	}

}
