package oopsBasics;

/**
 * Main class to demonstrate encapsulation using Employee class.
 */
public class RunnerEncapsulation {
	public static void main(String[] args) {
		Employee employee = new Employee(); // Create a new Employee object
		employee.setName("John"); // Set the employee's name
		String name = employee.getName(); // Get the employee's name
		System.out.println("Employee Name: " + name); // Display the employee's name
	}
}