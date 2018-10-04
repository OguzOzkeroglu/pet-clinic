package com.pariontech.petclinic.model;

/**
 * @author oguz
 * Created on 2018.10.1
 *
 */

public class Person extends BaseEntity {
	private static final long serialVersionUID = 4229493296526926956L;
	
	private String firstName;
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