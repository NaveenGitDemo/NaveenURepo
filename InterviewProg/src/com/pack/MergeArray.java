package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1[]= {"A","E","I"}; // source 
		String str2[]= {"o","u"}; // destination
		List list=new ArrayList<>(Arrays.asList(str1));
		list.addAll(Arrays.asList(str2));
		Object[] str3=	list.toArray();
		System.out.println(Arrays.toString(str3));
		
		int arr1 [] = {1,2,3,4,5};
		 int arr2 [] = {1,3,5,7};
		 
		 int length1=5;
		 int totallength= arr1.length+arr2.length;
		 Integer arr3[] = new Integer[totallength];   
		 // merg with new array
		// first array iterating 
		 int i1=0;
			  for(int j=0;j<=arr1.length-1; j++) { 
			   
				  arr3[i1] = arr1[j];
				   i1=i1+1;
				   
			  }
			 for(int j=0;j<=arr2.length-1; j++) {
				 arr3[i1] = arr2[j];
				 i1=i1+1;
			 }
		 
		 System.out.println(Arrays.toString(arr3));
		 System.out.println("length of arr3 is "+arr3.length);
		/*
		 * for(int i=0 ;i<4 ; i++) {
		 * 
		 * // System.out.println(i +" : index value is ");
		 * System.out.println(length1+i+" ======"); System.out.println (arr2[i]); int n=
		 * length1+i; arr1[n]=arr2[i]; }
		 */
		 
		 String s="how are you";
		 char [] ch=s.toCharArray();
		 
		 Map<Character,Integer> m=new HashMap<>();
		 
		 int counter=0;
		 
		 for(int i=0;i<ch.length;i++) {
			 if(m.containsKey(ch[i])) {
				  counter=m.get(ch[i]);
				  m.put(ch[i],++counter);
			 }else {
				 m.put(ch[i],1);
			 }
			 
		 }
		 
		 System.out.println("count of duplicate char :"+m);
		 
		 Map<String,Integer> mymap=new HashMap<>();
		 mymap.put("naveen", 1);
		 mymap.put("naveen", 2);
		 
		 System.out.println("duplicate key value is :" +mymap.get("naveen"));
		 
		 ArrayList<Integer> l=new ArrayList<Integer>();
		 l.add(10);
		 l.add(20);
		 l.add(10);
		 l.add(30);
		 
		 Set<Integer> removedup=new HashSet<Integer>(l);
		 
		 System.out.println(removedup);
		 
	//	 l.addAll(removedup);
		 
	//	 System.out.println(l);
		 
		 int a=13;
		 int no=a;
		 for(int k=1;k<no;k++) {
			 
			 a*=k;
			 }
		 System.out.println(a);
		 
		 boolean flag=false;
		 for(int z=2;z<=no/2;z++) {
			 if(no%z==0) {
				 flag=true;
				 System.out.println("number is not prime"+no);
				 break;
			 }
			
		 }
		 if(flag==false) {
			 System.out.println("number is prime"+no);
		 }
		 
		 Integer r,sum=0,n=454,temp;
			temp=n;
			while(n>0) {
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			System.out.println(temp);
			System.out.println(sum);
			System.out.println(sum.equals(temp));
			System.out.println(temp == sum);
			if(sum.equals(temp)) {
				System.out.println("palindrome");
			}else {
				System.out.println("not");
			}
		 Map<String,Integer> m1=new HashMap<String,Integer>();
		 
				 m1.put("Na", 1);
				 m1.put("Ma", 2);
				 
				 for(Map.Entry<String, Integer> entry : m1.entrySet()) {
					 System.out.println(entry.getKey() + "  : "+entry.getValue());
				 }
				 
		m1.forEach((k,v) -> System.out.println(k + " : " +v));

	}

}
