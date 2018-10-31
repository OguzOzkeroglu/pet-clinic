package com.pariontech.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author oguz, created on 2018.10.09
 *
 */

@Entity
@Table(name = "specialty")
public class Specialty extends BaseEntity {
	private static final long serialVersionUID = 8963758352356822528L;

	@Column(name = "description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
