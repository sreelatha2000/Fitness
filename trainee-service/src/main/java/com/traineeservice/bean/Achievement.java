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
public class Achievement {
//	@NotNull(message="id is required")
	private Long id;

	private String achievementType;

	private Date dateCompleted;

	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAchievementType() {
		return achievementType;
	}

	public void setAchievementType(String achievementType) {
		this.achievementType = achievementType;
	}

	public Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Achievement [id=" + id + ", achievementType=" + achievementType + ", dateCompleted=" + dateCompleted
				+ ", description=" + description + "]";
	}

	public Achievement(Long id, String achievementType, Date dateCompleted, String description) {
		super();
		this.id = id;
		this.achievementType = achievementType;
		this.dateCompleted = dateCompleted;
		this.description = description;
	}
    
}
