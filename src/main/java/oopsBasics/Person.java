package oopsBasics;

/**
 * Represents a person with basic attributes such as name, age, and address.
 * This class serves as a base class that can be extended to demonstrate the
 * concept of inheritance in object-oriented programming.
 */
public class Person {
	String name; // Default access: Name of the person
	int Age; // Default access: Age of the person
	String address; // Default access: Address of the person

	/**
	 * Constructor to create a Person object with specified name, age, and address.
	 *
	 * @param n   The name of the person.
	 * @param a   The age of the person.
	 * @param add The address of the person.
	 */
	public Person(String n, int a, String add) {
		name = n; // Initializes the name of the person
		Age = a; // Initializes the age of the person
		address = add; // Initializes the address of the person
	}

	/**
	 * Prints the details of the person, including name, age, and address. This
	 * method outputs the person's information to the console.
	 */
	public void printPerson() {
		System.out.println(name); // Print the name of the person
		System.out.println(Age); // Print the age of the person
		System.out.println(address); // Print the address of the person
	}
}