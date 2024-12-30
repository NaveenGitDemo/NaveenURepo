package com.Dao;

import com.exception.demo.TooYoungException;

public class TooYoungExceptionDao {
	
public boolean isChance(int age) {
		
		if(age>60) {
			
			throw new TooYoungException("No chance for you as of now you because you are old ");
			
		}
		else {
			return true;
		}
		
	}
	
	

}
