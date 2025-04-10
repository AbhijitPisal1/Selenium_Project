package com.studentmanagement;

// Base class representing a person with common attributes for Teacher and Student.
// This demonstrates inheritance as both Teacher and Student will extend from this class.

public class Person {
	private String name;
	private int id;

	// Constructor to initialize person details
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Getters and Setters (Encapsulation)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

/**
 * Explanation: The Person class provides common attributes for both Teacher and
 * Student. This demonstrates Inheritance as Teacher and Student classes extend
 * it.
 */