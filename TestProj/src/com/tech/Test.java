package com.tech;

public class Test {
	
	public void Mul() {
		int x=9;
		int y=10;
		int z=x*y;
		
	}
	public void Mulloop() {
		int j=0;
		for(int i=1;i<=10;i++) {
			 j=i*2;
			 System.out.println(j);
		}
	}

	
	public static void main(String [] ar) {
		Test t=new Test();
		t.Mulloop();
		
	}

}
