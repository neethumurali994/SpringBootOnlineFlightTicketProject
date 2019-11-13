package com.flight.onlineFlight.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.onlineFlight.entity.flightmodel;
@Repository
public interface flightRepository extends JpaRepository<flightmodel, Integer> {
	List<flightmodel> findByFromplaceAndDepartdAndToplace(String departure, String departureDate,String to);
flightmodel findById(int id);

}
