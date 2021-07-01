package com.exception.demo;

class Test{
	static final int i=20;
	static {
		System.out.println("static block : ");	
		m1();
	  }
	
	public static void m1() {
		System.out.println("  method m1 : "+j);
	}
	  
	 static final int j=10;
	  
}




public class ExceptionTest extends Test {
	
  //public static int i=13;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest t=new ExceptionTest();
		//t.i=40;
		System.out.println(t.i);
       int i=1;
			try {
				//System.exit(0);
				System.out.println(" i "+i);
				System.out.println("somthing went wrong "+ i +" " +i/0);
				
			}catch (ArithmeticException e) {
				// TODO: handle exception
				//System.out.println(i/0);
				System.out.println("some problem");
				try {
				throw new NullPointerException();
				}catch(NullPointerException n) {
					System.out.println("null");
					}
				
			}
			finally {
				//System.out.println(i/0);
				//throw new NullPointerException();
				System.out.println("hi");
			}
		
	}

}
