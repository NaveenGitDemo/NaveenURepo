package com.Dao;

import com.exception.demo.TooOldException;

public class TooOldProcess {

	
private Integer age;
	
	public void getAge(Integer age)throws TooOldException {
		
		this.age=age;
		
		if(age<21) {
			throw new TooOldException("no chance");
		}
		else {
			System.out.println("chance is there");
		}
		
	}
	
}
