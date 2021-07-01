package com.jdk8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> aar= new ArrayList<>();
		aar.add(10);
		aar.add(35);
		aar.add(20);
		aar.add(70);
		
		long count= aar.stream().count();
		
		List<Integer> list=aar.stream().filter( l -> l%2==0 ).collect(Collectors.toList());
		List<Integer> list1	= aar.stream().sorted( (l1,l2) -> -l1.compareTo(l2)).collect(Collectors.toList());
		System.out.println("descending order sorted list "+list1);
		Set<Integer> set=aar.stream().filter(n -> n%2 ==0).collect(Collectors.toSet());
	    System.out.println(set);
		System.out.println(" even number in list is " + list);
		System.out.println(count);
		
		Function<Integer, Integer> f = a -> a+30 ;
		
		for( Integer  o : aar) {
			
			o = f.apply(o);
			System.out.println(" after apply function " + o);
		}

	}

}
