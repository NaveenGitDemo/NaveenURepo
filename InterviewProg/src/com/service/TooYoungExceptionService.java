package com.service;

import com.Dao.TooYoungExceptionDao;
import com.exception.demo.TooYoungException;

public class TooYoungExceptionService {
	
	
	public boolean isChance(int age) {
		
		TooYoungExceptionDao dao=new TooYoungExceptionDao();
		  
		if(dao.isChance(age))
		{
			return true;
		}
			return false;
	}
	

}
