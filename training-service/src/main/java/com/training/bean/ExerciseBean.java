package com.training.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ExerciseBean {

	private Long exerciseId;
	
	private String exerciseName;

	private String description;

	private String exerciseType;

	private Integer numberOfSets;
	
	private String equipmentNeeded;

}
