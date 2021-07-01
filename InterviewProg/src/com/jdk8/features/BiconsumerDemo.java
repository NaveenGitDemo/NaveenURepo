package com.jdk8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

;

class Employee{
	
	public String name;
	public double salary;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
}


public class BiconsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("naveen", 2000.0));
		l.add(new Employee("BholeNath",1000.0));
		
		BiConsumer<Employee,Double> b=(e,d) -> e.salary=e.salary+d ;
		 
		 
		for(Employee e : l) {
			
			b.accept(e, 500.0);
		}
		
		// now display list of employees with 500.0 plus salary
		/*
		 * for(Employee e1 : l) { System.out.println("Employee name is "+e1.name +
		 * 
		 * " Employee salary is  "+e1.salary); }
		 */
		l.forEach(e1->System.out.println("Employee name is "+e1.name + " Employee salary is  "+e1.salary));
		
		
	}

}
