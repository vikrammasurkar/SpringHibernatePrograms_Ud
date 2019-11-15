package com.luv2code.springDemo.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;


@Component
public class PingPongCoach implements Coach {

private com.luv2code.springDemo.service.FortuneService fortuneService;
	
	// define a default constructor
	public PingPongCoach() {
		System.out.println(">> PingPongCoach: inside default constructor");
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
