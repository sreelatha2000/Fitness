package com.management.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@Table(name="trainer_profile")
public class Trainer implements Serializable {
	private static final Long serialVersionUID = -1516965327693370237L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trainer_id")
	private Long trainerId;
	@Column(name="trainer_name")
	private String name;
	@Column(name="age")
	private String age;
	@Column(name="year_of_experience")
	private Integer yearOfExperience;
	@Column(name="shift_timings")
	private String shiftTimings;
	@Column(name="certification")
	private String certification;
	@Column(name="contact_No")
	private String contactNumber;
	


}
