package com.luv2code.aopdemoo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {

	
	@Before("com.luv2code.aopdemoo.aspect.LuvAopExpressionsPointcut.forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n::::::::========>>>> Performing API analytics  \n");
	}
}
