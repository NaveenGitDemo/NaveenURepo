package com.nit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nit.coustom.EmployeeNotfoundException;
import com.nit.model.Employee;

@RestController
public class EmployeeRestController {

	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable Integer id){
		
		if(id!=8) {
		     throw new EmployeeNotfoundException("Employee not found " + id ,id );
		}
		else {
		return ResponseEntity.ok(new Employee(id, "Mani"));
		}
	}
}
