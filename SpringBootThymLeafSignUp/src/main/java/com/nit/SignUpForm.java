package com.nit;

public class SignUpForm {

		@Override
	public String toString() {
		return "SignUpForm [firstName=" + firstName + ", lastName=" + lastName + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
		private String firstName;
		private String lastName;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
}
