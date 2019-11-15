package com.luv2code.springDemo.serviceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springDemo.service.Coach;
import com.luv2code.springDemo.service.FortuneService;

@Configuration
@ComponentScan("com.luv2code.springDemo.serviceImpl")
public class SportConfig {
// define bean for sadFortuneService
	
	
	  @Bean public FortuneService sadFortuneService() 
	  { 
		  return new SadFortuneService();
	  
	  }
	  
	  //define bean for SwimConfig and inject dependencies
	  
	  @Bean public Coach swimCoach() 
	  {
		  return new SwimCoach(sadFortuneService()); 
		  }
	 
}
