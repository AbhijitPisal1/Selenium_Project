package project.employeemanagementsystem;

public class Developer extends Employee {
    private double overtimePay;

    // Constructor for Developer (inherits from Employee)
    public Developer(String name, String employeeId, double baseSalary, double overtimePay) {
        super(name, employeeId, baseSalary); // Call Employee constructor
        this.overtimePay = overtimePay;
    }

    // Overriding calculateSalary method to include overtime pay for developers (polymorphism)
    @Override
    public double calculateSalary() {
        return getBaseSalary() + overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }
}
