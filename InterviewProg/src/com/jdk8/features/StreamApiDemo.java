package com.jdk8.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		
		l.add(10);
		l.add(40);
		l.add(25);
		l.add(30);
		
		
		
		Comparator<Integer> c = (i1,i2) -> { return (i1>i2)?-1 : (i1<i2)?1 : 0 ;};
	
		List<Integer> sortedList= l.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		           List<Integer> evenList = l.stream().filter(  n -> n%2==0 ).collect(Collectors.toList());
		
		           System.out.println(evenList);
		           
		           Integer min= l.stream().max(c).get();
		           System.out.println("Min no is "+min);
		           Integer max= l.stream().min(c).get();
		           System.out.println("Max no is "+max);
		           
		           
	}

}
