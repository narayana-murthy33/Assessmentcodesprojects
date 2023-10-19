package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class Controller {
	
	@Autowired
	Reposit reposit;
	
	@PostMapping("/createuser")
	public  void m(@RequestBody Spring sp) {
		reposit.save(sp);
		
		
	}
	

}
