package com.luv2code.aopdemoo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

	@Before("com.luv2code.aopdemoo.aspect.LuvAopExpressionsPointcut.forDaoPackageNoGetterSetter()")
	public void logCloudAsync() {
		System.out.println("\n::::::::========>>>>Logging to Cloud Asynk Fashion \n");
	}
	
}
