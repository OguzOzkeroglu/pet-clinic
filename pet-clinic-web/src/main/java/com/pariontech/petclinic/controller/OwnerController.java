package com.pariontech.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oguz, created on 2018.10.04
 *
 */

@Controller
@RequestMapping("/owners")
public class OwnerController {
	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listOwners() {
		return "owners/index";
	}
}
