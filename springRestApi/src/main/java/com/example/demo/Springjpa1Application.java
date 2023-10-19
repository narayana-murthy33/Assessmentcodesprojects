package com.example.demo;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.Userrepository;
import com.example.demo.entity.Nani;



@SpringBootApplication
public class Springjpa1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=SpringApplication.run(Springjpa1Application.class, args);
		//Nani nani=new Nani("swathi@gmail.com","swathi");
		Userrepository userrepository=context.getBean("userrepository",Userrepository.class);
		//Nani save=userrepository.save(nani);
		//System.out.println(save);
		//List<Nani> all=userrepository.findAll();
		//for(Nani temp: all) {
			//System.out.println(temp.getPassword());
	//	}
		System.out.println("******"+ userrepository.findByEmailAndPassword("nanis.sundaraneedi7@gmail.com","nani345"));
	List<Nani> n= userrepository.findByEmailAndPassword("nanis.sundaraneedi7@gmail.com","nani345");
	for(Nani temp:n) {
		if(temp.getEmail().equals("nanis.sundaraneedi7@gmail.com")) {
			if(temp.getPassword().equals("nani345")) {
				System.out.println("all is well");
				
			}
		}
	}
		
		
	}}


