package com.training.bean;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProgressBean {

	private Long userId;
	
	private Date date;
	
	private Double weight;
	
	private Double fitnessTestResults;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getFitnessTestResults() {
		return fitnessTestResults;
	}

	public void setFitnessTestResults(Double fitnessTestResults) {
		this.fitnessTestResults = fitnessTestResults;
	}

	@Override
	public String toString() {
		return "ProgressBean [userId=" + userId + ", date=" + date + ", weight=" + weight + ", fitnessTestResults="
				+ fitnessTestResults + "]";
	}

	public ProgressBean(Long userId, Date date, Double weight, Double fitnessTestResults) {
		super();
		this.userId = userId;
		this.date = date;
		this.weight = weight;
		this.fitnessTestResults = fitnessTestResults;
	}
  
}
