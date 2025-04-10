package project.employeemanagement;

/**
 * Demonstrates inheritance by creating Manager and Developer objects and calling their methods.
 */
public class ManagerRunner {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 35, "Manager", "Sales");
        mgr.showEmployeeDetails();
        mgr.assignTask();

        Developer dev = new Developer("Bob", 28, "Developer", "IT");
        dev.showEmployeeDetails();
        dev.writeCode();
    }
}

/**
 * Expected Output :
 * Name: Alice
 * Age: 35
 * Position: Manager
 * Department: Sales
 * Role: Manager
 * Assigning tasks to the team.
 * Name: Bob
 * Age: 28
 * Position: Developer
 * Department: IT
 * Role: Developer
 * Writing code for the project.
 */