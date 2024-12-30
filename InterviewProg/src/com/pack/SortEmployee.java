package com.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	public String name;
	public int id;
	public float salay;
	
	
	public Employee(String name,int id,float salay) {
		this.name=name;
		this.id=id;
		this.salay=salay;
	}
	
	public String toString() {
		
		//String salay;
		return name + " Salary " +salay;
	}
	
}

public class SortEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> ll=new ArrayList();
		ll.add(new Employee("Ram",1,20.11f));
		ll.add(new Employee("Aam",2,20.9f));
		ll.add(new Employee("Krishna",9,20.11f));
		ll.add(new Employee("Ram",3,20.3f));
		
		List<Employee> l=ll.stream().sorted((e1,e2) -> {return (e1.salay>e2.salay)?-1:(e1.salay<e2.salay)?1:0 ;}).collect(Collectors.toList());
		
		List<Employee> l2=ll.stream().sorted((e1,e2) ->  e1.name.compareTo(e2.name)).collect(Collectors.toList());
		
		List<Employee> startsNameWithR=ll.stream().filter(l1 -> l1.name.startsWith("R")).collect(Collectors.toList());
		
		System.out.println(" Employees whose name starts with R : "+startsNameWithR);
		
		List<Employee> sortedEmp =   ll.stream().sorted((e1,e2) -> {
			                if(e1.name.equals(e2.name)) {
			                	return  (e1.salay>e2.salay)?-1:(e1.salay<e2.salay)?1:0;
			                }else {
			                	return  -(e1.name.compareTo(e2.name));
			                }
				   }
		   ).collect(Collectors.toList());
		   
		   System.out.println(" Sorted employee with name and salay "+sortedEmp);
	}

}
