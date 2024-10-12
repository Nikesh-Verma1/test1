package com.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class ApplicationController {

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap modelMap) {

		modelMap.addAttribute("msg", "Welcome to FullStackJavaDeveloper");
		return "welcome";
	}

	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public String sayService(ModelMap modelMap) {
		modelMap.addAttribute("msg", "Software Development Services");
		return "home";
	}

	@RequestMapping(value= "/address",method =RequestMethod.GET)
	public String sayAddress(ModelMap modelMap) {
		modelMap.addAttribute("msg","INSPIRIAA MALL | PUNE | MH | INDIA");
		return "home";

	}
}
