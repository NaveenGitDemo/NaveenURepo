package com.nit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSycurityApplication {

	 User user;
	@Autowired
	 UserRepository userRepository;
	@PostConstruct
	public void saveEntity() {
		user = new User(1, "naveen", "Manisha");
		userRepository.save(user);
		System.out.println("entity saved ");
	}
	public static void main(String[] args) {
	
		SpringApplication.run(SpringBootSycurityApplication.class, args);
		
		
	}

}
