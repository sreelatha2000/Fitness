package com.training.bean;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class WorkoutBean {

	private Date workoutDate;

	private String duration;
	
	private String caloriesBurned;
	
	private String note;
	
	private Long userId;

	public Date getWorkoutDate() {
		return workoutDate;
	}

	public void setWorkoutDate(Date workoutDate) {
		this.workoutDate = workoutDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCaloriesBurned() {
		return caloriesBurned;
	}

	public void setCaloriesBurned(String caloriesBurned) {
		this.caloriesBurned = caloriesBurned;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "WorkoutBean [workoutDate=" + workoutDate + ", duration=" + duration + ", caloriesBurned="
				+ caloriesBurned + ", note=" + note + ", userId=" + userId + "]";
	}

	public WorkoutBean(Date workoutDate, String duration, String caloriesBurned, String note, Long userId) {
		super();
		this.workoutDate = workoutDate;
		this.duration = duration;
		this.caloriesBurned = caloriesBurned;
		this.note = note;
		this.userId = userId;
	}

}
