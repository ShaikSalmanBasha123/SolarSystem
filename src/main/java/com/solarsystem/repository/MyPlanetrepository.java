package com.solarsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solarsystem.entity.MyPlanetList;
import com.solarsystem.service.MyPlanetListservice;

public interface MyPlanetrepository extends JpaRepository<MyPlanetList,Integer>{
	
	

}
