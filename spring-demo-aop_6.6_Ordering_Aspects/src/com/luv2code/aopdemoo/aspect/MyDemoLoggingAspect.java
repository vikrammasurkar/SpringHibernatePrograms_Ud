package com.luv2code.aopdemoo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {
 
	
	@Before("com.luv2code.aopdemoo.aspect.LuvAopExpressionsPointcut.forDaoPackageNoGetterSetter()")
	public void beforeAddAccount() {
		System.out.println("\n::::::::========>>>> Executing on @Before Advice on Methods  \n");
	}
	
	
	

	
}
