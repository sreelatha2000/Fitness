package com.healthservice.entity;

import org.slf4j.Logger;
import org.springframework.web.client.RestTemplate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
public class Nutrition {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer nutritionId;
	private String foodItem;
	private String caloriesToBeconsumed;
	private String proteinToBeconsumed;
	private String carbohydratesToBeconsumed;
	private String fatsToBeconsumed;
	private String fiberToBeconsumed;
	private String vitaminsAndMineralsToBeconsumed;
	private String sugarToBeconsumed;
	private String sodiumToBeconsumed;
}
