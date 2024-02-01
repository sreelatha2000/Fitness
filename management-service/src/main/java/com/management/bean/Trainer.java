package com.management.bean;

import jakarta.persistence.Column;
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
public class Trainer {
	private Long trainerId;
	private String name;
	private String age;
	private Integer yearOfExperience;
	private String shiftTimings;
	private String certification;
	private String contactNumber;

 	

}
