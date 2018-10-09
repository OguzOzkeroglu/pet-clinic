package com.pariontech.petclinic.model;

/**
 * @author oguz, created on 2018.10.09
 *
 */

public class Specialty extends BaseEntity {
	private static final long serialVersionUID = 8963758352356822528L;

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
