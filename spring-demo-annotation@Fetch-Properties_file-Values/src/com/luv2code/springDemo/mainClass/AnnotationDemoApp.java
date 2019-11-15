package com.luv2code.springDemo.mainClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.serviceImpl.TennisCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call a method on the bean
		System.out.println(theCoach.getDailyFortune());

		
		//call new Tennis coach methods...has the props value injected
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
		
	}

}


