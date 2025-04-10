package com.studentmanagement;

// Teacher class inherits from the Person class (not shown) to use basic attributes like name and id.
// Inheritance allows us to extend functionality without repeating code.

public class Teacher extends Person {
	private String subject;

	// Constructor to initialize teacher details, inherited name and id from Person
	// class
	public Teacher(String name, int id, String subject) {
		super(name, id); // Using super() to call the parent class constructor
		this.subject = subject;
	}

	// Getter and Setter (Encapsulation)
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// Method to display teacher details
	public void displayTeacherDetails() {
        System.out.println("Teacher Name: " + getName());
        System.out.println("Teacher ID: " + getId());
        System.out.println("Teaching Subject: " + subject);
    }
}

/**
 * Explanation: The Teacher class inherits from a hypothetical Person class (not
 * shown in this file) that contains basic attributes like name and ID. This
 * demonstrates Inheritance, and Encapsulation is used for the subject field.
 */