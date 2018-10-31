package com.pariontech.petclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author oguz, created on 2018.10.1
 *
 */

@MappedSuperclass
public class Person extends BaseEntity {
	private static final long serialVersionUID = 4229493296526926956L;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", getId()=" + getId() + "]";
	}
}