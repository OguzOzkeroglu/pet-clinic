package com.pariontech.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Vet;
import com.pariontech.petclinic.repository.VetRepository;
import com.pariontech.petclinic.service.VetService;

/**
 * @author oguz, created on 2018.11.01
 *
 */

@Service
@Profile("jpa_profile")
public class VetServiceJpa implements VetService {
	private final VetRepository vetRepository;

	public VetServiceJpa(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}
}
