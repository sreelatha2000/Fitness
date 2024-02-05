package com.management.bean;

import java.util.Date;

public class User {
	private Long userId;
	private String userName;
	private String password;
	private Date dob;
	private Integer age;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", dob=" + dob
				+ ", age=" + age + "]";
	}
	public User(Long userId, String userName, String password, Date dob, Integer age) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		this.age = age;
	}
	
   
}
