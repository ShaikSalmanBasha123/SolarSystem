package com.solarsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.solarsystem.entity.MyPlanetList;

import com.solarsystem.repository.MyPlanetrepository;


public class MyPlanetListservice {
@Autowired
private MyPlanetrepository myplanet;

public void save(MyPlanetList planet) {
	myplanet.save(planet);
}
public List<MyPlanetList> getAllMyPlanet() {
	return myplanet.findAll();
}
	public void deleteById(int id) {
	myplanet.deleteById(id);
}}               


