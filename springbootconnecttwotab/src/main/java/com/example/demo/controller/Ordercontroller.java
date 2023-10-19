package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Costumer;
import com.example.demo.entity.Product;
import com.example.demo.repository.Customerrepository;
import com.example.demo.repository.Productrepository;

@RestController
public class Ordercontroller {
	@Autowired
	private Customerrepository customerrepository;
	
	@Autowired
	private Productrepository productrepository;
	
	@PostMapping("/placeorder")
	public Costumer placeorder(@RequestBody Costumer costumer ) {
		return customerrepository.save(costumer);
	}
	@GetMapping("/findallorders")
	public List<Costumer> findall(){
		return  customerrepository.findAll();
	}

}
