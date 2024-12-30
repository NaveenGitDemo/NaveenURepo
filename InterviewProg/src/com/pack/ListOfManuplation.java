package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfManuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		list1.add("acNo");
		list1.add("QTD");
		list1.add("YTD");
		list1.add("Alias");
		List<String> list2 = new ArrayList<>();
		list2.add("1234");
		list2.add("2.6%");
		list2.add("1.7%");
		list2.add("Ram");
		List<String> list3 = new ArrayList<>();
		list3.add("1971");
		list3.add("3.6");
		list3.add("1.7%");
		list3.add("Krishn");
		List<List<String>> listOfList=new ArrayList<>();
		listOfList.add(list1);
		listOfList.add(list2);
		listOfList.add(list3);
		System.out.println("list of list : "+listOfList);
		 ArrayList<String> listModified= new ArrayList<>();
		// now making row in column
		int count=0;
		List<List<String>> col1=new ArrayList<>();
		
		//int count1=0;
		
		int countOfIf=0; boolean flag=true; int countforOuterList=listOfList.size();int inloopC=0;
		while(countforOuterList>0) {
			List<String> col=new ArrayList<>();
		for(int i=0 ; i< listOfList.size() ; i++) {
			System.out.println("List by List: "+listOfList.get(i));
			 int count1=i;
			for(int j=0;j<listOfList.get(i).size();j++) {
				
				      System.out.println(" data in list : "+listOfList.get(i));
				     
				     if(countOfIf==listOfList.size()) {
				    	 countOfIf=0 ;countforOuterList=countforOuterList-1; inloopC=inloopC+1;
				     }
				      if(i==count1 && j==inloopC) {
				      col.add(listOfList.get(i).get(j));
				     
				       countOfIf++;
				      }
				  /*    if(i==0 && j==1) {
					       col2.add(listOfList.get(i).get(j));
					      }
					      if(i==1 && j==1) {
					    	  col2.add(listOfList.get(i).get(j));
						   }
					      if(i==2 && j==1) {
					    	  col2.add(listOfList.get(i).get(j));
						   }
					      if(i==0 && j==2) {
						       col3.add(listOfList.get(i).get(j));
						      }
						      if(i==1 && j==2) {
						    	  col3.add(listOfList.get(i).get(j));
							   }
						      if(i==2 && j==2) {
						    	  col3.add(listOfList.get(i).get(j));
							   } */
						        
			}
			
		}
		col1.add(col);
		}
		System.out.println("column based List col1 : ");
		System.out.println(col1);
		
		List<String> list11 = new ArrayList<>();
		list11.add("acNo");
		list11.add("QTD");
		list11.add("YTD");
		list11.add("Alias1");
		List<String> list12 = new ArrayList<>();
		list12.add("1234");
		list12.add("2.6%");
		list12.add("1.7%");
		list12.add("Ramji");
		List<String> list13 = new ArrayList<>();
		list13.add("1971");
		list13.add("3.6");
		list13.add("1.7%");
		list13.add("Krishn");
		List<List<String>> listOfList1=new ArrayList<>();
		listOfList1.add(list11);
		listOfList1.add(list12);
		listOfList1.add(list13);
		System.out.println("list of list : "+listOfList1);
		
		List<List<String>> col2=new ArrayList<>();
		 int countforOutList=listOfList1.size();int inCount=0; int countIf=0;
		while(countforOutList>0) {
			List<String> col=new ArrayList<>();
		for(int i=0 ; i< listOfList1.size() ; i++) {
			 int count1=i;
			for(int j=0;j<listOfList1.get(i).size();j++) {
				     
				     if(countIf==listOfList1.size()) {
				    	 countIf=0 ;countforOutList=countforOutList-1; inCount=inCount+1;
				     }
				      if(i==count1 && j==inCount) {
				      col.add(listOfList1.get(i).get(j));	     
				       countIf++;
				      }
			}			
		}
		col2.add(col);
		}
		System.out.println("column based List col2 : ");
		System.out.println(col2);
		
		// difference 
		col1.removeAll(col2);
		System.out.println(" different column values : "+col1);
	}

}
