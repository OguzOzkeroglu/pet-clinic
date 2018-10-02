package com.pariontech.petclinic.service;

import java.util.Set;

import com.pariontech.petclinic.model.Pet;

/**
 * @author oguz
 *
 * Created on 2018.10.02
 */

public interface PetService {
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
