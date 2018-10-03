package com.pariontech.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oguz, created on 2018.10.04
 *
 */

@Controller
public class IndexController {
	
	@RequestMapping({"", "/", "index", "index.html"})
	public String index () {
		return "index";
	}
}
