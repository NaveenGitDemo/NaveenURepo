package com.nit.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nit.coustom.EmployeeNotfoundException;
import com.nit.model.ErrorType;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(EmployeeNotfoundException.class)
	@ResponseBody
	public ResponseEntity<ErrorType> handleEmpNotfoundEx(EmployeeNotfoundException ex){
		
		return new ResponseEntity<ErrorType>(new ErrorType(ex.Message, "NO_EMP_FOUND","Data not found for given Id", "Employee", ex.id),
				HttpStatus.BAD_REQUEST
				);
	}
}
