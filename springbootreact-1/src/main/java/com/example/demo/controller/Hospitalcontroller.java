package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hospital;
import com.example.demo.service.Hospitalservice;

@RestController
public class Hospitalcontroller {
	@Autowired
	Hospitalservice hospitalservice;
	
	@GetMapping("/getusers")
	public List<Hospital> getusers(){
		return  hospitalservice.getusers();
	}

}
