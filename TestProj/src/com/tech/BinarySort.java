package com.tech;

import java.util.Arrays;

public class BinarySort {
	
	static Integer [] arr =  {2,1,0,7,9};
	
	static int key=99;
	public static void main(String args[]) {
		
		
		for(int i = 0; i < arr.length ; i++ ){
			   int temp=0; int j = i+1;
			   while(j < arr.length){
				   if(arr[j] > arr[i])
			         {
			        	 temp = arr[i];
			             arr[i] = arr[j]; 
			             arr[j] = temp;
			         }
			         j++; 
				}
			       
			}
    System.out.println( " integere array sorted : "+Arrays.toString(arr));
    
    // call iskeyFound 
    System.out.println(iskeyFound(key,arr));
				
    // quick sort the array
    int [] arr =  {2,1,0,7,9};
    int low = 0;
    int high = arr.length - 1 ;
    BinarySort quickSort = new BinarySort();
    quickSort.quickSort(arr, low, high);
    
    for(int i = 0 ; i < arr.length ; i++) {
     System.out.println("Quick Sort Array Is Like : "+arr[i]);
    }
    
	}

	// binary search operation for any key in array
	private static boolean iskeyFound(int key, Integer[] arr2) {
		// TODO Auto-generated method stub
		int low1 = 0;
	    int high = arr2.length-1;
	    
		while( low1 <= high) {
			int mid = ( low1 + high) / 2 ;
		  if(key == arr2[mid]) {
			  return true;
		  }else if(key < arr2[mid]) {
			  low1 = mid+1;
		  }else {
			  high = mid-1;
		  }
		}
		return false;
		
	}

	// quick sort algoritham function
	private void quickSort(int arr[],int low , int high) {
		
		if(low < high) {
			
			int pidx = partition(arr , low , high);
			
			// once i got pviot index now need to sort two array 
			quickSort(arr,low,pidx-1);  // smaller element than pviot
			quickSort(arr,pidx+1,high); // greater element than pivot
		}
	}
	
	// main function for swaping the element for sort and return the pviot index at last 
	private int partition(int arr[] ,int low ,int high) {
		int pviot = arr[high]; 
		int i = low-1;
		for(int j = low ; j < high ; j++ ) {
			if(arr[low] < pviot) {
				i++;
			    int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pviot;
		arr[high] = temp;
		return i;
	}
	
}
