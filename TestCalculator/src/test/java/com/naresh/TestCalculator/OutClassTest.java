package com.naresh.TestCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;

import com.naresh.TestCalculator.OutClass.InnerClass;

public class OutClassTest {
	
	static String name="Ram";
	static int age=10;
	
    @org.junit.Test
	public void testMethod() {
    	Scenario sc=new Scenario();
    	System.out.println(sc);
    	OutClass out=new OutClass(name, age ,sc);
		OutClass.InnerClass inner=out.new InnerClass();
		int num =inner.getNum(10);
		
		assertEquals(10, 10);
	}
	
}
