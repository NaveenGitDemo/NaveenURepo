package com.nit;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Account_Tab")
public class AcccountRequest implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String accountNumber;
	private String accountName;
	@OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
	@JoinColumn(name="ac_reqIdFK" , referencedColumnName = "id" )
	private List<Address> addressinfon;
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "AcccountRequest [id=" + id + ", accountNumber=" + accountNumber + ", accountName=" + accountName
				+ ", addressinfon=" + addressinfon + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public List<Address> getAddressinfon() {
		return addressinfon;
	}
	public void setAddressinfon(List<Address> addressinfon) {
		this.addressinfon = addressinfon;
	}
	
	
	
}
