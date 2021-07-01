package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.AcccountRequest;
import com.nit.repository.AccountRequestRepo;

@Service
public class AccountServiceReq {

	
	@Autowired
	AccountRequestRepo accountRequestRepo;
	public AcccountRequest saveAccountInfo(AcccountRequest acReq) {
		String accno=null; 
		int max = 10;
        int min = 1;
        int range = max - min + 1;
		acReq.getAccountName();
		accno =acReq.getAccountNumber();
		
	       int number = (int)(Math.random() * range)+ min;
	                  accno="L10"+String.valueOf(number);
	                  acReq.setAccountNumber(accno);
	               AcccountRequest accresp   =accountRequestRepo.save(acReq);
		return accresp;
		
	}
}
