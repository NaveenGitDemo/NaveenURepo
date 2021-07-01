package com.pack;

import java.util.ArrayList;
import java.util.function.BiPredicate;


public class Prime {

	
	static int number=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           boolean flag=false;
		for(int i=2;i<=number/2;i++) {
			
			if(number%i == 0) {
				flag=true;
				System.out.println("Number is prime :"+number);
				break;
			}
			
		}if(flag == false) {
			System.out.println("Number is not prime :"+number);
			 
			}
		
		ArrayList<Integer> primelist= new ArrayList<>();
		BiPredicate<Integer, Integer> p=(data,i) -> data%i==0;
		ArrayList<Integer> intlist= new ArrayList<>();
		intlist.add(10);
		intlist.add(3);
		intlist.add(20);
		intlist.add(25);
		intlist.add(5);
		
		// checking which data is prime or which is not
		boolean b;
		for(Integer l : intlist) {
			     b=false;
			for(int i=2;i<=l/2;i++) {
				
				 if(p.test(l, i)) {
					 b=true;
					 primelist.add(l);
					 break;
				 }
				}
			if(b==false) {
				System.out.println("list  not prime data is  :"+l);
			}
		}
	
		primelist.forEach(plist -> System.out.println("list prime data is :"+plist));
	
	}

}
