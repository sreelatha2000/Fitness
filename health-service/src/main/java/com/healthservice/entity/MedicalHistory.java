package com.healthservice.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@Entity
public class MedicalHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberId;
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
