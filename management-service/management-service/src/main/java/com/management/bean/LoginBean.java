package com.management.bean;

public class LoginBean {
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	LoginBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	

}
