package project.employeemanagementsystem;

public class Payroll {

    // Method to calculate and display the payroll for all employees
    public static void displayPayroll(Employee employee) {
        System.out.println(employee.getName() + "'s Salary: $" + employee.calculateSalary());
    }
}
