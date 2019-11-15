package com.luv2code.springDemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;
@Component
public class RugbiCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "run....Smash...Runn..Win";
	}

}
