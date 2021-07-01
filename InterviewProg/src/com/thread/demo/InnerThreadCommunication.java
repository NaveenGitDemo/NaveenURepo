package com.thread.demo;

public class InnerThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b=new ThreadB();
		ThreadB b1=new ThreadB();
		b.start();
		// here we have two thread one is main onther one is child 
		
		// call wait method 
		
		  synchronized(b) { 
			  try {
				  b.wait(); // main thread is calling wait method on child thread  class object 
				  System.out.println(b.total);
		  }catch(Exception e) {
			  System.out.println(e); 
			  }
		}
		 
	}

}
class ThreadB extends Thread{
	
	int total=0;
	public void run() {
		synchronized(this) {
		for(int i=0;i<=5;i++) {
			total=total+i;
		
		}
		this.notify(); // child thread is giving notification to main thread 
		}
	}
			
	
}
