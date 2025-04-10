package employeemanagement;

/**
 * Payroll class demonstrates method overloading and overriding.
 * It calculates payroll based on employee type.
 */
public class Payroll {

    // Method Overloading: For calculating salary of different types of employees
    public double calculateSalary(Employee employee) {
        return 3000; // Default salary for a basic employee
    }

    public double calculateSalary(Manager manager) {
        return 5000; // Salary specific to managers
    }

    public double calculateSalary(Developer developer) {
        return 4000; // Salary specific to developers
    }
    
    // Method Overriding: Calculate specific payroll for different roles
    public double calculateBonus(Employee employee) {
        return 1000; // Base bonus for all employees
    }

    public double calculateBonus(Manager manager) {
        return 1500; // Bonus for managers
    }

    public double calculateBonus(Developer developer) {
        return 1200; // Bonus for developers
    }
}
