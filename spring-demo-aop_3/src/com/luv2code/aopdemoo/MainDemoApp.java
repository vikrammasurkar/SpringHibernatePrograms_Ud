package com.luv2code.aopdemoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemoo.dao.AccountDAO;
import com.luv2code.aopdemoo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the aCCOUNTdAO bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		// get the MembershioDAO bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method from accountDAO
		theAccountDAO.addAccount();

		// call the business methods from MembershioDAO 
		theMembershipDAO.addAccount();

		
		
		
		

		// close the context
		context.close();
	}

}


//Add pointcut for specific class by giving fully qualified name..in MyDemologgingAspect.java