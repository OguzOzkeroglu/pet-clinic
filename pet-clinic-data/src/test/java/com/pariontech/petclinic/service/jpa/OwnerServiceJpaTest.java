package com.pariontech.petclinic.service.jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pariontech.petclinic.model.Owner;
import com.pariontech.petclinic.repository.OwnerRepository;

/**
 * @author oguz, created on 2018.11.10
 *
 */
@ExtendWith(MockitoExtension.class)
class OwnerServiceJpaTest {
	@Mock
	OwnerRepository ownerRepository;

	@InjectMocks
	OwnerServiceJpa ownerService;

	final Long ownerId = 1L;
	final String lastName = "Ozkeroglu";
	Owner returnOwner;

	@BeforeEach
	void setUp() throws Exception {
		returnOwner = new Owner();
		returnOwner.setId(ownerId);
		returnOwner.setLastName(lastName);
	}

	@Test
	void testFindAll() {
		Set<Owner> returnOwnersSet = new HashSet<>();

		Owner owner1 = new Owner();
		owner1.setId(1L);

		Owner owner2 = new Owner();
		owner2.setId(2L);

		returnOwnersSet.add(owner1);
		returnOwnersSet.add(owner2);

		when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

		Set<Owner> owners = ownerService.findAll();

		assertNotNull(owners);
		assertEquals(2, owners.size());
	}

	@Test
	void testFindById() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

		Owner owner = ownerService.findById(ownerId);

		assertNotNull(owner);
		assertEquals(ownerId, owner.getId());
	}

	@Test
	void testSave() {
		Long id = 2L;
		Owner ownerToSave = new Owner();
		ownerToSave.setId(id);

		when(ownerRepository.save(any())).thenReturn(returnOwner);

		Owner owner = ownerService.save(ownerToSave);
		assertNotNull(owner);

		verify(ownerRepository).save(any());
	}

	@Test
	void testDelete() {
		ownerService.delete(returnOwner);

		// default is 1 times
		verify(ownerRepository, times(1)).delete(any());
	}

	@Test
	void testDeleteById() {
		ownerService.deleteById(ownerId);

		verify(ownerRepository).deleteById(anyLong());
	}

	@Test
	void testFindByLastName() {
		when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

		Owner owner = ownerService.findByLastName(lastName);

		assertNotNull(owner);
		assertEquals(ownerId, owner.getId());
		assertEquals(lastName, owner.getLastName());

		verify(ownerRepository).findByLastName(any());
	}
}
