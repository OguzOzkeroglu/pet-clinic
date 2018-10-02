package com.pariontech.petclinic.model;

import java.time.LocalDate;

/**
 * @author oguz
 * Created on 2018.10.1
 *
 */

public class Pet extends BaseEntity {
	private static final long serialVersionUID = -8261459145335477585L;
	
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
