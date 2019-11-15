package com.luv2code.springDemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.service.FortuneService;
@Component
public class RugbiCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "run....Smash...Runn..Win";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
