package com.nivi.Login.respository;

import com.nivi.Login.model.TravelBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelBookingRepo
        extends JpaRepository<TravelBooking,Integer> {
}