package com.tech1;

import java.util.List;

public class AccountRequest {

	private String accountNumber;
	private String accountName;
	private List<Address> addressinfon;
	public  String getAccountNumber() {
		return accountNumber;
	}
	public  void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public  String getAccountName() {
		return accountName;
	}
	public  void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public List<Address> getAddressinfon() {
		return addressinfon;
	}
	@Override
	public String toString() {
		return "AccountRequest [accountNumber=" + accountNumber + ", accountName=" + accountName + ", addressinfon="
				+ addressinfon + "]";
	}
	public  void setAddressinfon(List<Address> addressinfon) {
		this.addressinfon = addressinfon;
	}
	 
	
	
	
}
