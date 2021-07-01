package com.nit;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String addressLine1;
	private String addressLine12;
	private String city;
	private String state;
	public int getAddId() {
		return addId;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addressLine1=" + addressLine1 + ", addressLine12=" + addressLine12
				+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine12() {
		return addressLine12;
	}
	public void setAddressLine12(String addressLine12) {
		this.addressLine12 = addressLine12;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String country;
	

}
