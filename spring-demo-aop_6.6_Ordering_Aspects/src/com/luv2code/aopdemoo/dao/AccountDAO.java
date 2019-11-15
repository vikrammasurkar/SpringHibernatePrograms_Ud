package com.luv2code.aopdemoo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemoo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	

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


			public String getName() {
				System.out.println(getClass() + " :--in GetName:");
				return name;
			}


			public void setName(String name) {
				System.out.println(getClass() + " :--in SetName:");
				this.name = name;
			}


			public String getServiceCode() {
				System.out.println(getClass() + ":-- in GetServocCode:");
				return serviceCode;
			}


			public void setServiceCode(String serviceCode) {
				System.out.println(getClass() + ":-- in SetServocCode:");
				this.serviceCode = serviceCode;
			}
										




}
