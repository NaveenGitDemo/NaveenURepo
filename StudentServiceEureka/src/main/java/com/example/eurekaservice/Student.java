package com.example.eurekaservice;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String studentName;
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAge=" + studentAge + ", studentRoll=" + studentRoll
				+ "]";
	}
	private String studentAge;
	private String studentRoll;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(String studentRoll) {
		this.studentRoll = studentRoll;
	}
}
