package com.springpractium.fttek;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class fttekConfiguration {
	
	@Autowired
	private fttekProperties fttekProperties;
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("Display Product with Comments: " + fttekProperties.isDisplayProductWithComments());
		
	}

}
