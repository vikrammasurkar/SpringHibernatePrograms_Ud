package com.luv2code.springDemo.serviceImpl;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.service.FortuneService;

//userDefined Component (thatCoach)
@Component

public class TennisCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println(">> TennisCoach:--inside default constructor...");
	}
	
	
	//Define init method
	@PostConstruct
	public void doMyStartUpStuff()
	{
		System.out.println(">> inside :--   doMyStartUpStuff ");
	}
	
	
	//Defiiine Destroy method
	
	
	
	
	//define setter injection 
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println(">> :--inside setFortuneService Setter...");

		this.fortuneService = fortuneService;
	}
	
	//@Autowired for any method..Automaticaly Execute
	@Autowired
	public void doSomeCreazyStuff()
	{
		System.out.println("Coading is My passion:--QAutowired For Method." );
	}

	/*
	 * @Autowired public TennisCoach(FortuneService thefortuneService) {
	 * 
	 * this.fortuneService = thefortuneService; }
	 */
	
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println(">> inside :--   doMyCleanUpStuff ");
	}  
	
	
	@Override
	public String getDailyWorkout() {
		
		return "";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
}
