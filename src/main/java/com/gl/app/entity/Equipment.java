package com.gl.app.entity;

import java.util.Date;

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
@lombok.ToString
@lombok.EqualsAndHashCode
@lombok.Getter
@lombok.Setter
public class Equipment {
	int equipmentId;
	String type;
	String brand;
	String model;
	public int rentAmount;
	Date dateAvailability;
	
	public Equipment(String type, String brand, String model, int rentAmount,Date availability) {
		super();
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.rentAmount = rentAmount;
		this.dateAvailability = availability;
	}
	
}
