package com.luv2code.springDemo.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.service.FortuneService;

//userDefined Component (thatCoach)
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	//@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println(">> TennisCoach:--inside default constructor...");
	}
	
	
	//define Awuowired setter injection 
	
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * 
	 * System.out.println(">> :--inside setFortuneService Setter...");
	 * 
	 * this.fortuneService = fortuneService; }
	 */
	
	//@Autowired for any method..Automaticaly Execute
	/*
	 * @Autowired public void doSomeCreazyStuff() {
	 * System.out.println("Coading is My passion:--QAutowired For Method."); }
	 */

	/*
	 * @Autowired public TennisCoach(FortuneService thefortuneService) {
	 * 
	 * this.fortuneService = thefortuneService; }
	 */
	@Override
	public String getDailyWorkout() {
		
		return "Practice Daily 6 Hrs..";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
}
