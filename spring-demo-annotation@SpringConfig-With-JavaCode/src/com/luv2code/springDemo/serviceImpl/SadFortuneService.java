package com.luv2code.springDemo.serviceImpl;

import com.luv2code.springDemo.service.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	 
		return "Today is a Improvement Day";
	}

}
