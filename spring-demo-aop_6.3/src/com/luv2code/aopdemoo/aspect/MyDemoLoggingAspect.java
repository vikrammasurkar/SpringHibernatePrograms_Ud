package com.luv2code.aopdemoo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//this is where we add all of our related advices for logging 
	
	//Lets start with  an @Before advice 
	//Match on package
	@Before("execution( * com.luv2code.aopdemoo.dao.*.*(..))")
	public void beforeAddAccount()
	{
		System.out.println("\n::::::::========>>>> Executing on @Before Advice on Methods  \n");
	}
	
	
	
	/*
	 * @After("execution(public void addAccount())") public void beforeAddAccounts()
	 * { System.out.
	 * println("\n::::::::========>>>> Executing on @After Advice on addAccount()  \n"
	 * ); }
	 */
}
