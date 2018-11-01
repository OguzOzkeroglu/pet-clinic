package com.pariontech.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Owner;
import com.pariontech.petclinic.repository.OwnerRepository;
import com.pariontech.petclinic.service.OwnerService;

/**
 * @author oguz, created on 2018.10.31
 *
 */

@Service
@Profile("jpa_profile")
public class OwnerServiceJpa implements OwnerService {
	private final OwnerRepository ownerRepository;
	// private final PetRepository petRepository;
	// private final PetTypeRepository petTypeRepository;

	// public OwnerServiceJpa(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
	// this.ownerRepository = ownerRepository;
	// this.petRepository = petRepository;
	// this.petTypeRepository = petTypeRepository;
	// }

	public OwnerServiceJpa(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		// if presents return owner, else return null
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}
}
