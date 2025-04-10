package project.hotelreservationsystem;

// Abstract class representing a general Room type. This will serve as a base for specific room types.
public abstract class Room {
	private int roomNumber;
	private boolean isAvailable;
	private double pricePerNight;

	// Constructor to initialize room details
	public Room(int roomNumber, boolean isAvailable, double pricePerNight) {
		this.roomNumber = roomNumber;
		this.isAvailable = isAvailable;
		this.pricePerNight = pricePerNight;
	}

	// Getters and Setters (Encapsulation)
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	// Abstract method to display room details
	public abstract void displayRoomDetails();
}

/**
 * Explanation: The Room class is abstract, meaning it provides general
 * functionality but cannot be instantiated directly. It provides basic
 * attributes like roomNumber, isAvailable, and pricePerNight, and it includes
 * an abstract method displayRoomDetails() which will be implemented in the
 * subclasses (SingleRoom, DoubleRoom). It also uses Encapsulation to protect
 * the attributes.
 */