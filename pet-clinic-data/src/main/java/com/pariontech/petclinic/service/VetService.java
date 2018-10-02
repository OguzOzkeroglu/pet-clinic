package com.pariontech.petclinic.service;

import java.util.Set;

import com.pariontech.petclinic.model.Vet;

/**
 * @author oguz
 *
 * Created on 2018.10.02
 */

public interface VetService {
	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
