package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nit.Address;
import com.nit.repository.AddressRepo;

@Service
public class AddressService {

	@Autowired
	AddressRepo addressRepo;
	public Address deleteAddress(int id) {
		
		Optional<Address> opp= addressRepo.findById(id);
		   Address address=(Address) opp.get();
		   System.out.println(address);
		   
		   // now deleting the entity 
		   addressRepo.delete(address);
		   System.out.println("entity deleted");
		return address;
		
	}
}
