package com.arjoo.microservices.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arjoo.microservices.model.User;

@RestController
@RequestMapping("/user")
public class UserInformationController {

	@RequestMapping("/{userId}")
	public User getUser(@PathVariable("userId") String userId) {
		System.out.println("UserId : " + userId);
		return new User(userId, "Name-"+ userId);
	}
	
}
