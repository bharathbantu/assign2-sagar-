package com.ct;

public class Entry1 {
public static void main(String[] args) {
	String[] ename = {"chai", "bharath", "mahidhar", "charan baba", "bantu"};	
	String[] countryname = {"india", "INDIA", "thailand", "world", "DUBAI"};	
	String[] cityNames = {"hyd", "pune", "bangkok", "world", "dubai"};	
	String[] linename = {"SR NAGAR", "talwade", "Pattaya", "Baba mandhir", "bhurj kahlifa"};
	City[] city = new City[5];
    Country[] country = new Country[5];
    Address[] address = new Address[5];
    Employee[] e = new Employee[5];
    
    for(int i=0;i <5;i++)
    {
    city[i] = new City();
    city[i].setName(cityNames[i]);
    country[i]= new Country();
    country[i].setName(countryname[i]);
    country[i].setCity(city[i]);
    address[i] = new Address();
    address[i].setLine(linename[i]);
    address[i].setCountry(country[i]);
    e[i] = new Employee();
    e[i].setName(ename[i]);
    e[i].setAddress(address[i]);
    }
   for(int j=0;j<5;j++)
   {
	System.out.println("Name:" + e[j].getName());
	System.out.println("Address:" + e[j].getAddress().getLine());
	System.out.println("Country:" + e[j].getAddress().getCountry().getName());
	System.out.println("City:" +e[j].getAddress().getCountry().getCity().getName());	
	System.out.println("------------------------------------------------------");
   }
   }
}	
