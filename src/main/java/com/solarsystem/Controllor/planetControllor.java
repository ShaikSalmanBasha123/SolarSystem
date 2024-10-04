package com.solarsystem.Controllor;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.solarsystem.entity.MyPlanetList;
import com.solarsystem.entity.planet;
import com.solarsystem.service.MyPlanetListservice;
import com.solarsystem.service.planetservice;

import ch.qos.logback.core.model.Model;

@Controller
public class planetControllor {
	@Autowired
	private planetservice  service;
	@Autowired 
	private MyPlanetListservice myplanetservice;
       @GetMapping("/")
       public String home(){
    	   return "home";
}		@GetMapping("/planet_regester")
       	public String planetregester() {
       		return "planetregester";
       	}
		@GetMapping("/avalible_planets")
		public ModelAndView getallplanets() {
			List<planet> list=service.getallplanets();
			ModelAndView mv=new ModelAndView();
			mv.addObject("planet",list);
			mv.setViewName("planetlist");
			return mv;
				}
		@PostMapping("/save")
		public String addplanet(@ModelAttribute planet p) {
			service.Save(p);
			return "redirect:/available_planet";
		}
		@GetMapping("/My_Planets")
		public String getMyPlanets(Model model) {
			List<MyPlanetList>list=myplanetservice.getAllMyPlanet();
			//model.addAttribute("planet" list);
			return "Myplanets";
		}
		
		@RequestMapping("/mylist/{id}")
		public String getmylist(@PathVariable("id")int id) {
			planet p=service.getplanetById(id);
			MyPlanetList mp=new MyPlanetList(p.getId(),p.getName(),p.getDistancefromsun(),p.getSize()) ;
			myplanetservice.save(mp);
			return"redirect:/my_planet";
		}
		@RequestMapping("/editPlanet/{id}")
		public String editPlanet(@PathVariable("id")int id,Model model) {
		planet p=service.getplanetById(id);
		//model.addAttribute("planet",p);
		return "planetedit";
}
		@RequestMapping("/deletePlanet/{id}")
		public String deletePlanet(@PathVariable("id")int id) {
			service.deleteById(id);
			return "redirect:/avilable_planets";
		}
		
}



