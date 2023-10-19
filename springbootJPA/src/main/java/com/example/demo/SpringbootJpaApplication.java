package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;

@SpringBootApplication
public class SpringbootJpaApplication {
	
	

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationcontext=SpringApplication.run(SpringbootJpaApplication.class, args);
		/*User user=new User(4,"satya","200");
		UserRepository userRepository=applicationcontext.getBean("userRepository",UserRepository.class);
		 User u =userRepository.save(user);
		 System.out.println(u);*/
		UserRepository userRepository=applicationcontext.getBean("userRepository",UserRepository.class);
		List<User> h=userRepository.findAll();
		System.out.println(h);
		userRepository.deleteById(2);
		
		
		
		
	}

}
