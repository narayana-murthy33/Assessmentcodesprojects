package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hospital;
import com.example.demo.service.Hospitalservice;
@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class Hospitalcontroller {
	@Autowired
	Hospitalservice hospitalservice;
	
	@GetMapping("/getusers")
	public List<Hospital> getusers(){
		return  hospitalservice.getusers();
	}
	@PostMapping("/insertuser")
	public void insertuser(@RequestBody Hospital hospital) {
		hospitalservice.insertuser(hospital);
		
		
	}
	@PutMapping("/updateuser")
	public void updatetuser(@RequestBody Hospital hospital) {
		hospitalservice.updateuser(hospital);
		
		
	}
	@DeleteMapping("/deleteuser/{id}")
	public void deleteuser(@PathVariable int id) {
		hospitalservice.deleteuser(id);
		
		
	}
	@GetMapping("/getuser/{id}")
	public Hospital getuser(@PathVariable int id) {
		return  hospitalservice.getuser(id);
	}
	

}
