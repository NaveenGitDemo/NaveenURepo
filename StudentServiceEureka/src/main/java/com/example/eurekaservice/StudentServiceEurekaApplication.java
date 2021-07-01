package com.example.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceEurekaApplication.class, args);
	}

}
