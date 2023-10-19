package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hospital;
import com.example.demo.repository.Hospitalrepository;

@Service
public class Hospitalservice {
	
	@Autowired
	Hospitalrepository hospitalrepository;

	public List<Hospital> getusers() {
		// TODO Auto-generated method stub
		List<Hospital> hospital=hospitalrepository.findAll();
		return  hospital;
	}

	

}
