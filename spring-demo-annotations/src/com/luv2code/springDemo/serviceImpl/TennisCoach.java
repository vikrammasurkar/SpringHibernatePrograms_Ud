package com.luv2code.springDemo.serviceImpl;



import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.Coach;

//userDefined Component (thatCoach)
@Component("thatCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice Daily 6 Hrs..";
	}

}
