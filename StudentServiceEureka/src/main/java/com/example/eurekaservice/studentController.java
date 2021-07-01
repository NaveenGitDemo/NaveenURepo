package com.example.eurekaservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	
	@Autowired
	Student student;
	
	@GetMapping("/getstDetails")
	public Student getStudentDetails() {
		
		student.setStudentName("Krishn");
		student.setStudentAge("24");
		student.setStudentRoll("101");
		
		return student;
	}
	
}
