package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Nani;
import com.example.demo.service.Userservice;


@RestController
public class Nanicontroller {
	@Autowired
	Userservice userservice;
	
	@PostMapping("/create-user")
	public void createuser(@RequestBody UserDTO userdto) {
		userservice.save(userdto);
		
	}
	@GetMapping("/get-user")
	public UserDTO getuser() {
		System.out.println();
		
		return userservice.getUser();
	}
		
	@GetMapping("/get-user/{id}")
	public UserDTO getuser(@PathVariable String id) {
		System.out.println("id"+id);
		
		return userservice.getUser(id);
		
	}
	@PutMapping("/update-user")
	public void updateuser() {
		
		
		
	}
	@DeleteMapping("/delete-user")
	public void deleteuser() {
		userservice.deleteuser();
		
	}

}
