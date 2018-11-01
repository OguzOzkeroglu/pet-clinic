package com.pariontech.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Pet;
import com.pariontech.petclinic.repository.PetRepository;
import com.pariontech.petclinic.service.PetService;

/**
 * @author oguz, created on 2018.11.01
 *
 */

@Service
@Profile("jpa_profile")
public class PetServiceJpa implements PetService {
	private final PetRepository petRepository;

	public PetServiceJpa(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet object) {
		return petRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		petRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}
}
