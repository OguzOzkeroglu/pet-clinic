package com.pariontech.petclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Visit;
import com.pariontech.petclinic.repository.VisitRepository;
import com.pariontech.petclinic.service.VisitService;

/**
 * @author oguz, created on 2018.11.03
 *
 */

@Service
@Profile("jpa_profile")
public class VisitServiceJpa implements VisitService {
	private final VisitRepository visitRepository;

	public VisitServiceJpa(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();

		visitRepository.findAll().forEach(visits::add);

		return visits;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
	}
}
