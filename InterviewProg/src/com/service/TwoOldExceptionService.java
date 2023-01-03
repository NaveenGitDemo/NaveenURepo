package com.service;

import com.Dao.TooOldProcessDao;
import com.exception.demo.TooOldException;

public class TwoOldExceptionService {
	
	//private Integer age;
	
	public void getAge(Integer age)throws TooOldException {
		
		TooOldProcessDao t=new TooOldProcessDao();
		
		t.getAge(age);
		
		
	}

}
