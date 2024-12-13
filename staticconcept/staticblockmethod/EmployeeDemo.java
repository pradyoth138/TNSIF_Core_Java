package com.tnsif.staticconcept.staticblockmethod;

public class EmployeeDemo {

	public static void main(String[] args) {
	Employee e=new Employee("Srihari",101);
    System.out.println(e);
    
    Employee e1=new Employee("vinay",105);
    System.out.println(e1);
    
    System.out.println(Employee.ecompany);
    
    e1.ecompany="Ather";
    System.out.println(e1);
    System.out.println(e);
    
    Employee e2=new Employee("Prajwal",103);
    System.out.println(e2);
    
    System.out.println(Employee.ecompany);
    
	}

}
