package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.AcccountRequest;

@Repository
public interface AccountRequestRepo extends JpaRepository<AcccountRequest, Integer> {

}
