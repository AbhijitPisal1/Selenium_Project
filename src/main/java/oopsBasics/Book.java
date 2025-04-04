package oopsBasics;

/**
 * Represents a Book that can be both printed and read. It implements the
 * Printable and Readable interfaces.
 */
public class Book implements Printable, Readable {

	/**
	 * Prints a message indicating the book has been printed.
	 */
	public void print() {
		System.out.println("Book is printed");
	}

	/**
	 * A test method that displays a message.
	 */
	public void testMethod() {
		System.out.println("This is a test method");
	}

	/**
	 * Displays a message indicating the book has been read.
	 */
	public void read() {
		System.out.println("The book is read");
	}
}