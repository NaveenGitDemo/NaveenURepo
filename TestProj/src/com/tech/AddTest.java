package com.tech;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Employee{
	
	
  public String name;
  public Integer salary;
   public Employee(String name,Integer salary ) {
	   this.name=name;
	   this.salary=salary;
   }
	
}


public class AddTest {

	// add two numbers
	
			int value1,value2,result;
			
			public int add(int value1, int value2) {
				result = value1 + value2;
				return result;
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddTest t= new AddTest();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number ===");
		try {
		int a=s.nextInt();
		System.out.println("enter a number ====");
		int b=s.nextInt();
		
		System.out.println(" addition is  " +t.add(a, b));
		
		}catch(InputMismatchException ime) {
			System.out.println(" Please enter integer value ");
		}
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.forEach(System.out :: println);
		
		List<Employee> elist=new ArrayList<>();
		elist.add(new Employee("ram", 2000));
		elist.add(new Employee("krishn", 40000));
		
		elist.forEach(e ->System.out.println(e.name +  "  salary  " +e.salary));
		// number formate exception
		System.out.println("enter number");
  String s1="20.0";
   try {
     int ii=Integer.parseInt(s1); 
   }catch(NumberFormatException nfe) {
	   System.out.println("please enter integer value ");
   }
	}

}
