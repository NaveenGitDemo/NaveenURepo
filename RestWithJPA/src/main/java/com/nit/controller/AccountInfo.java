package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.AcccountRequest;
import com.nit.Address;
import com.nit.service.AccountServiceReq;
import com.nit.service.AddressService;

@RestController
public class AccountInfo {

	@Autowired
	AccountServiceReq accountServiceReq;
	@PostMapping("/saveAccountInfo")
	public ResponseEntity<AcccountRequest> saveAccountInfo(@RequestBody AcccountRequest acReq){
		
		acReq.getAccountName();
		acReq.getAccountNumber();
		acReq.getAddressinfon();
		
	   AcccountRequest resp     =accountServiceReq.saveAccountInfo(acReq);
		
		return  ResponseEntity.ok(resp);
	}
	
	@Autowired
	AddressService addressService;
	@DeleteMapping("/deleteById/{addId}")
	public ResponseEntity<Address> deleteAddress(@PathVariable int addId){
		
	Address address	=addressService.deleteAddress(addId);
		return ResponseEntity.ok(address);
	}
}
