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
		theAccountDAO.doWork();
		
		
		
		Account myAccount=new Account();
		theAccountDAO.addAccount(myAccount,true);//method with parameter
		
		
		

		// call the business methods from MembershioDAO 
		theMembershipDAO.addMembership();
		theMembershipDAO.goToSleep();

		
		//call AccountDao Getters AND Setters Method
		theAccountDAO.setName("Foobar");
		theAccountDAO.setServiceCode("Silver");
		theAccountDAO.setName("nikols");
		theAccountDAO.setServiceCode("gold");
		
		String name=theAccountDAO.getName();
		String code=theAccountDAO.getServiceCode();
		//System.out.println("NAME:   "+name);
		//System.out.println("Service Code:   "+code);

		// close the context
		context.close();
	}

}
