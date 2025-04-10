package project.employeemanagement;

/**
 * The Manager class extends Employee and implements EmployeeActions.
 * It provides specific implementations for calculating salary and assigning tasks.
 */
public class Manager extends Employee implements EmployeeActions {

    // Constructor calling the parent class constructor
    public Manager(String name, int age, String position, String department) {
        super(name, age, position, department); // Call the parent constructor
    }

    // Implementing calculateSalary from EmployeeActions interface
    @Override
    public double calculateSalary() {
        return 5000; // Manager's salary
    }

    // Implementing assignTask from EmployeeActions interface
    @Override
    public void assignTask() {
        System.out.println("Assigning tasks to the team.");
    }

    // Overriding showEmployeeDetails to include Manager-specific details
    @Override
    public void showEmployeeDetails() {
        super.showEmployeeDetails();  // Call to parent method
        System.out.println("Role: Manager");
    }
}
