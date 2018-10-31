package com.pariontech.petclinic.repository;

import org.springframework.data.repository.CrudRepository;

import com.pariontech.petclinic.model.Visit;

/**
 * @author oguz, created on 2018.10.31
 *
 */

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
