package com.bankingsystem;

// Abstract class representing a user of the banking system. This class is extended by different user types like Admin and Customer.
public abstract class User {
	private String username;
	private String password;
	private String role;

	// Constructor to initialize user details
	public User(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	// Getters and Setters (Encapsulation)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	// Abstract method for user login functionality
	public abstract void login(String username, String password);
}

/**
 * Explanation: The User class is abstract, meaning it cannot be instantiated
 * directly. It serves as a base for user types like Admin and Customer. It
 * encapsulates user information and has an abstract method login, which must be
 * implemented by subclasses.
 */
