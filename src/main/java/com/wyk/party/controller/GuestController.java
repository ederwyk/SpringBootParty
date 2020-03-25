package com.wyk.party.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wyk.party.model.Guest;
import com.wyk.party.repository.Guests;

@Controller
@RequestMapping("/guests")
public class GuestController {

	@Autowired
	private Guests guests;
	
	@GetMapping
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("Guests");
		modelAndView.addObject("guests", guests.findAll());
		modelAndView.addObject("guest", new Guest());
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Guest guest) {
		guests.save(guest);
		return "redirect:/guests";
	}
}
