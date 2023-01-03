package com.jdk8.features;

import java.util.ArrayList;
import java.util.Collections;
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
		           
		           
		           List<String> list=new ArrayList<String>();
		           list.add("Krishn");
		           list.add("Govind");
		           list.add("Hare");
		           list.add("Murari");
		           list.add("Narayan");
		           
		              String concatList=list.stream().map(li -> li).collect(Collectors.joining(""));
		              System.out.println("Concated List is : "+concatList);
		          
		          List<String> sorted=list.stream().sorted( (l1,l2) -> l2.compareTo(l1) ).collect(Collectors.toList());
		          
		          
		           
		           //sorted.forEach(ll -> System.out.println(ll));
		          System.out.println(sorted);
		          List<String> list1=new ArrayList<String>();
		           list1.add("Narayan");
		           list1.add("Govind");
		           list1.add("Hare");
		           list1.add("Murari");
		           list1.add("Krishn");
		           
		           
		           System.out.println(" list obj equal or not : "+ list1.equals(list));
		           list1.retainAll(list);
		           System.out.println(" ofter retain all all : "+list1);
		          System.out.println(list.containsAll(list1));
		           System.out.println(" ofter retain all all : "+list);
		           
	}

}
