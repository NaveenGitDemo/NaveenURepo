package com.service;

import com.Dao.TooOldProcess;
import com.exception.demo.TooOldException;

public class TwoOldExceptionService {
	
	//private Integer age;
	
	public void getAge(Integer age)throws TooOldException {
		
		TooOldProcess t=new TooOldProcess();
		
		t.getAge(age);
		
		
	}

}
