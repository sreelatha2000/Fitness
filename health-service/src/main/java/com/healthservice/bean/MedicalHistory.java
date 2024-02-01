package com.healthservice.bean;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MedicalHistory {

	
	private Long memberId;
	private Date dateOfAssessment;
	private float bloodPressure;
	private float heartRate;
	private String allergies;
	private String medications;
	private String chronicCondition;
	private String familyMedicalHistory;
	private String previousInjuryOrSurgery;
	private float fitnessLevel;
	private Integer physicianContactNumber;
	
}
