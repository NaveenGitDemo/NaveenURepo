package com.thread.demo;


public  class YieldDemo {

	public static void main(String[] ar) {
		
		  Thread.currentThread().setPriority(10);
		  
		Yield mt=new Yield();
		mt.start();
		
	    String name=Thread.currentThread().getName();
	    System.out.println("Main thread name  " +name);
	    
	    // Main Thread Priority
	    int mtvalue=Thread.currentThread().getPriority();
		System.out.println(" Main thread priority : "+mtvalue);
	    
		for(int j=0;j<=5;j++) {
			System.out.println("Main");
			//mt.yield();
		try {
				Thread.sleep(2000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			 
		}
				
	}
	
	
}
class Yield extends Thread{
	
	
	
	      
	public void run(){
		Thread.currentThread().setPriority(5);
		Thread.yield();
		for(int i=0;i<=5;i++) {
		System.out.println("child");
	
			
			  try { Thread.sleep(2000); }catch(InterruptedException ie) {
			  ie.printStackTrace(); }
			 
		
	}
		int chvalue=Thread.currentThread().getPriority();
		System.out.println(" child thread priority : "+chvalue);
		/*
		 * Thread.currentThread().setName("childThread");; String
		 * name=Thread.currentThread().getName(); System.out.println(name);
		 */
}
}
