package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.Bookingrepository;
import com.example.demo.DTO.BookingDTO;
import com.example.demo.entity.Booking;

@Service
public class Bookingserviceimpl implements Bookingservice {
	@Autowired
	Bookingrepository bookingrepository;

	@Override
	public void save(BookingDTO bookingdto) {
		// TODO Auto-generated method stub
		Booking b=new Booking ();
		BeanUtils.copyProperties(bookingdto,b);
		bookingrepository.save(b);
			
		
		
	}

	public BookingDTO getuser() {
		// TODO Auto-generated method stub
		BookingDTO bookingdto=new BookingDTO();
		String id="gundabattulateja@gmail.com";
	Booking booking=bookingrepository.findById(id).get();
		BeanUtils.copyProperties(booking,bookingdto);
		return bookingdto;
		
	}

	public BookingDTO getuser(String id) {
		// TODO Auto-generated method stub
		BookingDTO bookingdto=new BookingDTO();
	
	Booking booking=bookingrepository.findById(id).get();
		BeanUtils.copyProperties(booking,bookingdto);
		return bookingdto;
	}

}
