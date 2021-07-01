package com.thread.demo;

class MyThread extends Thread{
	
	 static Thread th; // child class reference  
	
	public void run() {
		
		
		
		/*
		 * try { th.join(); // child thread calling join method on main thread object
		 * reference } catch (InterruptedException e1) { // TODO Auto-generated catch
		 * block e1.printStackTrace(); }
		 */
		 
		
		for(int i=0;i<5;i++) {
			
			System.out.println("child thread");
			
//			try {
//				th.join();   // child thread calling join method on main thread object reference 
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}

public class JoinThreadDemo{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		MyThread.th = Thread.currentThread();	// main thread assigned to child thread object
	
		JoinThreadDemo tj=new JoinThreadDemo();
		
		MyThread mt=new MyThread(); // creating child class thread object
		mt.start(); // run method call (here we have two threads child and main )
		mt.join(); // main thread calling join method on child thread object {if we remove comment than deadlock occurs}
			for(int i=0;i<5;i++) {
			
			System.out.println("Main thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
