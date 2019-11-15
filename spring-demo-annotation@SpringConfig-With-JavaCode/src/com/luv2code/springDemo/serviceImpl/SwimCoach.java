package com.luv2code.springDemo.serviceImpl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.service.FortuneService;


public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public SwimCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 mtr As Warmup";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
