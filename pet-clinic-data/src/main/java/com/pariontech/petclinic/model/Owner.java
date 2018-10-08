package com.pariontech.petclinic.model;

import java.util.Set;

/**
 * @author oguz Created on 2018.10.1
 *
 */

public class Owner extends Person {

	private static final long serialVersionUID = -3159864440217645540L;

	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}
