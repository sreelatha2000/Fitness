package com.management.bean;

import jakarta.persistence.Column;

public class Trainer {
	private Long trainerId;
	private String name;
	private String age;
	private Integer yearOfExperience;
	private String shiftTimings;
	private String certification;
	private String contactNumber;
	public Long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Integer getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(Integer yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getShiftTimings() {
		return shiftTimings;
	}
	public void setShiftTimings(String shiftTimings) {
		this.shiftTimings = shiftTimings;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", name=" + name + ", age=" + age + ", yearOfExperience="
				+ yearOfExperience + ", shiftTimings=" + shiftTimings + ", certification=" + certification
				+ ", contactNumber=" + contactNumber + "]";
	}
	public Trainer(Long trainerId, String name, String age, Integer yearOfExperience, String shiftTimings,
			String certification, String contactNumber) {
		super();
		this.trainerId = trainerId;
		this.name = name;
		this.age = age;
		this.yearOfExperience = yearOfExperience;
		this.shiftTimings = shiftTimings;
		this.certification = certification;
		this.contactNumber = contactNumber;
	}
    
	

}
