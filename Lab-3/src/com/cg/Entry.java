package com.cg;

public class Entry {
public static void main(String[] args) {
	Employee e = new Employee("mahi",20000.00);
	System.out.println("Employee name is "+e.getName()+ " salary is "+e.getSalary());
	
	ContractEmployee c = new ContractEmployee(8);
	
	PermanentEmployee p = new PermanentEmployee("bharath",10000.00);
	PermanentEmployee p1 = new PermanentEmployee("sharath",1000.00);
	
	System.out.println("****permanent employees details******");
	System.out.println( " permanent salary is "+p.getSalary()+ "\n name of permanent employee is "+p.getName());
	System.out.println( " permanent salary is "+p1.getSalary()+ "\n name of permanent employee is "+p1.getName());
	System.out.println(" permanent employee count is "+PermanentEmployee.count);
	Contractor con = new Contractor("pranith",1000.00);
	c.setContractor(con);
	c.getContractor();
	System.out.println("---------------------------------------------------");
	System.out.println("****contract employees details*****");
    System.out.println(" contractEmployee salary is "+c.getSalary()+"\n contractor name is "+con.getName());
    System.out.println("contract employee count is "+ContractEmployee.count);
	
}
}
