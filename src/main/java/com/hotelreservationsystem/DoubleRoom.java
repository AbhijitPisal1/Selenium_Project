package com.hotelreservationsystem;

// This class represents a Double Room. It inherits from the Room class.
public class DoubleRoom extends Room {

	// Constructor to initialize Double Room details
	public DoubleRoom(int roomNumber, boolean isAvailable, double pricePerNight) {
		super(roomNumber, isAvailable, pricePerNight); // Calls the parent class constructor
	}

	// Implementing the abstract method to display room details (Polymorphism)
	@Override
	public void displayRoomDetails() {
		System.out.println("Double Room Number: " + getRoomNumber());
		System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
		System.out.println("Price per Night: $" + getPricePerNight());
	}
}
/**
 * Explanation: The DoubleRoom class is similar to SingleRoom but represents a
 * different room type. It inherits the same methods and properties from the
 * Room class and provides its own implementation of the displayRoomDetails()
 * method, demonstrating Inheritance and Polymorphism.
 */
