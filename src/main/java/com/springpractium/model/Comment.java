package com.springpractium.model;

import java.sql.Time;


public class Comment {
	
	private Long comID;
	private String comment;
	private Time comTime;
	private Product productID;
	private User userID;
	
	public Long getComID() {
		return comID;
	}
	public void setComID(Long comID) {
		this.comID = comID;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Product getProductID() {
		return productID;
	}
	public void setProductID(Product productID) {
		this.productID = productID;
	}
	public User getUserID() {
		return userID;
	}
	public void setUserID(User userID) {
		this.userID = userID;
	}
	@Override
	public String toString() {
		return "Comment [comID=" + comID + ", comment=" + comment + ", comTime=" + comTime + ", productID=" + productID
				+ ", userID=" + userID + "]";
	}
	public Time getComTime() {
		return comTime;
	}
	public void setComTime(Time comTime) {
		this.comTime = comTime;
	}
	
	
	
}