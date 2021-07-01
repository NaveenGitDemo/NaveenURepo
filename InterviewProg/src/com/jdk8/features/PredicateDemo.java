package com.jdk8.features;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {
	
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a number ");
		
		Integer value= s.nextInt();
		
		Predicate<Integer> p= a -> a%2 ==0;
		if(p.test(value)) {
		System.out.println(" Number is even " +p.test(value));
		}
		else {
			System.out.println("Number is odd "+p.test(value));
		}
		Boolean b= (p.test(value)==true)?true:false;
		
		System.out.println(b);
	}

}
