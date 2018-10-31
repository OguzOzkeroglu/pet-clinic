package com.pariontech.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.pariontech.petclinic.model.Vet;

/**
 * @author oguz, created on 2018.10.31
 *
 */

public interface VetRepository extends CrudRepository<Vet, Long> {

}
