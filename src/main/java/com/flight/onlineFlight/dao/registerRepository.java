package com.flight.onlineFlight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.onlineFlight.entity.passengerModel;
@Repository
public interface registerRepository extends JpaRepository<passengerModel, Integer>{
passengerModel findByUsernameAndPass(String username,String pass);
	
}
