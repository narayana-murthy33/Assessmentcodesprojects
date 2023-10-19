package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootConfiguration
public class NamingServerEuApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerEuApplication.class, args);
	}

}
