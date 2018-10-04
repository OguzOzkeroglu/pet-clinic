package com.pariontech.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pariontech.petclinic.service.OwnerService;

/**
 * @author oguz, created on 2018.10.04
 *
 */

@Controller
@RequestMapping("/owners")
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listOwners(Model model) {

		model.addAttribute("owners", ownerService.findAll());

		return "owners/index";
	}
}
