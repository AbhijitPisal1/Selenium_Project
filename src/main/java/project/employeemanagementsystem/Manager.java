package project.employeemanagementsystem;

public class Manager extends Employee {
    private double bonus;

    // Constructor for Manager (inherits from Employee)
    public Manager(String name, String employeeId, double baseSalary, double bonus) {
        super(name, employeeId, baseSalary); // Call Employee constructor
        this.bonus = bonus;
    }

    // Overriding calculateSalary method to include bonus for managers (polymorphism)
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
