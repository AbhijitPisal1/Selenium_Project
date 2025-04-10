package project.employeemanagement;

/**
 * This runner demonstrates the use of the EmployeeActions interface.
 * It shows how different types of employees (Manager and Developer) implement the EmployeeActions interface.
 */
public class EmployeeActionsRunner {
    public static void main(String[] args) {
        // Creating Manager and Developer objects
        Manager mgr1 = new Manager("Alice", 35, "Manager", "Sales");
        Developer dev1 = new Developer("Bob", 28, "Developer", "IT");

        // Demonstrating polymorphism through interface methods
        System.out.println("Manager Salary: " + mgr1.calculateSalary());
        mgr1.assignTask();

        System.out.println("\nDeveloper Salary: " + dev1.calculateSalary());
        dev1.assignTask(); // This will show a message that it's not applicable to developers
    }
}

/**
 * Manager Salary: 5000.0
 * Assigning tasks to the team.
 * 
 * Developer Salary: 4000.0
 * This task assignment is not applicable to developers.
*/