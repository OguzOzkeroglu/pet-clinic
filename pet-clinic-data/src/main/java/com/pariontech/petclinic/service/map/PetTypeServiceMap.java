package com.pariontech.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.PetType;
import com.pariontech.petclinic.service.PetTypeService;

/**
 * @author oguz, created on 2018.10.09
 *
 */

@Service
public class PetTypeServiceMap extends AbsMapService<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		return super.save(object);
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
