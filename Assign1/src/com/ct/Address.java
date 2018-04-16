package com.ct;

public class Address {
public Address(){
	
}
public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
private String line;
private Country country;
}
