package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FindDuplicateInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<List<Integer>> o;
		ArrayList<Integer> list = new ArrayList();
		list.add(2);
		list.add(8);
		list.add(3);
		list.add(8);
		
		
		System.out.println(list);
		System.out.println(list.size());
		
		//Collections.sort(list);
		Comparator<Integer> c1=(i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0;
		//Collections.sort(list, new Mycomparator());
		Collections.sort(list, c1);
		//System.out.println(list.get(0));
		//int temp=0;
		System.out.println(list);
		ArrayList<Integer> l2= new ArrayList<>();
		
		 for(Integer i:  list) {
			    Optional<Integer> oo=Optional.ofNullable(i);
			   
			       if(oo.isPresent()) {
			    	 System.out.println("from optional "+oo.get());  
			       }
			    }
		list.forEach(System.out ::println);
		
		
		Map<Character,Integer> m= new HashMap<Character,Integer>();
		m.put('a',1);
		m.put('b', 2);
		
		 
		/*
		 * for(Map.Entry<Character,Integer> entry : m.entrySet()) {
		 * //m.containsKey(m.get(entry.getKey())); System.out.println(entry.getKey() +
		 * " " +entry.getValue() ); }
		 */
		m.forEach((k,v) ->  {System.out.println(k + " value is  " + v);} );
		
		m.entrySet().forEach(entry -> {System.out.println(entry.getKey());});
		
		//Second largest number
		int count = 1;
		int arr[] = {1,2,5,9};
		//int [] arr1 =new int[arr.length];
		for (int i=0 ; i<= arr.length-1 ;i++) {
			for(int j=i+1 ; j<=arr.length-1 ; j++) {
				if(arr[i] > arr[j]) {
					System.out.println(arr[i]);
				}
				else {
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i] = temp;
							}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for(int n=0; n<=arr.length-1;n++) {
			count = count+n;
			if(count == 2) {
				System.out.println(" second largest no is  "+ arr[n]);
			}
		}
		
		
		
		/*
		 * for(int i=0 ; i<list.size() ; i++) { for(int j =list.size()-1 ; j>i ;j--) {
		 * if(list.get(i)>list.get(j)) { int temp=list.get(i); list.set(i, list.get(j));
		 * list.set(j, temp);
		 * 
		 * 
		 * } }
		 * 
		 * }
		 */
		// System.out.println(list);
		

	}

}
