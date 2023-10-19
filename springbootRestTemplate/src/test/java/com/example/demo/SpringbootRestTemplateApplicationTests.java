package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Nani;

@SpringBootTest
class SpringbootRestTemplateApplicationTests {

	@Test
	void contextLoads() {
		RestTemplate rt=new RestTemplate();
		UserDTO userdto=rt.getForObject("http://localhost:8080/get-user", UserDTO.class);
		System.out.println("success"+userdto);
	}

}
