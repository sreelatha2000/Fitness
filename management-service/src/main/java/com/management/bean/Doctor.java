package com.management.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
@Setter
@Getter
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Doctor
{
	private Long doctorId;
	private String doctorName;
	private Integer yearOfExperience;
	private String contactNumber;
	private String shiftTimings;
	private String specialization;
	private String gender;
	
	

}
