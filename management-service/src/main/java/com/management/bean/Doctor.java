package com.management.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
public class Doctor
{
	private Long id;
	private String doctorName;
	private Integer yearOfExperience;
	private String contactNumber;
	private String shiftTimings;
	private String specialization;
	private String gender;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Integer getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(Integer yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getShiftTimings() {
		return shiftTimings;
	}
	public void setShiftTimings(String shiftTimings) {
		this.shiftTimings = shiftTimings;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + ", yearOfExperience=" + yearOfExperience
				+ ", contactNumber=" + contactNumber + ", shiftTimings=" + shiftTimings + ", specialization="
				+ specialization + ", gender=" + gender + "]";
	}
	public Doctor(Long id, String doctorName, Integer yearOfExperience, String contactNumber, String shiftTimings,
			String specialization, String gender) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.yearOfExperience = yearOfExperience;
		this.contactNumber = contactNumber;
		this.shiftTimings = shiftTimings;
		this.specialization = specialization;
		this.gender = gender;
	}
	
	

}
