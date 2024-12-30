package com.tech;

/*abstract class  demo{
	void m1() {}
}*/
class Singleton  implements Cloneable {
	private static Singleton s;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
					
		synchronized (Singleton.class) {
		if( s == null) {
		return s = new Singleton();
		}else {
			return s;
		}
		}
	}
	
	public Singleton clone() throws CloneNotSupportedException {
		Singleton s=(Singleton)super.clone();
		s=getInstance();
		return s;		
	}
	
}

class MyThread extends Thread{
	public Singleton news;
	
	public void run() {
		
		System.out.println(" run method called  ");
		 news= Singleton.getInstance();
	//	 System.out.println("instance returned " +news);
		 
	}
	
}
public class Abstractdemo {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException{
		// TODO Auto-generated method stub
		// need to create one more thread
		
			
		MyThread  t = new MyThread();
		t.start();    // child thread is started calling run method 
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s3=s1.clone();
          Thread.sleep(1000);
			if( s == s1 && t.news == s && s3 == t.news) {
	   			System.out.println(" having same reference  ");
			}else {
				System.out.println(" new instance created  ");
			}
			
	}

}
