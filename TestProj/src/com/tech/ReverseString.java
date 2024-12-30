package com.tech;

import java.io.CharArrayReader;
import java.util.Arrays;

public class ReverseString {

	
	public static String original="Krishn";
	public static char ch[]=new char[original.length()] ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		//logic to reverse a string
		   int count=0;
		for(int i=original.length()-1 ; i>=0 ; i--) {
			 count++;
			//System.out.println(original.charAt(i));
			// storing character in character array
			ch[count-1]=original.charAt(i);
			// storing character into Character object
			//ch=new CharArrayReader(original.charAt(i));
			
			 System.out.println(ch[count-1]);
		   }
		//String s=new String(ch);
		// converting character array to string 
		String s = String.valueOf(ch) ;
              //   String s= Arrays.toString(ch);
		System.out.println("reverse String "+s);
		System.out.println(original);
		
		// logic of sorting an array
		
		
		int [] a= {1,2,4,5};
		int temp;
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		
		}
		// second heighest number in array is
		System.out.println("third heighest number in array "+a[2]);
		System.out.println("sorted array : "+Arrays.toString(a));
		int [] a1= {6,20,9,11};
		int temp1;
		for(int i= 0 ; i <a1.length ; i++) {
			for(int j = i+1 ; j<a1.length ; j++) {
				if(a1[j] > a1[i]) {
				temp1=a1[i];
				a1[i]=a1[j];
				a1[j]=temp1;
				}
			}
		}
		System.out.println(" 2nd high number : "+a1[1]);
		System.out.println(" sorted array a1 "+Arrays.toString(a1));
		//reverse a array
		int p=0 ,q=a1.length-1  ;int temp2;
		while( p < q) {
			temp2=a1[q];
			 a1[q]=a1[p];
			 a1[p]=temp2;
			 p++;
			 q--;
		}
		
		System.out.println(" reverse array a1 "+Arrays.toString(a1));
		
		
		
		
		
		
	}

}
