package com.luv2code.springDemo.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.service.FortuneService;

//userDefined Component (thatCoach)
@Component
public class TennisCoach implements Coach {

	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		
		this.fortuneService = thefortuneService;
	}

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
