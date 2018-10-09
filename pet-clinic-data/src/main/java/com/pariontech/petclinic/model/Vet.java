package com.pariontech.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author oguz, created on 2018.10.1
 *
 */

public class Vet extends Person {
	private static final long serialVersionUID = 2441228888599339876L;

	private Set<Specialty> specialities = new HashSet<>();

	public Set<Specialty> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Specialty> specialities) {
		this.specialities = specialities;
	}
}
