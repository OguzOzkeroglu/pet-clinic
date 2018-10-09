package com.pariontech.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Specialty;
import com.pariontech.petclinic.service.SpecialtyService;

/**
 * @author oguz, created on 2018.10.09
 *
 */
@Service
public class SpecialtyServiceMap extends AbsMapService<Specialty, Long> implements SpecialtyService {

	@Override
	public Set<Specialty> findAll() {
		return super.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Specialty save(Specialty object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Specialty object) {
		super.delete(object);
	}
}
