package project.employeemanagementsystem;

public abstract class Employee {
	private String name;
	private String employeeId;
	private double baseSalary;

	// Constructor to initialize common employee data
	public Employee(String name, String employeeId, double baseSalary) {
		this.name = name;
		this.employeeId = employeeId;
		this.baseSalary = baseSalary;
	}

	// Getters and Setters for encapsulation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// Abstract method to calculate salary for different employee types
	// (polymorphism)
	public abstract double calculateSalary();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", baseSalary=" + baseSalary + "]";
	}
}

/**
 * Explanation:
 * 
 * Abstraction: The Employee class is abstract, meaning it cannot be
 * instantiated directly and contains abstract methods like calculateSalary()
 * that must be implemented by subclasses.
 * 
 * Encapsulation: Private attributes name and id are accessed via getter and
 * setter methods, providing controlled access.
 * 
 * Polymorphism: The method calculateSalary() is abstract and can be implemented
 * differently in subclasses.
 */