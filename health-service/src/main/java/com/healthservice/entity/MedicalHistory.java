package com.healthservice.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity
@Getter
@Setter
public class MedicalHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
