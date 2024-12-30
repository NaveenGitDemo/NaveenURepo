package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

	
}
