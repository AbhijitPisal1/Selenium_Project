package employeemanagement;

/**
 * Demonstrates polymorphism by calculating payroll and bonuses for different employee types.
 */
public class PayrollRunner {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        Manager mgr = new Manager("Alice", 35, "Manager", "Sales");
        Developer dev = new Developer("Bob", 28, "Developer", "IT");

        System.out.println("Manager Salary: " + payroll.calculateSalary(mgr));
        System.out.println("Manager Bonus: " + payroll.calculateBonus(mgr));

        System.out.println("\nDeveloper Salary: " + payroll.calculateSalary(dev));
        System.out.println("Developer Bonus: " + payroll.calculateBonus(dev));
    }
}

/**
 * Manager Salary: 5000.0
 * Manager Bonus: 1500.0
 * 
 * Developer Salary: 4000.0
 * Developer Bonus: 1200.0
*/
