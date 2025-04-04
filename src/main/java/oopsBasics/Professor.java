package oopsBasics;

/**
 * The Professor class represents a professor with additional attributes
 * specific to their employment, such as salary and years of experience. This
 * class extends the Person class to inherit general attributes such as name,
 * age, and address.
 */
public class Professor extends Person {
	int salary; // The salary of the professor
	int experience; // The years of experience the professor has

	/**
	 * Constructor to create a Professor object with specified attributes.
	 *
	 * @param name       The name of the professor.
	 * @param age        The age of the professor.
	 * @param address    The address of the professor.
	 * @param salary     The salary of the professor.
	 * @param experience The years of experience of the professor.
	 */
	public Professor(String name, int age, String address, int salary, int experience) {
		super(name, age, address); // Call to the parent Person constructor
		this.salary = salary; // Initialize the salary
		this.experience = experience; // Initialize the years of experience
	}

	/**
	 * Prints the details of the professor, including inherited and unique
	 * attributes. This method outputs the professor's information to the console.
	 */
	public void printProf() {
		// Directly accessing inherited attributes from the Person class
		System.out.println("Professor Name: " + name);
		System.out.println("Age: " + Age); // Changed from 'Age' to 'age' for consistency
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
		System.out.println("Experience: " + experience);
	}
}