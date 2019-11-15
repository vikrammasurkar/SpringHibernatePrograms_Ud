package com.luv2code.aopdemoo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemoo.Account;

@Component
public class AccountDAO {

	public void addAccount() {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	
	
public void addAccount(Account theAccount,boolean vipFlag) {
		
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT WITH SINGLE ARGUMENT..");
		
	}
	

public boolean doWork() {
	
	System.out.println(getClass() + "DOING STUFF: DOING MY  WORK:");
	return false;
}
	
}
