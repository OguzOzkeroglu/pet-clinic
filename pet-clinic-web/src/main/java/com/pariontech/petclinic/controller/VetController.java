package com.pariontech.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oguz, created on 2018.10.04
 *
 */

@Controller
public class VetController {
	
	@RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets () {
		return "vets/index";
	}
}
