package com.training.bean;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EquipmentBean {
	
	private String equipmentName;
	
	private String description;
	
	private String brand;

	private Integer quantity;
	
	private Date purchaseDate;

	public String getEquipmentName() {
		return equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "EquipmentBean [equipmentName=" + equipmentName + ", description=" + description + ", brand=" + brand
				+ ", quantity=" + quantity + ", purchaseDate=" + purchaseDate + "]";
	}

	public EquipmentBean(String equipmentName, String description, String brand, Integer quantity, Date purchaseDate) {
		super();
		this.equipmentName = equipmentName;
		this.description = description;
		this.brand = brand;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
	}
	
	
	
}
