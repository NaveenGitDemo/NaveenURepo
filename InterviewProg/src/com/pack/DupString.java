package com.pack;

public class DupString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="Naveen";
		String n=name.toLowerCase();
		for(int i=0 ; i< n.length() ;i++) {
			for(int j= i+1 ; j< n.length() ; j++) {
				if(n.charAt(i) == n.charAt(j)) {
					System.out.println("duplicate charachter is "+n.charAt(i));
				}
			}
		}
		
	}

}
