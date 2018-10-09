package com.pariontech.petclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pariontech.petclinic.model.Owner;
import com.pariontech.petclinic.model.Pet;
import com.pariontech.petclinic.model.PetType;
import com.pariontech.petclinic.model.Specialty;
import com.pariontech.petclinic.model.Vet;
import com.pariontech.petclinic.service.OwnerService;
import com.pariontech.petclinic.service.PetTypeService;
import com.pariontech.petclinic.service.SpecialtyService;
import com.pariontech.petclinic.service.VetService;

/**
 * @author oguz, created on 2018.10.04
 *
 */

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;
	}

	@Override
	public void run(String... args) throws Exception {
		int count = petTypeService.findAll().size();

		if (count == 0) {
			loadData();
		}
	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Oguz");
		owner1.setLastName("Ozkeroglu");
		owner1.setAddress("123, Çanakkale");
		owner1.setCity("Çanakkale");
		owner1.setTelephone("123123123");

		Pet ouzsPet = new Pet();
		ouzsPet.setPetType(savedDogPetType);
		ouzsPet.setOwner(owner1);
		ouzsPet.setBirthDate(LocalDate.now());
		ouzsPet.setName("Abbas");

		owner1.getPets().add(ouzsPet);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Mark");
		owner2.setLastName("Knopfler");
		owner2.setAddress("234, Glasgow");
		owner1.setCity("Glasgow");
		owner1.setTelephone("2344565463");

		Pet marksPet = new Pet();
		marksPet.setPetType(savedCatPetType);
		marksPet.setOwner(owner2);
		marksPet.setBirthDate(LocalDate.now());
		marksPet.setName("Şakir");

		owner2.getPets().add(marksPet);

		ownerService.save(owner2);

		Specialty radiology = new Specialty();
		radiology.setDescription("Radiology");
		Specialty savedRadiology = specialtyService.save(radiology);

		Specialty surgery = new Specialty();
		surgery.setDescription("Surgery");
		Specialty savedSurgery = specialtyService.save(surgery);

		Specialty dentistry = new Specialty();
		dentistry.setDescription("Dentistry");
		Specialty savedDentistry = specialtyService.save(dentistry);

		Vet vet1 = new Vet();
		vet1.setFirstName("Ozzy");
		vet1.setLastName("Osbourne");
		vet1.getSpecialities().add(savedRadiology);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Rob");
		vet2.setLastName("Halford");
		vet2.getSpecialities().add(savedDentistry);
		vet2.getSpecialities().add(savedSurgery);

		vetService.save(vet2);

		System.out.println("Pet Types...");
		System.out.println("Loaded owners...");
		System.out.println("Loaded vets...");

		System.out.println(petTypeService.findAll());
		System.out.println(ownerService.findAll());
		System.out.println(vetService.findAll());
	}
}
