package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.BookingDTO;
import com.example.demo.DTO.BookingsDTO;
import com.example.demo.service.Bookingservice;
import com.example.demo.service.Bookingserviceimpl;
import com.example.demo.service.Bookingsservice;

@RestController
public class Controller {
	
@Autowired
Bookingsservice bookingsservice;
	
	
	@PutMapping("/put-user")
	public void putuser(@RequestBody BookingsDTO bookingsdto) {
		 bookingsservice.save(bookingsdto);
		
		
	}
	
	

}
