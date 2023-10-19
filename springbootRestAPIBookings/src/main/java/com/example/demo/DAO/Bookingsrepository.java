package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bookings;
@Repository
public interface Bookingsrepository extends JpaRepository<Bookings,String>{

}
