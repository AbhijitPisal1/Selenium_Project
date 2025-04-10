package project.hotelreservationsystem;

// This class represents a Single Room. It inherits from the Room class.
public class SingleRoom extends Room {

	// Constructor to initialize Single Room details
	public SingleRoom(int roomNumber, boolean isAvailable, double pricePerNight) {
		super(roomNumber, isAvailable, pricePerNight); // Calls the parent class constructor
	}

	// Implementing the abstract method to display room details (Polymorphism)
	@Override
	public void displayRoomDetails() {
		System.out.println("Single Room Number: " + getRoomNumber());
		System.out.println("Availability: " + (isAvailable() ? "Available" : "Not Available"));
		System.out.println("Price per Night: $" + getPricePerNight());
	}
}

/**
 * Explanation: The SingleRoom class extends the Room class, inheriting its
 * properties and methods. It implements the displayRoomDetails() method, which
 * is polymorphic behavior where each subclass of Room will have its own
 * implementation of this method. Encapsulation is used to protect the room
 * details.
 */
