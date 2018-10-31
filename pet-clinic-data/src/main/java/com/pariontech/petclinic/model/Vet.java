package com.pariontech.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author oguz, created on 2018.10.1
 *
 */

@Entity
@Table(name = "vet")
public class Vet extends Person {
	private static final long serialVersionUID = 2441228888599339876L;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialty", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "specialty_id"))
	private Set<Specialty> specialities = new HashSet<>();

	public Set<Specialty> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Specialty> specialities) {
		this.specialities = specialities;
	}
}
