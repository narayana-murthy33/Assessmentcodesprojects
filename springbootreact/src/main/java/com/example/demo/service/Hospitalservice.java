package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	public void insertuser(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalrepository.save(hospital);
		
		
	}

	public void updateuser(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalrepository.save(hospital);
		
	}

	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		hospitalrepository.deleteById(id);
		
		
	}

	public Hospital getuser(int id) {
		// TODO Auto-generated method stub
		Hospital h=hospitalrepository.findById(id).get();
		if(h==null) {
		  throw new RuntimeException ("hiii") ;
		}
		return h; 
	}

	
	

}
