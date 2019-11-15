package com.luv2code.springDemo.serviceImpl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springDemo.serviceImpl")

@PropertySource("classpath:sport.properties")
public class SportConfig {

}
