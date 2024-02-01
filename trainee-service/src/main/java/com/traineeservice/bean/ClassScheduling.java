package com.traineeservice.bean;

import java.sql.Date;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClassScheduling {
	// @NotNull(message = "Count is required")
	private Long classId;
	//@NotEmpty(message = "Name is required")
	private String className;

	private Date date;

	private Integer enrolled;

	private String duration;

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(Integer enrolled) {
		this.enrolled = enrolled;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ClassScheduling [classId=" + classId + ", className=" + className + ", date=" + date + ", enrolled="
				+ enrolled + ", duration=" + duration + "]";
	}

	public ClassScheduling(Long classId, String className, Date date, Integer enrolled, String duration) {
		super();
		this.classId = classId;
		this.className = className;
		this.date = date;
		this.enrolled = enrolled;
		this.duration = duration;
	}

	// private Long trainerId;

}
