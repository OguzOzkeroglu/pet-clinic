package com.pariontech.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Specialty;
import com.pariontech.petclinic.repository.SpecialtyRepository;
import com.pariontech.petclinic.service.SpecialtyService;

/**
 * @author oguz, created on 2018.11.01
 *
 */

@Service
@Profile("jpa_profile")
public class SpecialtyServiceJpa implements SpecialtyService {
	private final SpecialtyRepository specialtyRepository;

	public SpecialtyServiceJpa(SpecialtyRepository specialtyRepository) {
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Specialty> findAll() {
		Set<Specialty> specialties = new HashSet<>();
		specialtyRepository.findAll().forEach(specialties::add);
		return specialties;
	}

	@Override
	public Specialty findById(Long id) {
		return specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public Specialty save(Specialty object) {
		return specialtyRepository.save(object);
	}

	@Override
	public void delete(Specialty object) {
		specialtyRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		specialtyRepository.deleteById(id);
	}
}
