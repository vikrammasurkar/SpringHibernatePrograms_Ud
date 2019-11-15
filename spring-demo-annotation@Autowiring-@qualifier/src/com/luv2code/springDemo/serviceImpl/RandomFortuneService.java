package com.luv2code.springDemo.serviceImpl;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.luv2code.springDemo.service.FortuneService;
@Component
public class RandomFortuneService implements FortuneService {

	
	// create array of string.
	
	private String[] data= {"Today Is Great Day","Success Always Comes To Me","My thaughts Create Reality"};
 
	//Create Random number generator
	
	private Random myRandom=new Random();
	@Override
	public String getFortune() {
		
		//pick randon String from the array
		
		int index=myRandom.nextInt(data.length);
		System.out.println("Length Of Array:--"+ index);
		
		String theFortune=data[index];
		
		return theFortune;
	}

}
