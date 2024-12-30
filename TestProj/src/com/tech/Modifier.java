package com.tech;

class Test1{
	

	protected static int x=10;
	private static int y=8;
	protected   int x1=7;
	protected  int y1=6; 
	
	public void go() {
		
		System.out.println(x +" : "+y +" : "+ x1 +" : "+y1);
	}
}

public class Modifier extends Test1{
   
	 
	//private static int x1=20;
	//private static int y=8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=20 ;int y=18; int x1=9;  int y1=5;
          
       // new Modifier().new Test1().;
       Test1 mt=new Modifier();
       Modifier t=new Modifier();
       System.out.println(Modifier.x +" : "+y +" : "+ mt.x1 +" : "+y1);
       
	}

}
