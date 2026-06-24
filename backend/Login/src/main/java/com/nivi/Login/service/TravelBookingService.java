package com.nivi.Login.service;

import com.nivi.Login.model.TravelBooking;
import com.nivi.Login.respository.TravelBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelBookingService {

    @Autowired
    private TravelBookingRepo repo;

    public void saveBooking(TravelBooking booking){
        repo.save(booking);
    }

    public List<TravelBooking> getAllBookings(){
        return repo.findAll();
    }
}