package com.pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class MyComparoter implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		//String s1=o1.toString();
		//String s2=o2.toString();
		return o1.compareTo(o2);
	}
	
	
}


public class CollectonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating List object
		
		List<String>  l=new ArrayList<>();
		
		l.add("n");
		l.add("q");
		l.add("a");
		l.add("z");
		l.add("p");
		
		// sorting of list by acending order
		
	l.sort(new MyComparoter());
		
	 // List ll= l.stream().sorted((i1,i2) -> -(i1.toString().compareTo(i2.toString()))).collect(Collectors.toList());
	//Collections.sort(l);
		//List newList=l.stream().sorted(c)
	 System.out.println(l);
	 
	List<Integer> intlist=new ArrayList<>();
	intlist.add(10);
	intlist.add(2);
	intlist.add(9);
	intlist.add(1);
	
	List<Integer> sortlist=intlist.stream().sorted((i1,i2) -> {return (i1>i2)?1: (i1<i2)?-1:0;}).collect(Collectors.toList());
	
	System.out.println("list of sorted integer :   "+sortlist);
	
	// creating Map object and map related operations
	
	
	Map<String, Integer> info=new HashMap<String, Integer>();
	info.put("Krishn", 50000);
	info.put("Balram", 70000);
	info.put("Radha", 20000);
	info.put("Ram", 100000);
	
	
	// retrive key and value from map
	
	info.forEach((k,v) -> System.out.println(" Name : "+k+ " :"+ " salary : "+v));
    
	ArrayList<Map.Entry<String, Integer>> li=new ArrayList<>();
	li.addAll(info.entrySet());
	// List<Integer> list=new ArrayList<>();
	
	List<Map.Entry<String, Integer>> sortl=li.stream().sorted((o1,o2)->  o1.getValue().compareTo(o2.getValue())).collect(Collectors.toList());
		
	Map<String, Integer> sorted=new LinkedHashMap<>();
	
	// iterating from  list and putting in map
	
	for( Map.Entry<String, Integer> en : sortl) {
	      sorted.put(en.getKey(), en.getValue());	
	}
		System.out.println("Sorted Map with values is : "+sorted);
}
	// sorting by salary
	//Comparator<Map<info>> c=
	
	
	
	
	
	
	
            
	}


