package com.springpractium.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Product {
	
	private Long productID;
	private String productName;
	private Double price; 
	private Date stt;
	
	private List<Comment> comments = new ArrayList<Comment>();
	
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getStt() {
		return stt;
	}
	public void setStt(Date stt) {
		this.stt = stt;
	}
	
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", stt=" + stt
				+ ", comments=" + comments  + "]";
	}
	
	

}
