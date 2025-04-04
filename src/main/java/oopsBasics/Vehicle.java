package oopsBasics;

/**
 * Abstract class representing a Vehicle. Contains an abstract method and a
 * non-abstract method.
 */
public abstract class Vehicle {
	// Name of the vehicle
	protected String name;

	/**
	 * Constructor for Vehicle class.
	 * 
	 * @param name Name of the vehicle.
	 */
	public Vehicle(String name) {
		this.name = name; // Initializing vehicle name
	}

	/**
	 * Abstract method for running the vehicle.
	 */
	public abstract void run();

	/**
	 * Non-abstract method that performs a test action.
	 */
	public void testing() {
		System.out.println("This is a non-abstract method of abstract class");
	}
}