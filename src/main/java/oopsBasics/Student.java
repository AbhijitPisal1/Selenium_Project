package oopsBasics;

/**
 * The Student class represents a student with additional attributes specific to
 * their academic details, such as course name and fees. This class extends the
 * Person class to inherit general attributes like name, age, and address.
 */
public class Student extends Person {
	String courseName; // The name of the course the student is enrolled in
	int fees; // The fees associated with the course

	/**
	 * Constructor to create a Student object with specified attributes.
	 *
	 * @param name       The name of the student.
	 * @param age        The age of the student.
	 * @param address    The address of the student.
	 * @param courseName The name of the course the student is enrolled in.
	 * @param fees       The fees for the course.
	 */
	public Student(String name, int age, String address, String courseName, int fees) {
		super(name, age, address); // Call to the parent Person constructor
		this.courseName = courseName; // Initialize the course name
		this.fees = fees; // Initialize the course fees
	}

	/**
	 * Prints the details of the student, including inherited and unique attributes.
	 * This method outputs the student's information to the console.
	 */
	public void printStudent() {
		// Directly accessing inherited attributes from the Person class
		System.out.println("Student Name: " + name);
		System.out.println("Age: " + Age);
		System.out.println("Address: " + address);
		System.out.println("Course Name: " + courseName);
		System.out.println("Fees: " + fees);
	}
}