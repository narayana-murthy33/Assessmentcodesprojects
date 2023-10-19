package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Booking;
@Repository
public interface Bookingrepository extends JpaRepository<Booking,String>{

}
