package com.nivi.Login.controller;

import com.nivi.Login.model.TravelBooking;
import com.nivi.Login.service.TravelBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/travel")
public class TravelBookingController {

    @Autowired
    private TravelBookingService service;

    @PostMapping("/book")
    public String bookTrip(@RequestBody TravelBooking booking){

        service.saveBooking(booking);

        return "Trip Booked Successfully";
    }

    @GetMapping("/all")
    public List<TravelBooking> getBookings(){

        return service.getAllBookings();
    }
}