package com.arjoo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInformationApplication.class, args);
	}

}
