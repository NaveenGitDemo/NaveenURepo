package com.tech;

import java.util.Arrays;

public class InterviewProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reverse a string 
		String name = "Krishn";		String revString = "";
		
		int len = name.length() - 1;
		for(int i = len ; i >= 0 ; i--) {
			System.out.print(name.charAt(i));
			revString = revString.concat(String.valueOf(name.charAt(i)));
		}
		System.out.println();
		System.out.println("reverse String : "+revString);
		
		// reverse sentence of string 
		String sentance = "My Loard Is Krishn";
		// split sentance into word
		String[] word = sentance.split(" ");
		String reverseSentance = "" ;
		// reverse the sentance 
		for(int i = word.length - 1 ; i  >= 0 ; i--) {
			reverseSentance = reverseSentance.concat(word[i]).concat(" ");
		}
		System.out.println("reverse sentance : "+reverseSentance);
		
	
        // reverse string with each word in sentance should reverse 
		String reverseSentanceWithReverseWord = "" ;
		for(int i = word.length - 1 ; i >= 0 ; i--) {
			 String w = word[i]; String rw = "";
			 for(int j = w.length()-1 ; j  >= 0 ; j--) {
				 rw  = rw.concat(String.valueOf(w.charAt(j)));
			 }
			 reverseSentanceWithReverseWord = reverseSentanceWithReverseWord.concat(rw).concat(" ");
		}
		System.out.println("here is my reverse sentance with reverse word : "+reverseSentanceWithReverseWord);
		
		// Array based program
		int [] intarray = {10,40,20,30,50};
		//Integer [] sortarray = new Integer[intarray.length];
		// sort in descending order
		for(int i = 0 ; i <= intarray.length - 1 ; i++) {
			for(int j = i+1 ; j <= intarray.length - 1 ; j++) {
				if(intarray[j] > intarray[i]) {
					int temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}
		}
		
		System.out.println("sorted array : "+Arrays.toString(intarray));
	}

}
