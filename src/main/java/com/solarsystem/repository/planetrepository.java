package com.solarsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solarsystem.entity.planet;
@Repository
public interface planetrepository extends JpaRepository<planet,Integer> {
	
	

}
