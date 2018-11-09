package com.pariontech.petclinic.service.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pariontech.petclinic.model.Owner;

/**
 * @author oguz, created on 2018.11.09
 *
 */

class OwnerServiceMapTest {
	OwnerServiceMap ownerServiceMap;

	final Long ownerId = 1L;
	final String lastName = "Ozkeroglu";

	@BeforeEach
	void setUp() throws Exception {
		ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());

		Owner owner = new Owner();
		owner.setId(ownerId);
		owner.setLastName(lastName);
		ownerServiceMap.save(owner);
	}

	@Test
	void testFindAll() {
		Set<Owner> owners = ownerServiceMap.findAll();

		assertEquals(1, owners.size());
	}

	@Test
	void testFindByIdLong() {
		Owner owner = ownerServiceMap.findById(ownerId);

		assertEquals(ownerId, owner.getId());
	}

	@Test
	void testSaveOwner() {
		Long id = 2L;
		Owner owner2 = new Owner();
		owner2.setId(id);

		Owner savedOwner = ownerServiceMap.save(owner2);

		assertEquals(id, savedOwner.getId());
	}

	@Test
	void testSaveOwnerNoId() {
		Owner owner3 = new Owner();

		Owner savedOwner = ownerServiceMap.save(owner3);

		assertNotNull(savedOwner);
		assertNotNull(savedOwner.getId());
	}

	@Test
	void testDeleteByIdLong() {
		ownerServiceMap.deleteById(ownerId);

		assertEquals(0, ownerServiceMap.findAll().size());
	}

	@Test
	void testDeleteOwner() {
		ownerServiceMap.delete(ownerServiceMap.findById(ownerId));

		assertEquals(0, ownerServiceMap.findAll().size());
	}

	@Test
	void testFindByLastName() {
		Owner owner = ownerServiceMap.findByLastName(lastName);

		assertNotNull(owner);
		assertEquals(ownerId, owner.getId());
		assertEquals(lastName, owner.getLastName());
	}
	
	@Test
	void testFindByLastNameNotFound() {
		Owner owner = ownerServiceMap.findByLastName("foo");

		assertNull(owner);
	}
}
