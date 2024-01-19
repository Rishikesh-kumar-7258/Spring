package com.springboot.cvproject.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.cvproject.modals.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("rishi", "abc@gmail.com", "abcd"));
		
		return users;
	}
	
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable("username") String username) {
		return new User(username, "email", "password");
	}
	
	
	
}
