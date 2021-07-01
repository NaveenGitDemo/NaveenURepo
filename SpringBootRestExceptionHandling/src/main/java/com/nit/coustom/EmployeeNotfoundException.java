package com.nit.coustom;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*@ResponseStatus (code = HttpStatus.NOT_FOUND) */
public class EmployeeNotfoundException extends RuntimeException{

	/**
	 * 
	 */
	public String Message;
	public Integer id;
	private static final long serialVersionUID = 1L;
	public EmployeeNotfoundException() {
		super();
	}
	public EmployeeNotfoundException(String message , Integer id) {
		 
		this.Message=message;
		this.id=id;
		//super(message);
	}
}
