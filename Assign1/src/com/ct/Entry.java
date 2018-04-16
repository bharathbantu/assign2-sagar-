package com.ct;

public class Entry {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setName("chai");
	Address a=new Address();
	a.setLine("1-2-3abcsdcf");
	e.setAddress(a);
	Country c=new Country();
	c.setName("india");
	a.setCountry(c);
	City ci=new City();
	ci.setName("Hyderbad");
	c.setCity(ci);
	System.out.println("Name: " +e.getName());
	System.out.println("Address: " +e.getAddress().getLine());
	System.out.println("Country: " +a.getCountry().getName());
	System.out.println("City: " +c.getCity().getName());
}
}
