package com.luv2code.springDemo.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.serviceImpl.SportConfig;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
	
		//read spring java file..Do not required COnfiguration.xml File
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		
		
		
		Coach theCoach =context.getBean("tennisCoach",Coach.class);
		
		
		
		System.out.println(theCoach.getDailyWorkout());
		

		System.out.println(theCoach.getDailyFortune());
		
		
		
		//close the container
		context.close();
	}

}
