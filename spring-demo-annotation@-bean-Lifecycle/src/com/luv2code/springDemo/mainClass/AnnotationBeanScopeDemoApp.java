package com.luv2code.springDemo.mainClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springDemo.service.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	
		//read spring config file..
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		
		
		
		Coach theCoach =context.getBean("tennisCoach",Coach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the container
		context.close();
	}

}
