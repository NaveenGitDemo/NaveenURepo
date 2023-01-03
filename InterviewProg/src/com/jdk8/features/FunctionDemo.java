package com.jdk8.features;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.tools.JavaCompiler;

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

		System.out.println((int)(Math.random()*29));
		
		Supplier<Date> date= () -> new Date();
		Supplier<Integer> d= () -> (int)(Math.random()*10);
		List<String> lpwd=new ArrayList<>();
		      
		       lpwd.add("Kr");
		       lpwd.add("Na");
		       lpwd.add("Up");
		       lpwd.add("Pa");
		       SimpleDateFormat sd=new SimpleDateFormat("MMddyyyy");
				String s=sd.format(date.get());
		       
		for(String s1 : lpwd) {
			
			   System.out.println("Generated pwds : "+s1+d.get().toString()+s); 
			
		}
		
		System.out.println(s);
		               
		
		
	}

}
