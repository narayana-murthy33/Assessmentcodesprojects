package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:3000/")

@RestController
public class Controller1 {
	@Autowired
	Reposit1 reposit1;
	@PostMapping("/insert")
	public void test(@RequestBody Post post) {
		reposit1.save(post);
		
	}
	@GetMapping("/get")
	public List<Post> test1() {
		return reposit1.findAll();
		
		

		
	}

}
