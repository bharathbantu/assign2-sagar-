package com.ct;

public class Country {
public Country() {
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
private String name;
private City city;
}
