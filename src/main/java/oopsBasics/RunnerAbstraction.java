package oopsBasics;

/**
 * The RunnerAbstraction class contains the main method that serves as the entry
 * point for the application. This class demonstrates the instantiation and
 * usage of the Bike class, which inherits functionalities from the Vehicle
 * class.
 */
public class RunnerAbstraction {
	/**
	 * The main method executed when the program runs. It creates an instance of the
	 * Bike class and demonstrates the usage of its methods.
	 *
	 * @param args Command-line arguments that can be passed to the program (not
	 *             used).
	 */
	public static void main(String[] args) {
		// Create an instance of the Bike class with a specified name and speed
		oopsBasics.Bike b2 = new oopsBasics.Bike("SuperBike", 100);

		// Display the bike's details (name and speed)
		b2.ShowBike();

		// Call the run method to simulate the bike running
		b2.run();

		// Call the testing method inherited from the Vehicle class
		b2.testing();
		// The testing method is not part of the Bike class
		// but is available as it is a data member of the Vehicle class
	}
}