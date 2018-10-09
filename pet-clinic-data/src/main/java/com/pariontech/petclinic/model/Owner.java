package com.pariontech.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author oguz, created on 2018.10.1
 *
 */

public class Owner extends Person {
	private static final long serialVersionUID = -3159864440217645540L;

	private String address;
	private String city;
	private String telephone;
	private Set<Pet> pets = new HashSet<>();

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}
