package com.thread.demo;

class Display{
	
	public synchronized void wish(String name) {
		
		 for(int i=0 ; i<=10 ;i++) {
			 
			 System.out.print(" good morning  : ");
			 try {
			 Thread.sleep(2000);
			 System.out.println(name);
			 }catch(InterruptedException ie) {
				 ie.printStackTrace();
			 }
		 }
		
	}
	
}


class MyThread1 extends Thread{
	Display d;
	String name;
	MyThread1(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
	
}



public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Display d=new Display();
		//Display d=new Display();
		MyThread1 mt1=new MyThread1(d, "Dhoni"); // mt1 thread got lock display class object (calls constructor)
		MyThread1 mt2=new MyThread1(d, "Yuvraj"); // mt2 thread got lock display class object (calls constructor)
		mt1.start();  // it call run method
		mt2.start(); // it call run method
		
	    mt1.join();
		mt2.join();
	 System.out.println("hello main");

	}

}
