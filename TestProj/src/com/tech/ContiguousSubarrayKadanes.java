package com.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// kadanes algoritham maximum sum of contiguous subarry
public class ContiguousSubarrayKadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Integer arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
	 
	 List<Integer> contigousSubArray=new ArrayList<>();
	  
	   int max_sofar = 0; int start=0 ; int end = 0; int s=0;
	   int max_ending = 0; int count = 0;
	   for(int i=0 ; i < arr.length-1 ; i++) {
		    max_ending = max_ending + arr[i];    
		   if(max_ending < arr[i]) {
			   max_ending = arr[i];
			  start = s + i;
		   }
		   if( max_sofar < max_ending ){
			   max_sofar = max_ending ;
			    s = i; end = i; 
		   }
	   }
	   
	   Integer [] contigousArray=new Integer[ end - start + 1 ];
	   for(int i = start ; i <= end ; i++) {
		   contigousSubArray.add(arr[i]);
		   contigousArray[count++] = arr[i];
	   }
      
	   System.out.print("maximum sum of contigous subarray "+max_sofar);
	   System.out.println("maximum sum of contigous subarray index  " + " Start :"+start + " end : "+end);
	   System.out.println(" contiguous sub array  "+Arrays.toString(contigousArray));
	   
	}

}
