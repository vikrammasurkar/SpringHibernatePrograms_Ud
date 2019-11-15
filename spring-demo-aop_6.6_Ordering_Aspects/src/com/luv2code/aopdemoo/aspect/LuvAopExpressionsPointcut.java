package com.luv2code.aopdemoo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect

public class LuvAopExpressionsPointcut {

	@Pointcut("execution( * com.luv2code.aopdemoo.dao.*.*(..))")
	public void forDaoPackage() {
	}

	//create pointcut for getters 
	@Pointcut("execution( * com.luv2code.aopdemoo.dao.*.get*(..))")
	public void getter() {}
	
	
	
	//create pointcut for setters
	@Pointcut("execution( * com.luv2code.aopdemoo.dao.*.set*(..))")
	public void setter() {}
	
	
	
	
	//create pointcut for include package...Exclude getter/setter
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}
	
	
}
