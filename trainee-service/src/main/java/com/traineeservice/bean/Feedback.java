package com.traineeservice.bean;

import java.sql.Date;

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
public class Feedback {
	@NotNull(message = "id is required")	
	private Long feedbackId;

	private String text;

	private Date date;

	private Integer rating;

	public Long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", text=" + text + ", date=" + date + ", rating=" + rating + "]";
	}

	public Feedback(@NotNull(message = "id is required") Long feedbackId, String text, Date date, Integer rating) {
		super();
		this.feedbackId = feedbackId;
		this.text = text;
		this.date = date;
		this.rating = rating;
	}

//	private Long profileId;
	
}
