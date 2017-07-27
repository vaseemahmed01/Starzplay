package com.starzplay.model;

public class MovieEntry {
	
	int id;
	String greetings;
		
	public MovieEntry(int id, String greetings) {
		super();
		this.id = id;
		this.greetings = greetings;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	

}
