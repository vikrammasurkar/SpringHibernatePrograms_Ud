package com.luv2code.aopdemoo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public Boolean addMembership()
	{
		System.out.println(getClass()+" DOING STUFF  :  ADDING MENBERSHPDAO ACCOUNTS...");
		return true;
	}
	

}
