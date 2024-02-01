package com.management.bean;

import java.util.Date;

import jakarta.persistence.Column;

public class User {
	private Long id;
	private String userName;
	private String password;
	private Date dob;
	private Integer age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public User(Long id, String userName, String password, Date dob, Integer age) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.dob = dob;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", dob=" + dob + ", age=" + age
				+ "]";
	}
   
}
