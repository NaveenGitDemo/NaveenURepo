package com.naresh.TestCalculator;

class OutClass{
	public String name="ram";
	public int age=10;
	
    public Scenario sc=new Scenario();
	
	OutClass(String name,int age,Scenario sc){
		this.name=name;
		this.age=age;
		this.sc=sc;
		System.out.println("constructer called ");
	}
	class InnerClass{
		 int num=10;
		public int getNum(int num) {
			this.num=num;
			return num;
		}
	}
}




public class OuterClass {
	
	public static void main(String [] args) {
		// creating obj
      Scenario sc=new Scenario();
      sc.id=10;
      sc.scName="ram";
      sc.scId="name";
		OutClass out=new OutClass("a", 10 ,sc);
		OutClass.InnerClass inner= out.new InnerClass();
		System.out.println(" get number "+inner.getNum(10));
	}
	
}
