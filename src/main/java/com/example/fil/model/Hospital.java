package com.example.fil.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {
	 
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Id
	private int id;
	  private String name;
	  private String city;
	  private double rating;
	  
	 

	}
