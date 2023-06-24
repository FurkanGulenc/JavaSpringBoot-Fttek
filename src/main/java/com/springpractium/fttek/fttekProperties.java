package com.springpractium.fttek;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix ="fttek")
public class fttekProperties {
	
	private boolean displayProductWithComments=false;
	
	public boolean isDisplayProductWithComments() {
		return displayProductWithComments;
	}
	
	public void setDisplayProductWithComments(boolean displayProductWithComments) {
		this.displayProductWithComments = displayProductWithComments;
	}
}
