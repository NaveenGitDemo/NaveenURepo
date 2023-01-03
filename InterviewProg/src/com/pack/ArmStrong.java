package com.pack;

public class ArmStrong {

	public static void main(String[] args) {
		
		Integer r,temp,sum=0;
		Integer n=153;
		
		temp=n;
		while(n>0) {
			r= n%10;
			
			n = n/10;
			
			sum = sum+(r*r*r);
		}
		System.out.println(sum);
		System.out.println(temp);
		if(sum.equals(temp))
		System.out.println("no is armstrong");
		else
			System.out.println("not");
	
		
		
	}
      

}
