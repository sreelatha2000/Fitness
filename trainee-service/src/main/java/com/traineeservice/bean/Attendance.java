package com.traineeservice.bean;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class Attendance {
//	 @NotNull(message = "Count is required")
	private Long id;
//	@NotEmpty(message = "Name is required")
	private String name;

	private Date date;

	private String status;

	private String feedback;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", name=" + name + ", date=" + date + ", status=" + status + ", feedback="
				+ feedback + "]";
	}

	public Attendance(Long id, String name, Date date, String status, String feedback) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.status = status;
		this.feedback = feedback;
	}
    
}
