package com.solarsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.solarsystem.entity.planet;
import com.solarsystem.repository.planetrepository;

public class planetservice {
	@Autowired
	private planetrepository prepo;
	
	public void Save(planet p){
		 prepo.save(p);
	}
	public List<planet> getallplanets() {
		return prepo.findAll();
	}
	public planet getplanetById(int id) {
		return prepo.findById(id).get();
	}
public void deleteById(int id) {
	prepo.deleteById(id);
}
}
