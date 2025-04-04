package oopsBasics;

/**
 * Represents a bike, which is a type of vehicle with specific characteristics
 * and functionality. The Bike class extends the Vehicle class and includes
 * attributes and methods specific to a bike.
 */
public class Bike extends Vehicle {

	// Speed of the bike
	int speed;

	/**
	 * Constructor to create a Bike object with a name and speed.
	 *
	 * @param n  The name of the bike.
	 * @param sp The speed of the bike.
	 */
	public Bike(String n, int sp) {
		super(n); // Calls the constructor of the Vehicle class
		speed = sp; // Initializes the speed of the bike
	}

	/**
	 * Method to simulate the bike running. This method prints a message indicating
	 * that the bike is in motion.
	 */
	public void run() {
		System.out.println("Bike is Running");
	}

	/**
	 * Displays the details of the bike, including its name and speed. This method
	 * prints the name inherited from the Vehicle class and the speed of the bike.
	 */
	public void ShowBike() {
		System.out.println(name); // Displays the name of the bike
		System.out.println("Speed of bike is " + speed); // Displays the speed
	}
}