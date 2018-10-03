package com.pariontech.petclinic.service.map;

import java.util.Set;

import com.pariontech.petclinic.model.Pet;
import com.pariontech.petclinic.service.CrudService;

/**
 * @author oguz, created on 2018.10.03
 *
 */

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Long id, Pet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
}
