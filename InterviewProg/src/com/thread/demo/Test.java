package com.thread.demo;

 class Test {

	String name;
	public String getName(String name) {
		this.name=name;
		return name;
		}
}
 class Test1 extends Test {
	public String getName(String name) {
		
		super.getName(name);
		this.name=name;
		
		
		
		return name;
	}
	
	
 }
