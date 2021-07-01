package com.exception.demo;

public class TooOldException extends Exception {
	String msg;
	public TooOldException(String s) {
		//super(s);
		msg=s;
	}

}
