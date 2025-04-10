package project.hotelreservationsystem;

import java.util.Date;

// Abstract class representing a customer in the hotel system.
public abstract class Customer {
	private String name;
	private String email;

	// Constructor to initialize customer details
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Getters and Setters (Encapsulation)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Abstract method for customer booking a reservation
	public abstract void bookReservation(Room room, Date checkInDate, Date checkOutDate);
}

/**
 * Explanation: The Customer class is abstract and represents a customer in the
 * hotel system. It has basic attributes like name and email. The
 * bookReservation method is abstract, allowing different types of customers
 * (like Regular or VIP) to implement their own booking methods.
 */