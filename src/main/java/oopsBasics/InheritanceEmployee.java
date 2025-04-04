package oopsBasics;

/**
 * Represents an employee that demonstrates inheritance.
 */
public class InheritanceEmployee {
	// Employee's name
	private String employeeName;
	// Employee's department
	private String employeeDepartment;
	// Employee's salary
	private int salary;

	/**
	 * Constructor for InheritanceEmployee class.
	 * 
	 * @param name       The name of the employee.
	 * @param department The department of the employee.
	 * @param salary     The salary of the employee.
	 */
	public InheritanceEmployee(String name, String department, int salary) {
		this(); // Calls the no-argument constructor for chaining
		this.employeeName = name;
		this.employeeDepartment = department;
		this.salary = salary;
	}

	/**
	 * Default constructor that displays a message.
	 */
	public InheritanceEmployee() {
		System.out.println("No argument constructor got executed");
	}

	/**
	 * Prints employee information.
	 */
	public void printEmployee() {
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Department: " + employeeDepartment);
		System.out.println("Salary: " + salary);
	}
}