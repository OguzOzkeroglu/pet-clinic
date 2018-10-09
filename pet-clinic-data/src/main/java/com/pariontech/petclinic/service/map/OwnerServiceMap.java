package com.pariontech.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.pariontech.petclinic.model.Owner;
import com.pariontech.petclinic.model.Pet;
import com.pariontech.petclinic.service.OwnerService;
import com.pariontech.petclinic.service.PetService;
import com.pariontech.petclinic.service.PetTypeService;

/**
 * @author oguz, created on 2018.10.03
 *
 */

@Service
public class OwnerServiceMap extends AbsMapService<Owner, Long> implements OwnerService {
	private final PetTypeService petTypeService;
	private final PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
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
	public Owner save(Owner object) {
		if (object == null) {
			return null;
		}

		if (object.getPets() != null) {
			object.getPets().forEach(pet -> {
				if (pet.getPetType() != null) {
					if (pet.getPetType().getId() == null) {
						pet.setPetType(petTypeService.save(pet.getPetType()));
					}
				} else {
					throw new RuntimeException("Pet type is required.");
				}

				if (pet.getId() == null) {
					Pet savedPet = petService.save(pet);
					pet.setId(savedPet.getId());
				}
			});
		}
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
}
