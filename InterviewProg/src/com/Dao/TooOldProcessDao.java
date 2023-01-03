package com.Dao;

import com.exception.demo.TooOldException;

public class TooOldProcessDao {

	
private Integer age;
	
	public void getAge(Integer age)throws TooOldException {
		
		this.age=age;
		
		if(age<30) {
			throw new TooOldException("no chance");
		}
		
	}
	
}
