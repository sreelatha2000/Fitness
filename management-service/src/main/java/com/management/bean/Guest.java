package com.management.bean;

public class Guest 
{
	private Long guestId;
	private String  password;
	private String destination;
	public Long getGuestId() {
		return guestId;
	}
	public void setGuestId(Long guestId) {
		this.guestId = guestId;
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
	public Guest(Long guestId, String password, String destination) {
		super();
		this.guestId = guestId;
		this.password = password;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", password=" + password + ", destination=" + destination + "]";
	}
	
	
	

}
