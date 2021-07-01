package com.pack;

public class Palindrome {

	public static void main(String[] args) {
		
		Integer r,sum=0,n=458,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
		if(temp.equals(sum)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not");
		}
				

	}

}
