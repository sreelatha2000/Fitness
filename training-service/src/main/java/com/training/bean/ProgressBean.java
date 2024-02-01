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
public class ProgressBean {

	private Long userId;
	
	private Date date;
	
	private Double weight;
	
	private Double fitnessTestResults;


  
}
