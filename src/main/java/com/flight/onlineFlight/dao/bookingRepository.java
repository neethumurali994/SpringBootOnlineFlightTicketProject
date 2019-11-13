package com.flight.onlineFlight.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.onlineFlight.entity.bookingconfirm;

@Repository
public interface bookingRepository extends JpaRepository<bookingconfirm, Integer> {

}
