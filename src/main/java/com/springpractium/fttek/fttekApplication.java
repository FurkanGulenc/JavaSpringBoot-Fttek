package com.springpractium.fttek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(value = fttekProperties.class)
public class fttekApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(fttekApplication.class, args);
	}

}
