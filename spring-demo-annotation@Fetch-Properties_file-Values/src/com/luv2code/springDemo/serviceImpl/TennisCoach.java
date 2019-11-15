package com.luv2code.springDemo.serviceImpl;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.service.FortuneService;

//userDefined Component (thatCoach)
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	@Override
	public String getDailyWorkout() {
		
		return "Practice Daily 6 Hrs..";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
	
	
}
