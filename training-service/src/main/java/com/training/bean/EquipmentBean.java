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
public class EquipmentBean {
	
	private String equipmentName;
	
	private String description;
	
	private String brand;

	private Integer quantity;
	
	private Date purchaseDate;

	
	
}
