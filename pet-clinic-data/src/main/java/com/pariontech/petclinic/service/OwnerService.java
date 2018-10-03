package com.pariontech.petclinic.service;

import com.pariontech.petclinic.model.Owner;

/**
 * @author oguz, created on 2018.10.02
 */

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
