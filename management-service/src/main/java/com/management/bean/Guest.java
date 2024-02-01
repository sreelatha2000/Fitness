package com.management.bean;

import jakarta.persistence.Column;

public class Guest 
{
	private Long idd;
	private String  password;
	private String destination;
	public Long getIdd() {
		return idd;
	}
	public void setIdd(Long idd) {
		this.idd = idd;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Guest [idd=" + idd + ", password=" + password + ", destination=" + destination + "]";
	}
	public Guest(Long idd, String password, String destination) {
		super();
		this.idd = idd;
		this.password = password;
		this.destination = destination;
	}
	
	

}
