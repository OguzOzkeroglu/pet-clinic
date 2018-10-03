package com.pariontech.petclinic.service;

import java.util.Set;

/**
 * @author oguz, created on 2018.10.03
 *
 */

public interface CrudService<T, ID> {
	Set<T> findAll();

	T findById(ID id);

	T save(T object);

	void delete(T object);

	void deleteById(ID id);
}