package com.pariontech.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.pariontech.petclinic.model.PetType;

/**
 * @author oguz, created on 2018.10.31
 *
 */

public interface PetTypeRepository extends CrudRepository<PetType, Long>{

}
