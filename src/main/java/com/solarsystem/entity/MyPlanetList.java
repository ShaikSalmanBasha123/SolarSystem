package com.solarsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Myplanet")
public class MyPlanetList {
	@Id
		private int id;
	private String name;
	private long distancefromsun;
	private String size;
	public MyPlanetList(int id, String name, long distancefromsun, String size) {
		super();
		this.id = id;
		this.name = name;
		this.distancefromsun = distancefromsun;
		this.size = size;
	}
	public MyPlanetList() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDistancefromsun() {
		return distancefromsun;
	}
	public void setDistancefromsun(long distancefromsun) {
		this.distancefromsun = distancefromsun;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
