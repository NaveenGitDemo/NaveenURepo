package com.pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComparoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(9);
		list.add(2);
		
		LinkedList<String>  l=new LinkedList<>();
		
		
		Comparator<Integer> c= (i1,i2) -> {return (i1>i2)?-1:(i1<i2)?1:0 ;};
		
		List<Integer> sortedList = list.stream().sorted(c).collect(Collectors.toList());
		
		sortedList.forEach(System.out :: println );
		
		Map<Integer,String> m= new HashMap<Integer, String>();
		m.put(1, "Mani");
		m.put(3, "Manisha");
		m.put(2, "Naveen");
		m.put(4, "Mishu");
		
		// iterating data from map
		
		for(Map.Entry<Integer, String> m1 :m.entrySet()) {
			System.out.println(m1.getValue() + " " + m1.getKey());
		}
		
		m.forEach((k,v) -> System.out.println( k + " : " +v)  );
		
		// sort the key in descending order
		
		Map<Integer, String> sortedByValueDesc = m.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue , (e1, e2) -> e1, LinkedHashMap::new));
		
	 // again iterate from sorted map
		
		System.out.println("somthing ");
		
		sortedByValueDesc.forEach((k,v) -> System.out.println(k + " : " + v));


				
	}

}
