package com.solarsystem.Controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.solarsystem.service.MyPlanetListservice;
@Controller
public class MyplanetControllor {
	@Autowired
	private MyPlanetListservice service;
	@GetMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/My_planet";
		
	}

}
