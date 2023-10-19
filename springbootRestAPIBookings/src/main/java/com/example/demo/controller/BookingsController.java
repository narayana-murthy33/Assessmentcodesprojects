package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.DTO.BookingsDTO;
import com.example.demo.service.Bookingsservice;

public class BookingsController {
	@Autowired
	Bookingsservice bookingsservice;
	
	
	@PostMapping("/create-user")
	public void putuser(@RequestBody BookingsDTO bookingsdto) {
		bookingsservice.save(bookingsdto);
		
		
	}

}
