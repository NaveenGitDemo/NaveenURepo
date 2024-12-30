package com.tech1;

import java.io.Serializable;

public class Address implements Serializable {

	private String addressLine1;
	private String addressLine12;
	private String city;
	private String state;
	private String country;
	public  String getAddressLine1() {
		return addressLine1;
	}
	//@Override
	/*
	 * public String toString() { return "Address [addressLine1=" + addressLine1 +
	 * ", addressLine12=" + addressLine12 + ", city=" + city + ", state=" + state +
	 * ", country=" + country + "]"; }
	 */
	public  void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public  String getAddressLine12() {
		return addressLine12;
	}
	public  void setAddressLine12(String addressLine12) {
		this.addressLine12 = addressLine12;
	}
	public  String getCity() {
		return city;
	}
	public  void setCity(String city) {
		this.city = city;
	}
	public  String getState() {
		return state;
	}
	public  void setState(String state) {
		this.state = state;
	}
	public  String getCountry() {
		return country;
	}
	public  void setCountry(String country) {
		this.country = country;
	}
	
   public String toString1() {
	   
	   StringBuilder builder=new StringBuilder();
	   builder.append("Address[addressLine1=");
	   builder.append("addressLine1");
	   builder.append(",addressLine12=");
	   builder.append("addressLine12");
	   builder.append(",city=");
	   builder.append("city");
	   builder.append(",state=");
	   builder.append("state");
	   builder.append(",country=");
	   builder.append("country");
	   
	   return builder.toString();
   }
	
	
}
