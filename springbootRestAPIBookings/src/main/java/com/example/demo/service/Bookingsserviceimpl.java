package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.Bookingsrepository;
import com.example.demo.DTO.BookingsDTO;
import com.example.demo.entity.Bookings;

@Service
public class Bookingsserviceimpl implements Bookingsservice{
	@Autowired
	Bookingsrepository bookingsrepository;

	@Override
	public void save(BookingsDTO bookingsdto) {
		// TODO Auto-generated method stub
		Bookings u=new Bookings();
		BeanUtils.copyProperties(bookingsdto,u);
		 bookingsrepository.save(u);
		
		
	}

}
