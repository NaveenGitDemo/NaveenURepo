package com.thread.demo;

class Display1{
	
	public void wish(String name) throws InterruptedException {
		
		System.out.println(" one lakh line of code ");
		
		synchronized(this){
		for(int i=1;i<=10;i++) 
		{
			System.out.print(" Good Morning : ");
			
			Thread.sleep(2000);
			System.out.println(name);
			
		}
	}
}
}

class MyThread2 extends Thread{
	
	Display1 d;
	String name;
	public MyThread2(Display1 d,String name) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.name=name;
	}
	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating display class object
		Display1 d=new Display1();
		
		// crating threads
		
		MyThread2 mt=new MyThread2(d, "dhoni");
		MyThread2 mt1=new MyThread2(d, "Krishn");
		mt.start();
		mt1.start();
		mt.start();
		
	}

}
