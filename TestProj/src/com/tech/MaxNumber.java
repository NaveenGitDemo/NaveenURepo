package com.tech;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={25,15,30,2};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		// find highest number in an array
		for(int i=0 ; i<a.length ;i++) {
			for(int j=i+1 ; j<a.length ; j++) {
				if(a[i]<a[j]) {
					int tempValue=a[j];
					a[j]=a[i];
					a[i]=tempValue;
				}
			}
		}
	
		System.out.println(" highst number in given array is : "+a[0]);
		
		// add 1 number in given array and add it to array
		for(int i=0 ; i<a.length ; i++) {
			 a[i]= a[i]+1;
		}
		System.out.println("Adding number at each index : "+Arrays.toString(a));
		// reverse Array logic
		int temp1;
		int ii=0;
		int jj=a.length-1;
		while(ii<jj) {
			temp=a[jj];
			a[jj]=a[ii];
			a[ii]=temp;
			ii++;jj--;
			
		}
		
		System.out.println("Reverse array is : "+Arrays.toString(a));
		
		System.out.println("Max value from number array is :" + a[1]);
		
		int b=10;
		//convert integer to long
		      Long b1=Long.valueOf(b);
		      System.out.println(b1);
		String s="20";
		int s1=Integer.valueOf(s);
		System.out.println(s1+10);
		Double d =Double.valueOf(b);
		System.out.println(d+10);
		Float f =Float.valueOf(b);
		System.out.println(f+10);
		
		
		// checking nullable condition
		System.out.println(getListData());
		// dummy logic 
		if(false) {
			
		}else if(1>2){
			System.out.println(" 1 is greater than 2 "+1);
		}else if(3>2) {
			System.out.println(" 3 is greater than 2 ");
		}else {
			System.out.println(" 1 is lesser than 2 ");
		}
		
		// reverse an array
		char[] carray= {'k','r','i','s','h','n'};
		//length of an array
		System.out.println("length of char array : "+carray.length);
		int count=carray.length;
		for(int i=0 ;i<carray.length;i++) {  
			if( i < count) {
			count=count-1;
		    char c=carray[i];
		    carray[i]=carray[count];
		    carray[count]=c;
			}else {
				break;
			}	    
		}
		System.out.println(" reverse character array is : "+Arrays.toString(carray));
		
		// equilibrium array  (Array which left side and right side elements sum are equal from a index in below 
		// array index 2 element 6 is the index.)
		// tech Mahindera , , Virtusa , L & T ,  CGI 
		int eqb[] = {1,2,6,4,0,-1};
		int[] sumatIndex=new int[eqb.length];
		for(int i=0 ; i<eqb.length ; i++) {
			if( i == 0) {
			sumatIndex[i]=eqb[i];
			}else {
				sumatIndex[i]=eqb[i]+sumatIndex[i-1];
			}
		}
		System.out.println(" preprocessing array : "+Arrays.toString(sumatIndex));
		
		// now we need to fimd out left sum and right sum of array
		//total sum of array is 
		int total=sumatIndex[sumatIndex.length-1];
		for(int i=1 ;i<sumatIndex.length-2 ;i++) {
			int leftSum =sumatIndex[i]-eqb[i] ; int rightSum=total-sumatIndex[i];
			if(leftSum == rightSum) {
			  System.out.println("equilibrium index in array : "+i);
			}
			
		}
		// Subarray sum equals k (number of sub array with sum equals to k , K is given by problem k=7
					int subarray [] = {3,4,7,2,-3,1,4,2}; int k=7;
			        int numberOfSubArray=0;
			        int preprocess[]=new int[subarray.length];
	
			        Map<Integer, Integer> map=new HashMap<>();
			        for(int i=0;i<subarray.length;i++) {
			        	int value=0; int key=0;
			        	if(i == 0) {
			        	preprocess[i]=subarray[i]; 
			        	value=1;
			        	map.put(preprocess[i], value);
			        	System.out.println(map+" map ");
			        	if(preprocess[i]==k) {
			        		numberOfSubArray=numberOfSubArray+1;
			        	 }
			        	}else {
			        		preprocess[i]=subarray[i]+preprocess[i-1];
			        		if(map.containsKey(preprocess[i])) {
			        			value=map.get(preprocess[i]);
			        			map.put(preprocess[i], value+1);
			        			int k1 =preprocess[i]-7;
			        			if(map.containsKey(k1) || preprocess[i] == k ) {
			        				numberOfSubArray++;
			        			}
			        		}else {
			        			
			        			map.put(preprocess[i], 1);
			        			int k1 =preprocess[i]-7;
			        			if(map.containsKey(k1) || preprocess[i] == k) {
			        				numberOfSubArray++;
			        			}
			        		}
			        	}
			        }
		
		 /* for( Map.Entry<Integer,Integer> entry : map.entrySet()) { 
			  if(entry.getKey()== 7) 
			  {
				 numberOfSubArray=numberOfSubArray+1;
		          System.out.println("in for"+map); } }
		         */
		        System.out.println("subarray k 7 : "+numberOfSubArray);
		        StringBuffer bf=new StringBuffer();
		        int cap=bf.capacity();
		        System.out.println(cap);
	
		        getMaxValueEntry();
	}
	
	public static List<String> getListData(){
		List<String> li =null ;
		//List<String> list=new ArrayList<>();
		//list.add("Krishn");
		
		Optional<List<String>> data=Optional.ofNullable(li);
		if(data.isPresent()) {
			 	li  =data.get();
			// System.out.println(li);
			 // li.forEach(System.out::println);
			  return li;
			}else {
				System.out.println("data not present in list ");
				li=new ArrayList<>();
				
				li.add("dummy");
				return li;
			}
		
	}
	
	public static Map.Entry<String, Integer> getMaxValueEntry(){
		Map<String,Integer> map1=new HashMap<>();
		map1.put("krishn", 4);
		map1.put("Bhagwat", 2);
        map1.put("Ram",7);
		Map<String,Integer> map2=new HashMap<>();
		map2.put("krishn", 3);
		map2.put("Bhagwat", 1);
		map2.put("Ram",6);
		System.out.println(" map1 entries are "+map1);System.out.println(" map2 entries are "+map2);
		// check common max from both map
		List<Map.Entry<String, Integer>> maxcommonError=new ArrayList<>();
		Map.Entry<String, Integer> map1e=map1.entrySet().stream().max(Comparator.comparing(Map.Entry :: getValue )).get();
		Map.Entry<String, Integer> map2e=map2.entrySet().stream().max(Comparator.comparing(Map.Entry :: getValue )).get();
		//System.out.println(map1e);System.out.println(map2e);
		if(map1e.getKey().equals(map2e.getKey())){
		int value =Math.min(map2e.getValue(), map1e.getValue());
		System.out.println(value);  
		       if(map1e.getValue().equals(value)) {
		    	   maxcommonError.add(map1e);
		    	   System.out.println();
		       }else {
		    	   maxcommonError.add(map2e);
		       }
		      System.out.println(" maximum common error is in both map : "+maxcommonError);
		}
		//
	 Set<java.util.Map.Entry<String,Integer>>	map11=map1.entrySet();
	 Set<java.util.Map.Entry<String,Integer>>	map12=map2.entrySet();
	 List<java.util.Map.Entry<String,Integer>> list1=new ArrayList<>(map11);
	 List<java.util.Map.Entry<String,Integer>> list2=new ArrayList<>(map12);
	 int si1=map11.size() ;  int si2=map12.size() ; int maxsize=0;
	 if(si1>si2) {
		 maxsize=si1;
	 }else {
		 maxsize=si2;
	 }
	 List<Map.Entry<String, Integer>> maxcommonError1=new ArrayList<>();
	 for(int i=0 ;i<maxsize; i++) {
		       Map.Entry<String, Integer> entry1=list1.get(i);
		       Map.Entry<String, Integer> entry2=list2.get(i);
		       // logic for checking most common 
		       if(entry1.getKey().equals(entry2.getKey())){
		   		int value =Math.min(entry1.getValue(), entry2.getValue());
		   		System.out.println(value);  
		   		       if(entry1.getValue().equals(value)) {
		   		    	   maxcommonError1.add(entry1);
		   		    	   System.out.println();
		   		       }else {
		   		    	   maxcommonError1.add(entry2);
		   		       }
		   		      
		   		}
		      
	 }
	 System.out.println(" maximum common error 1 List  in both map : "+maxcommonError1);
	 
		return null;
	}
	

}
