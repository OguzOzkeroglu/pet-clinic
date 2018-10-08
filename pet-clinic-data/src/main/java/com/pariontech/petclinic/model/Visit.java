package com.pariontech.petclinic.model;

import java.time.LocalDate;

/**
 * @author oguz, created on 2018.10.09
 *
 */

public class Visit extends BaseEntity {
	private static final long serialVersionUID = -4508021040799822609L;

	private LocalDate date;
	private String description;
	private Pet pet;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
