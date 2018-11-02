package com.pariontech.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Visit;
import com.pariontech.petclinic.service.VisitService;

/**
 * @author oguz, created on 2018.11.03
 *
 */
@Service
public class VisitServiceMap extends AbsMapService<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit) {
		if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
				|| visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid visit");
		}

		return super.save(visit);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Visit visit) {
		super.delete(visit);
	}
}
