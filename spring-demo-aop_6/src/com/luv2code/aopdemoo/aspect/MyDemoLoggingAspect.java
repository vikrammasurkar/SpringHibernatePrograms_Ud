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
	//Match on parameters Pattern wildcard..()--no args,(*)--one args,(..)--0 to many args.
	@Before("execution( * add*(com.luv2code.aopdemoo.Account))")
	public void beforeAddAccount()
	{
		System.out.println("\n::::::::========>>>> Executing on @Before Advice on Methods  \n");
	}
	
	
	
	
}
