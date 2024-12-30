package com.tech1;

import java.util.List;

public class Policyinformation {

	private int policyNumber;
	@Override
	public String toString() {
		return "Policyinformation [policyNumber=" + policyNumber + ", insuredCity=" + insuredCity + ", add=" + add
				+ "]";
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getInsuredCity() {
		return insuredCity;
	}
	public void setInsuredCity(String insuredCity) {
		this.insuredCity = insuredCity;
	}
	public List<String> getAdd() {
		return add;
	}
	public void setAdd(List<String> add) {
		this.add = add;
	}
	private String insuredCity;
	private List<String> add;
}
