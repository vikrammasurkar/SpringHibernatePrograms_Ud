package com.luv2code.aopdemoo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	// this is where we add all of our related advices for logging
//include pkg exclude getter setters..
	// Lets start with an @Before advice

	@Pointcut("execution( * com.luv2code.aopdemoo.dao.*.*(..))")
	private void forDaoPackage() {
	}

	//create pointcut for getters 
	@Pointcut("execution( * com.luv2code.aopdemoo.dao.*.get*(..))")
	private void getter() {}
	
	
	
	//create pointcut for setters
	@Pointcut("execution( * com.luv2code.aopdemoo.dao.*.set*(..))")
	private void setter() {}
	
	
	
	
	//create pointcut for include package...Exclude getter/setter
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	
	
	
	
	// Match on package
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccount() {
		System.out.println("\n::::::::========>>>> Executing on @Before Advice on Methods  \n");
	}
	
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n::::::::========>>>> Performing API analytics  \n");
	}

}
