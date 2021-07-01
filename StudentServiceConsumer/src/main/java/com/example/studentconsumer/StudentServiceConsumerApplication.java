package com.example.studentconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentServiceConsumerApplication {
	

	private static final Logger log = LoggerFactory.getLogger(StudentServiceConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceConsumerApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Student st = restTemplate.getForObject(
					"http://localhost:4040/getStudentDetails", Student.class);
			log.info(st.getId() + " student name is " + st.getName());
			//restTemplate.getForEntity(url, responseType, uriVariables)
			
		};
	}
}
