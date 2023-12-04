package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	
	public Person(String name, int personId) {
		this.name = name;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + "]";
	}
	
	
}
