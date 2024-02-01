package com.management.bean;

import jakarta.persistence.Column;

public class Membership {
	private Long id;
	private String type;
	private String period;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Membership [id=" + id + ", type=" + type + ", period=" + period + ", description=" + description + "]";
	}
	public Membership(Long id, String type, String period, String description) {
		super();
		this.id = id;
		this.type = type;
		this.period = period;
		this.description = description;
	}
	
   
}
