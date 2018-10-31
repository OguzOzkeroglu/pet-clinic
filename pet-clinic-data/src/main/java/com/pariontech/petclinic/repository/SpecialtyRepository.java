package com.pariontech.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.pariontech.petclinic.model.Specialty;

/**
 * @author oguz, created on 2018.10.31
 *
 */

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
