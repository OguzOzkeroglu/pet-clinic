package com.pariontech.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author oguz, created on 2018.10.1
 *
 */

@Entity
@Table(name = "type")
public class PetType extends BaseEntity {
	private static final long serialVersionUID = -5008551945214146858L;

	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PetType [name=" + name + ", getId()=" + getId() + "]";
	}
}
