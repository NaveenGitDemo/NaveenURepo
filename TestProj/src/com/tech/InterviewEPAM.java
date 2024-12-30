package com.tech;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewEPAM {
	
	
//	#Hibernate
//
//	entity relationship for customer, order and product.
//
//	 
//
	
	 /* String strSentence = "Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";

// Output should be exactly like --> {BYE-3 ,EPAM-6, HI-2}

 
	 */
//
//	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strSentence = "Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";
		//strSentence=strSentence.toUpperCase();
		String[] strSentenceArr=strSentence.split(" ");
		List<String>  strList= Arrays.asList(strSentenceArr);
		
		// using stream api
	Map<String, Long>	out=strList.stream()
			.collect(Collectors.groupingBy( str -> str , Collectors.counting()));
		//System.out.println(out);
	out.forEach((k,v) -> System.out.println("Word : "+k +" frequency : "+v));
		
	}

}
