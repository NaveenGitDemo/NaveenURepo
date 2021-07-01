package com.thread.demo;


public  class YieldDemo {

	public static void main(String[] ar) {
		
		Yield mt=new Yield();
		mt.start();
		int value=mt.getPriority();
	String name=	Thread.currentThread().getName();
	
		System.out.println("Main thread name  " +name);
		for(int j=0;j<=5;j++) {
			System.out.println("Main");
			//mt.yield();
		}
				
	}
	
	
}
class Yield extends Thread{
	
	public void run() {
		
		for(int i=0;i<=5;i++) {
		System.out.println("child");
		Thread.yield();
		
	 
	}
		 Thread.currentThread().setName("childThread");;
		 String name=Thread.currentThread().getName();
		  System.out.println(name);
}
}
