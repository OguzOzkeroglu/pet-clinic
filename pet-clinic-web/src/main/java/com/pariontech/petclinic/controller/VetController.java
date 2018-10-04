package com.pariontech.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pariontech.petclinic.service.VetService;

/**
 * @author oguz, created on 2018.10.04
 *
 */

@Controller
@RequestMapping("/vets")
public class VetController {

	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listVets(Model model) {

		model.addAttribute("vets", vetService.findAll());

		return "vets/index";
	}
}
