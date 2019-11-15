package com.luv2code.springDemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.FortuneService;
@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "REST Fortune Service";
	}

}
