package com.springboot.cvproject.modals;

public class User {
	private String username;
	private String email;
	private String password;
	
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	
	public boolean equals(Object o) {
		if (o instanceof User) {
			User user = (User)o;
			return this.email == user.email;
		}
		
		return false;
	}
	

}
