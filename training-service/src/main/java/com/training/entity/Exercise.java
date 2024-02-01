package com.training.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="exercise")
public class Exercise implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="exercise_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long exerciseId;
	
	@Column(name="exercise_name")
	private String exerciseName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="exercise_type")
	private String exerciseType;
	
	@Column(name="number_of_sets")
	private Integer numberOfSets;
	
	@Column(name="equipment_needed")
	private String equipmentNeeded;
	
	@Column(name="intensity_level")
	private String intensityLevel;

	public Long getExerciseId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
