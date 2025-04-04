package oopsBasics;

/**
 * Main class to demonstrate the functionality of the Book class implementing
 * interfaces.
 */
public class RunnerInterface {
	public static void main(String[] args) {
		Book book = new Book(); // Create a new Book object
		book.print(); // Call print method
		book.testMethod(); // Call test method
		book.read(); // Call read method

		// Display the constant values from Printable interface
		System.out.println("Interface name: " + Printable.NAME);
		System.out.println("Interface address: " + Printable.ADDRESS);
	}
}