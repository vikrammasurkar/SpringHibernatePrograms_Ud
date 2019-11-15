package com.luv2code.aopdemoo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemoo.Account;

@Component
public class MembershipDAO {
	
	public Boolean addMembership()
	{
		System.out.println(getClass()+" DOING STUFF  :  ADDING MENBERSHPDAO ACCOUNTS...\n");
		return true;
	}
	
	public void goToSleep() {
		
		System.out.println(getClass() + ": I am Going to sleep..");
		
	}

}
