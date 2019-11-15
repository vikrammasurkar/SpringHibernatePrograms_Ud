package com.luv2code.springDemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.FortuneService;
@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Database Fortune Service";
	}

}
