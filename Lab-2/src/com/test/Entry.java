package com.test;

import static java.lang.System.out;

class Entry{
	
	
	public static void main(String[] args){
		out.println("Employee details");
		
		Employee e = null;
		Date d=null;
	//	e = new Employee();
	//	e.displayDetails();
		 d=new Date(22,10,1995);
//	 d.Date(22,10,1995);
		e = new Employee("BHARATH","BANTU",22344,"A",d);
		e.displayDetails();
//		d.Date(22,10,2016);
		d=new Date(22,10,1995);
               e = new Employee("MAHIDHER","THUMMAL",22344,"A",d);
	       e.displayDetails();
	       d=new Date(22,10,2015);
               e = new Employee("CHAI","PULLALA",22344,"A",d);
		e.displayDetails();
		d=new Date(22,10,2014);
e = new Employee("MAHI","SHOW",22344,"A",d);
		e.displayDetails();
		
		
		
	}
	
	
}







