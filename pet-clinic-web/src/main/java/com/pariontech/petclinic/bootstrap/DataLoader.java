package com.pariontech.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pariontech.petclinic.model.Owner;
import com.pariontech.petclinic.model.Vet;
import com.pariontech.petclinic.service.OwnerService;
import com.pariontech.petclinic.service.VetService;

/**
 * @author oguz, created on 2018.10.04
 *
 */

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Oguz");
		owner1.setLastName("Ozkeroglu");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Mark");
		owner2.setLastName("Knopfler");

		ownerService.save(owner2);

		System.out.println("Loaded owners...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Ozzy");
		vet1.setLastName("Osbourne");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Rob");
		vet2.setLastName("Halford");

		vetService.save(vet2);

		System.out.println("Loaded vets...");

		System.out.println(ownerService.findAll());
		System.out.println(vetService.findAll());
	}
}
