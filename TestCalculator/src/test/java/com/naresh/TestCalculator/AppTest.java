package com.naresh.TestCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
	
	static Calculator cal;
	
	@BeforeClass
	public static void  oneTimeSetUp() {
		cal =new Calculator();
		System.out.println(" calculator object created ");
		
		
	}
	
	@Test
	public void checkAdd() {
	//	Calculator cal = new Calculator();
		
		int x=1;
		int y=2;
		
		int z = cal.add(x, y);
		
		assertEquals(3, z);
		
	}
	@Test
	public void checkSub() {
		
		//Calculator cal=new Calculator();
			int c =cal.sub(5, 3);
			 assertEquals(2, c);
		
	}
	
	
	
}
 
   