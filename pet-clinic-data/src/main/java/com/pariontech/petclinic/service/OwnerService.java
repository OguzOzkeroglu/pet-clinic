package com.pariontech.petclinic.service;

import java.util.Set;

import com.pariontech.petclinic.model.Owner;

/**
 * @author oguz
 *
 *         Created on 2018.10.02
 */

public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
