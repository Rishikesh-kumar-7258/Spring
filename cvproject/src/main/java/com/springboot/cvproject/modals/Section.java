package com.springboot.cvproject.modals;

import java.util.concurrent.atomic.AtomicInteger;

public class Section {
	private static final AtomicInteger counter = new AtomicInteger();
	
	private final int id;
	private String name;
	
	public Section(String name) {
		super();
		this.id = Section.counter.getAndIncrement();
		this.name = name;
	}
	
	public int hashCode() {
		return id;
	}
	
	
	public boolean equals(Object o) {
		if (o instanceof Section) {
			Section sec = (Section)o;
			return sec.id == this.id;
		}
		
		return false;
	}
	
	
}
