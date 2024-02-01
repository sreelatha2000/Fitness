package com.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="guest_table")
public class Guest 
{
	private static final Long serialVersionUID = -1516965327693370237L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="guest_id")
	private Long guestId;
	@Column(name="password")
	private String  password;
	@Column(name="destination")
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
	
	
	
}
