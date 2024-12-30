package com.tech;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnargamString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String name="nopp";
		  String stop="npop";
		  name=name.toLowerCase();
          stop=stop.toLowerCase();
             
          Map<Character, Integer> map1=getMap(name);
          Map<Character, Integer> map2=getMap(stop);
          
          Set<Character> firstkey=map1.keySet();  Set<Character> secondKey=map2.keySet();
          if(firstkey.containsAll(secondKey) && secondKey.containsAll(firstkey)) {
         	 System.out.println("  Strings are anargam ");
          }else {
        	  System.out.println(" Strings are not anargam  ");
          }
           
          System.out.println(" first string map : "+map1);
          System.out.println(" second string map : "+map2);
             
        
	}
	
	public static Map getMap(String value) {
		 int cunt=0;  Map<Character, Integer> first=new HashMap<Character, Integer>();
		  for(int i=0 ; i <value.length() ;i++) {
      	    if(first.containsKey(value.charAt(i))) {
      		  cunt=first.get(value.charAt(i));
      		  cunt=cunt+1;
      		first.put(value.charAt(i), cunt);
      	  }else {
      		first.put(value.charAt(i), 1);
      	  }
        }
		
		return first;
	}

}
