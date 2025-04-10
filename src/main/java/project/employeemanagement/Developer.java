package project.employeemanagement;

/**
 * The Developer class extends Employee and implements EmployeeActions.
 * It provides specific implementations for calculating salary and assigning tasks (if applicable).
 */
public class Developer extends Employee implements EmployeeActions {

    // Constructor calling the parent class constructor
    public Developer(String name, int age, String position, String department) {
        super(name, age, position, department); // Call to parent constructor
    }

    // Implementing calculateSalary from EmployeeActions interface
    @Override
    public double calculateSalary() {
        return 4000; // Developer's salary
    }

    // Implementing assignTask from EmployeeActions interface (not applicable for developers)
    @Override
    public void assignTask() {
        System.out.println("This task assignment is not applicable to developers.");
    }

    // Developer-specific method
    public void writeCode() {
        System.out.println("Writing code for the project.");
    }

    // Overriding showEmployeeDetails to include Developer-specific details
    @Override
    public void showEmployeeDetails() {
        super.showEmployeeDetails();  // Call to parent method
        System.out.println("Role: Developer");
    }
}
