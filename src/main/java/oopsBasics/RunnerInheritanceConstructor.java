package oopsBasics;

/**
 * Main class to demonstrate constructor concepts with InheritanceEmployee
 * class.
 */
public class RunnerInheritanceConstructor {
	public static void main(String[] args) {
		// Creating objects of InheritanceEmployee and printing their details
		InheritanceEmployee employee1 = new InheritanceEmployee("Mike", "QA", 300);
		employee1.printEmployee();

		InheritanceEmployee employee2 = new InheritanceEmployee("John", "IT", 700);
		employee2.printEmployee();
	}
}