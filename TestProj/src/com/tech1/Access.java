package com.tech1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.tech.Modifier;
import com.tech.Test;

public class Access {
	 static int x=10; static int y=2 ; static int z;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	 Modifier m=new Modifier();
	
	 
	 try {
		 z=x/0;
	 }catch(Exception e) {
		// z=x/0;
		 System.out.println(e.getMessage());
	 }
	 
		System.out.println(test());
	}
	
	public static int test() {
		String newString = null;
		String name="a,b,c,d";
		System.out.println(" Input String is : "+name);
		String [] n=name.split(",");
		ArrayList<String> newList=new ArrayList<>();
		ArrayList<String> list=new ArrayList<>(Arrays.asList(n));
		    String name1="a";
		     // String name2=list.stream().map(StringBuffer :: new).collect(Collectors.joining(","));
		        StringBuffer buffer=new StringBuffer();
		        List<StringBuffer> l=new ArrayList<>();
		        // logic for appending one one character
		        for(String s : list ) {
		        	StringBuffer sb=new StringBuffer(s);
		        	l.add(sb.insert(0,'"').append('"'));
		        	 newString =l.parallelStream().map(Object :: toString).collect(Collectors.joining(","));
		        }
		           newList.add(newString);
		        
		        System.out.println("Expected formated string is : "+newList );
		        
		      //  System.out.println(buffer.insert(0,'"').append('"'));
		       
		// System.out.println(name2);
		
		//System.out.println(list);
		
	try {
		  z=x/0;
			}catch(ArithmeticException e) {
			// z=x/0;
			 e.printStackTrace();
			 return 2;
		 }
		 finally{
			 return 3; 
		 }
		//return 0;
	}

}
