package com.pariontech.petclinic.service.map;

import java.util.Set;

import com.pariontech.petclinic.model.Owner;
import com.pariontech.petclinic.service.CrudService;

/**
 * @author oguz, created on 2018.10.03
 *
 */

public class OwnerServiceMap extends AbsMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Long id, Owner object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
}
