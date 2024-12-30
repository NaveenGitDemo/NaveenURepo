package com.tech;


class A {
	
	public int a=10;
	public A(){
		System.out.println(" A construct called ");
	}
	public void m1() {
		System.out.println("m1 from A");
	}
}
class B extends A{
	public int a=20;
	//long b= (long)a;
	public B() {
		System.out.println(" B contruct called ");
	}
	
	  public void m1() { System.out.println("m1 from B"); }
	  
	 
	
	public void m2() {
		System.out.println("m2 from B");
	}
}
class C extends B{
	public int a=30;
	public C() {
		System.out.println("C construct called ");
	}
	/*
	 * public void m1() { System.out.println("m1 from C"); }
	 */
}

public class Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B b= new B();
      System.out.println( b instanceof A); //true
      System.out.println( b instanceof B); //true
      System.out.println( b instanceof C); //false
      System.out.println(b.a); //20
      B a=new B();
     // System.out.println(a.a);
      a.m1(); // m1 from b
      A a1=new C();
      System.out.println( a1 instanceof A); //true
      System.out.println( a1 instanceof B); //true
      System.out.println( a1 instanceof C); //true
      
	}

}
