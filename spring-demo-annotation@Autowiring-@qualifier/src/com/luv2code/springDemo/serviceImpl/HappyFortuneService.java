package com.luv2code.springDemo.serviceImpl;

import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.FortuneService;
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
			return "Solutions Always comses to me..";
	}

}
