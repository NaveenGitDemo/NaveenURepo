package com.naresh.TestCalculator;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class ListTest {
	static ListDemo test;
	@BeforeClass
	public static void oneTimeSetUp() {
		test=new ListDemo();
	}
	
	@Test
	public void checkList() {
	List l=test.someList();
	assertNotNull(l);
	}

}
