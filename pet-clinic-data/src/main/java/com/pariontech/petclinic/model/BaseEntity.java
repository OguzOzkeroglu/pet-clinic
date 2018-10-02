package com.pariontech.petclinic.model;

import java.io.Serializable;

/**
 * @author oguz
 *
 * Created on 2018.10.02
 */

public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1829631081947666503L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
