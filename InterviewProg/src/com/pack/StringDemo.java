package com.pack;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,acccno,bankname=null,lastname;int i;
		 String[] s;
		 name="Andhra bank,naveen upadhyay,12345678";
	s=name.split(",");
	
	// use char At method
	       char ch =name.charAt(8);
	System.out.println("Character at index is " +ch);
	       
	 for( i=0;i<s.length;i++) {
		 if(s[i].contains("bank") ){
			bankname=s[i].replaceAll("bank", "    ").trim();
			}
		 
	 }
	 acccno=s[2].substring(4);
	 System.out.println("substring value "+acccno);
	       acccno = "xxxx".concat(acccno);
	 System.out.println(bankname+acccno);
	 String n="value";
	 System.out.println("naveen".replaceAll("naveen", "kriii"));
	StringBuffer sb=new StringBuffer("naveen");
	
	// String value= n.substring(3);
	// System.out.println("xxxx".concat(value));
	 
	}
}
