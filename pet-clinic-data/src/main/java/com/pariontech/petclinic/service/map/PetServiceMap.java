package com.pariontech.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Pet;
import com.pariontech.petclinic.service.PetService;

/**
 * @author oguz, created on 2018.10.03
 *
 */

@Service
public class PetServiceMap extends AbsMapService<Pet, Long> implements PetService {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object);
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
