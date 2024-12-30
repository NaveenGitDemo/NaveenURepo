package com.tech;

import java.util.Arrays;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name="abc";
         char[] ch = new char[name.length()];
         // checking reverse string 
         int count =0;
         for(int i=name.length()-1; i>=0;i--) {
        	        ch[count]=name.charAt(i);
        	        count+=1;
         }
         System.out.println(Arrays.toString(ch));
          
         String reverseString=new String(ch);
         
		System.out.println(reverseString);
		 // String reverseString=ch.toString();
		 // System.out.println(reverseString.toString()); // checking for palindrome
		  if(name.equals(reverseString)) {
		  System.out.println("String is palindrome "+name); } else {
		  System.out.println("String is not palindrome "+name); }
		 
		  
		  // coversion int into String 
		  int i=123;
		         System.out.println(String.valueOf(i)+'4');	
		         
		  String name1="123";
		  System.out.println(Integer.valueOf(name1));
		  
		  
	}

}
